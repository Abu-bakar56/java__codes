import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
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
    void calculator1() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("My Calculator");
        jFrame.setSize(300, 400);
        jFrame.setLocationRelativeTo(null);

        JTextField operand1 = new JTextField(7);
        JTextField operand2 = new JTextField(7);
        JTextField output = new JTextField(15);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 1));
        jFrame.add(jPanel, BorderLayout.NORTH);

        JPanel jPanel1 = new JPanel();
        jPanel1.add(operand1);
        jPanel1.add(operand2);
        jPanel.add(jPanel1);

        JPanel jPanel2 = new JPanel();
        jPanel2.add(output);
        jPanel.add(jPanel2);

        JButton[] numbers = new JButton[10];
        JButton plus;
        JButton minus;
        JButton mult;
        JButton div;
        JButton equals;
        JButton dot;

        for (int i = 0; i < 10; i++) {
            numbers[i] = new JButton(" " + i);
        }
        plus = new JButton("+");
        minus = new JButton("-");
        mult = new JButton("x");
        div = new JButton("/");
        equals = new JButton("=");
        dot = new JButton(".");

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4, 1));
        center.add(getRow(numbers[7], numbers[8], numbers[9], plus));
        center.add(getRow(numbers[4], numbers[5], numbers[6], minus));
        center.add(getRow(numbers[1], numbers[2], numbers[3], mult));
        center.add(getRow(dot, numbers[0], equals, div));
        jFrame.add(center);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class GUI_calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculator1();
    }
}
