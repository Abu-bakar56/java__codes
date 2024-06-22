import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;

class PacketSender {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");

////             Not allowed packet
//             String sourceIP = "192.168.1.3";
//             int destinationPort = 12345;


//          ALLowed packet
            String sourceIP = "192.168.1.1";
            int destinationPort = 80;

            byte[] ipBytes = new byte[4];
            String[] ipParts = sourceIP.split("\\.");
            for (int i = 0; i < 4; i++) {
                ipBytes[i] = (byte) Integer.parseInt(ipParts[i]);
            }

            byte[] portBytes = ByteBuffer.allocate(4).putInt(destinationPort).array();

            byte[] messageBytes = new byte[8];
            System.arraycopy(ipBytes, 0, messageBytes, 0, 4);
            System.arraycopy(portBytes, 0, messageBytes, 4, 4);

            DatagramPacket packet = new DatagramPacket(messageBytes, messageBytes.length, address, 4445);

            socket.send(packet);
            System.out.println("Packet sent from " + sourceIP + " to port " + destinationPort);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
