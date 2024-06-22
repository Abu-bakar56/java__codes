import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

class e3 extends JFrame{
    void SignupForm() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        String first="100";
        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        JTextField textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name:");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 240, 200, 30);
        add(labelfName);

        JTextField  textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 290, 200, 30);
        add(labelG);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        JRadioButton  r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);

        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        JComboBox<String> dayComboBox = new JComboBox<>();
        dayComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        dayComboBox.setBounds(300, 340, 80, 30);
        for (int i = 1; i <= 31; i++) {
            dayComboBox.addItem(String.valueOf(i));
        }
        add(dayComboBox);

        JComboBox<String> monthComboBox = new JComboBox<>();
        monthComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        monthComboBox.setBounds(390, 340, 120, 30);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (String month : months) {
            monthComboBox.addItem(month);
        }
        add(monthComboBox);

        JComboBox<String> yearComboBox = new JComboBox<>();
        yearComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        yearComboBox.setBounds(520, 340, 100, 30);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = currentYear - 100; i <= currentYear; i++) {
            yearComboBox.addItem(String.valueOf(i));
        }
        add(yearComboBox);

        JLabel labelEmail = new JLabel("Email address:");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        JTextField textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status:");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 440, 200, 30);
        add(labelMs);

        JRadioButton m1 = new JRadioButton("Married");
        m1.setBounds(300, 440, 100, 30);
        m1.setBackground(new Color(222, 255, 228));
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m1);

        JRadioButton m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222, 255, 228));
        m2.setBounds(450, 440, 100, 30);
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m2);

        JRadioButton m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222, 255, 228));
        m3.setBounds(635, 440, 100, 30);
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m3);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(m1);
        maritalGroup.add(m2);
        maritalGroup.add(m3);

        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        JTextField textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        JTextField textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code:");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        JTextField textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        JTextField textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        JButton next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);

        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);


//        submitButton.addActionListener(e -> {
//            try {
//            String formno = first;
//            String name = textName.getText();
//            String fname = textFname.getText();
//            String email = textEmail.getText();
//            String gender = (r1.isSelected()) ? "Male" : "Female";
//            String maritalStatus = "";
//            if (m1.isSelected()) {
//                maritalStatus = "Married";
//            } else if (m2.isSelected()) {
//                maritalStatus = "Unmarried";
//            } else if (m3.isSelected()) {
//                maritalStatus = "Other";
//            }
//            String address = textAdd.getText();
//            String city = textCity.getText();
//            String pin = textPin.getText();
//            String state = textState.getText();
//            String dob = dayComboBox.getSelectedItem() + "-" + monthComboBox.getSelectedItem() + "-" + yearComboBox.getSelectedItem();
//
//            try {
//
//                String query = "INSERT INTO signup (formno, name, fname, dob, gender, email, maritalStatus, address, city, pin, state) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//                PreparedStatement ps = connection.prepareStatement(query);
//                ps.setString(1, formno);
//                ps.setString(2, name);
//                ps.setString(3, fname);
//                ps.setString(4, dob);
//                ps.setString(5, gender);
//                ps.setString(6, email);
//                ps.setString(7, maritalStatus);
//                ps.setString(8, address);
//                ps.setString(9, city);
//                ps.setString(10, pin);
//                ps.setString(11, state);
//
//                ps.executeUpdate();
//                ps.close();
//                setVisible(false);
//                 Signup2(formno);
//
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        } catch (Exception ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//                closeButton.addActionListener(e -> {
//            frame.dispose();
//            user();
//        });
    }
}

public class a_14_program extends JFrame  {

    public static void main(String[] args) {
       e3 e3 = new e3();
       e3.SignupForm();
    }
}
