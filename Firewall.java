import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Firewall extends JFrame {

    private final List<String> allowedIPs = new ArrayList<>(
            Arrays.asList("192.168.1.1", "192.168.1.2", "192.168.1.5", "192.168.1.4"));

    private final List<Integer> allowedPorts = new ArrayList<>(Arrays.asList(80, 443, 8080, 8443));

    private JTextArea logArea;
    private DatagramSocket socket;
    private boolean listening = true;

    public Firewall() {
        setTitle("Firewall Packet Filter");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String iconPath = "src\\firewall2.png";
        ImageIcon icon = new ImageIcon(iconPath);


        setIconImage(icon.getImage());


        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.DARK_GRAY);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        logArea.setForeground(Color.WHITE);
        logArea.setBackground(Color.BLACK);
        logArea.setCaretColor(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(logArea);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(Color.DARK_GRAY);

        JButton startButton = new JButton("Start");
        startButton.setFocusable(false);
        startButton.setBackground(Color.GREEN);
        startButton.setForeground(Color.BLACK);

        JButton stopButton = new JButton("Stop");
        stopButton.setFocusable(false);
        stopButton.setBackground(Color.RED);
        stopButton.setForeground(Color.WHITE);

        JButton clearButton = new JButton("Clear");
        clearButton.setFocusable(false);
        clearButton.setBackground(Color.LIGHT_GRAY);
        clearButton.setForeground(Color.BLACK);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!listening) {
                    listening = true;
                    startListening();
                }
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listening = false;
                if (socket != null && !socket.isClosed()) {
                    socket.close();
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logArea.setText("");
            }
        });

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(clearButton);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);

        setVisible(true);

        startListening();
    }

    public boolean filterPacket(IPPacket ipPacket) {
        boolean isAllowedIP = allowedIPs.contains(ipPacket.getSourceIP());
        boolean isAllowedPort = allowedPorts.contains(ipPacket.getDestinationPort());

        log("Filtering packet from " + ipPacket.getSourceIP() + " to port " + ipPacket.getDestinationPort());
        log("Allowed IP: " + isAllowedIP + ", Allowed Port: " + isAllowedPort);

        return isAllowedIP && isAllowedPort;
    }

    public void startListening() {
        new Thread(() -> {
            try (DatagramSocket socket = new DatagramSocket(4445)) {
                this.socket = socket;
                byte[] buffer = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);

                while (listening) {
                    try {
                        socket.receive(datagramPacket);

                        if (datagramPacket.getLength() == 0) {
                            log("Received an empty packet, skipping...");
                            continue;
                        }

                        IPPacket parsedPacket = IPPacket.parsePacket(datagramPacket.getData(),
                                datagramPacket.getLength());
                        log("Received packet from " + parsedPacket.getSourceIP() + ":"
                                + parsedPacket.getDestinationPort());

                        if (filterPacket(parsedPacket)) {
                            log("Allowed packet from " + parsedPacket.getSourceIP() + ":"
                                    + parsedPacket.getDestinationPort());
                        } else {
                            log("Denied packet from " + parsedPacket.getSourceIP() + ":"
                                    + parsedPacket.getDestinationPort());
                        }
                        Arrays.fill(buffer, (byte) 0);
                    } catch (IOException e) {
                        if (!listening) {
                            log("Stopped listening for packets.");
                        } else {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void log(String message) {
        SwingUtilities.invokeLater(() -> logArea.append(message + "\n"));
    }

    public static void main(String[] args) {
        Firewall firewall = new Firewall();
    }
}

class IPPacket {
    private final String sourceIP;
    private final int destinationPort;

    public IPPacket(String sourceIP, int destinationPort) {
        this.sourceIP = sourceIP;
        this.destinationPort = destinationPort;
    }

    public static IPPacket parsePacket(byte[] data, int length) {
        ByteBuffer buffer = ByteBuffer.wrap(data, 0, length);

        byte[] ipBytes = new byte[4];
        buffer.get(ipBytes);
        String sourceIP = String.format("%d.%d.%d.%d", ipBytes[0] & 0xFF, ipBytes[1] & 0xFF, ipBytes[2] & 0xFF,
                ipBytes[3] & 0xFF);

        int destinationPort = buffer.getInt();

        return new IPPacket(sourceIP, destinationPort);
    }

    public String getSourceIP() {
        return sourceIP;
    }

    public int getDestinationPort() {
        return destinationPort;
    }
}
