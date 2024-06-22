import javax.swing.*;
import java.awt.*;
class GUI1 extends JFrame {
    void flow_layout() {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("Flow Layout Window");
        jFrame.setSize(350, 190);
        jFrame.setLayout(new FlowLayout());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
        JButton button1, button2, button3, button4;


        button1 = new JButton("Button1");
        button1.setFocusable(false);
        jPanel.add(button1);
        jPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        button2 = new JButton("This is a Button");
        button2.setFocusable(false);
        jPanel.add(button2);
        jPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        button3 = new JButton("Button2");
        button3.setFocusable(false);
        jPanel.add(button3);
        button4 = new JButton("Execute");
        button4.setFocusable(false);
        jPanel1.add(button4);


        jFrame.add(jPanel, BorderLayout.NORTH);
        jFrame.add(jPanel1, BorderLayout.CENTER);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    JPanel getRow(JButton b1, JButton b2, JButton b3, JButton b4) {
        JPanel row = new JPanel();
        row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
        row.add(Box.createHorizontalGlue());
        row.add(b1);
        row.add(b2);
        row.add(b3);
        row.add(b4);
        row.add(Box.createHorizontalGlue());
        return row;
    }

    void calculator() {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("Calculator");
        jFrame.setSize(270, 260);
        jFrame.setLayout(new BorderLayout());


        JButton[] numbers = new JButton[10];
        JButton plus, minus, mult, div, equals, dot;

        for (int i = 0; i < 10; i++) {
            numbers[i] = new JButton(" " + i);
        }
        plus = new JButton("+");
        minus = new JButton("-");
        mult = new JButton("*");
        div = new JButton("/");
        equals = new JButton("=");
        dot = new JButton(".");


        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(4, 1));
        jPanel.add(getRow(numbers[7], numbers[8], numbers[9], mult));
        jPanel.add(getRow(numbers[4], numbers[5], numbers[6], div));
        jPanel.add(getRow(numbers[1], numbers[2], numbers[3], plus));
        jPanel.add(getRow(numbers[0], dot, equals, minus));

        jFrame.add(jPanel, BorderLayout.CENTER);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    void containor() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("JPanel is a Container");
        jFrame.setSize(400, 260);
        jFrame.setLayout(new BorderLayout());


        JButton button1 = new JButton("North ");
        JButton button2 = new JButton("West ");
        JButton button3 = new JButton("East ");
        JButton button4 = new JButton("South ");


        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 2));
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        jPanel.add(b1);
        jPanel.add(b2);
        jPanel.add(b3);
        jPanel.add(b4);


        jFrame.add(jPanel, BorderLayout.CENTER);
        jFrame.add(button1, BorderLayout.NORTH);
        jFrame.add(button2, BorderLayout.WEST);
        jFrame.add(button3, BorderLayout.EAST);
        jFrame.add(button4, BorderLayout.SOUTH);

        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void student_form() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Student Details Form");
        jFrame.setSize(600, 200);
        jFrame.setLayout(new BorderLayout());


        JLabel title = new JLabel("Student Details form");
        JPanel jPanel = new JPanel();
        jPanel.add(title);

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(4, 2));
        JTextField student_id_field = new JTextField(40);
        JTextField name_field = new JTextField(40);
        JTextField address_field = new JTextField(40);
        JTextField phoneNo_field = new JTextField(40);


        jPanel1.add(new JLabel("Student id"));
        jPanel1.add(student_id_field);
        jPanel1.add(new JLabel("Name"));
        jPanel1.add(name_field);
        jPanel1.add(new JLabel("Address"));
        jPanel1.add(address_field);
        jPanel1.add(new JLabel("Phone no"));
        jPanel1.add(phoneNo_field);


        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BorderLayout());
        JPanel jPanel3 = new JPanel();
        JButton addButton = new JButton("Add Student");
        jPanel3.add(addButton);
        JButton cancelButton = new JButton("Cancel");
        jPanel3.add(cancelButton);
        jPanel2.add(jPanel3, BorderLayout.LINE_END);


        jFrame.add(jPanel, BorderLayout.NORTH);
        jFrame.add(jPanel1, BorderLayout.CENTER);
        jFrame.add(jPanel2, BorderLayout.SOUTH);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class gui {
    public static void main(String[] args) {
        GUI1 gui1 = new GUI1();
        gui1.flow_layout();
            gui1.calculator();
        gui1.containor();
        gui1.student_form();
    }
}
