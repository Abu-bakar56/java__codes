//
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.math.BigDecimal;
//import java.sql.*;
//import java.util.Calendar;
//
//import java.util.Random;
//
//
//
//
//class account extends JFrame implements ActionListener {
//    JRadioButton r1, r2, m1, m2, m3;
//    JButton next;
//    Connection connection;
//
//    JTextField textName, textFname, textEmail, textAdd, textcity, textState, textPin;
//    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
//    JTextField textPan, textAadhar;
//
//
//    String formno;
//
//    JRadioButton  r3, r4;
//    JCheckBox c1, c2, c3, c4, c5, c6;
//    JButton s, c;
//
//
//    int accNum;
//
//    private JFrame frame;
//    private JTextField nameField, fatherNameField, accountTypeField, dateOfBirthField, nationalityField, addressField,
//            phoneNoField, emailField, maritalStatusField, qualificationField;
//    private JTextField depositAmountField, pinField;
//    JLabel creditAmountLabel;
//    private JTextField accountNumberField, creditAmountFEILD;
//    private JButton submitButton, clearButton, closeButton;
//    private JLabel accountNumberLabel;
//
//    Random ran = new Random();
//    long first4 = (ran.nextLong() % 9000L) + 1000L;
//    String first = " " + Math.abs(first4);
//
//    void  Signup3(String formno) {
//
//        this.formno = formno;
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(150, 5, 100, 100);
//        add(image);
//
//        JLabel l1 = new JLabel("Page 3:");
//        l1.setFont(new Font("Raleway", Font.BOLD, 22));
//        l1.setBounds(280, 40, 400, 40);
//        add(l1);
//
//        JLabel l2 = new JLabel("Account Details");
//        l2.setFont(new Font("Raleway", Font.BOLD, 22));
//        l2.setBounds(280, 70, 400, 40);
//        add(l2);
//
//        JLabel l3 = new JLabel("Account Type:");
//        l3.setFont(new Font("Raleway", Font.BOLD, 18));
//        l3.setBounds(100, 140, 200, 30);
//        add(l3);
//
//        r1 = new JRadioButton("Saving Account");
//        r1.setFont(new Font("Raleway", Font.BOLD, 16));
//        r1.setBackground(new Color(215, 252, 252));
//        r1.setBounds(100, 180, 150, 30);
//        add(r1);
//
//        r2 = new JRadioButton("Fixed Deposit Account");
//        r2.setFont(new Font("Raleway", Font.BOLD, 16));
//        r2.setBackground(new Color(215, 252, 252));
//        r2.setBounds(350, 180, 300, 30);
//        add(r2);
//
//        r3 = new JRadioButton("Current Account");
//        r3.setFont(new Font("Raleway", Font.BOLD, 16));
//        r3.setBackground(new Color(215, 252, 252));
//        r3.setBounds(100, 220, 250, 30);
//        add(r3);
//
//        r4 = new JRadioButton("Recurring Deposit Account");
//        r4.setFont(new Font("Raleway", Font.BOLD, 16));
//        r4.setBackground(new Color(215, 252, 252));
//        r4.setBounds(350, 220, 250, 30);
//        add(r4);
//
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(r1);
//        buttonGroup.add(r2);
//        buttonGroup.add(r3);
//        buttonGroup.add(r4);
//
//        JLabel l4 = new JLabel("Card Number:");
//        l4.setFont(new Font("Raleway", Font.BOLD, 18));
//        l4.setBounds(100, 300, 200, 30);
//        add(l4);
//
//        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
//        l5.setFont(new Font("Raleway", Font.BOLD, 12));
//        l5.setBounds(100, 330, 200, 20);
//        add(l5);
//
//        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
//        l6.setFont(new Font("Raleway", Font.BOLD, 18));
//        l6.setBounds(330, 300, 250, 30);
//        add(l6);
//
//        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
//        l7.setFont(new Font("Raleway", Font.BOLD, 12));
//        l7.setBounds(330, 330, 500, 20);
//        add(l7);
//
//        JLabel l8 = new JLabel("PIN:");
//        l8.setFont(new Font("Raleway", Font.BOLD, 18));
//        l8.setBounds(100, 370, 200, 30);
//        add(l8);
//
//        JLabel l9 = new JLabel("XXXX");
//        l9.setFont(new Font("Raleway", Font.BOLD, 18));
//        l9.setBounds(330, 370, 200, 30);
//        add(l9);
//
//        JLabel l10 = new JLabel("(4-digit Password)");
//        l10.setFont(new Font("Raleway", Font.BOLD, 12));
//        l10.setBounds(100, 400, 200, 20);
//        add(l10);
//
//        JLabel l11 = new JLabel("Services Required:");
//        l11.setFont(new Font("Raleway", Font.BOLD, 18));
//        l11.setBounds(100, 450, 200, 30);
//        add(l11);
//
//        c1 = new JCheckBox("ATM CARD");
//        c1.setBackground(new Color(215, 252, 252));
//        c1.setFont(new Font("Raleway", Font.BOLD, 16));
//        c1.setBounds(100, 500, 200, 30);
//        add(c1);
//
//        c2 = new JCheckBox("Internet Banking");
//        c2.setBackground(new Color(215, 252, 252));
//        c2.setFont(new Font("Raleway", Font.BOLD, 16));
//        c2.setBounds(350, 500, 200, 30);
//        add(c2);
//
//        c3 = new JCheckBox("Mobile Banking");
//        c3.setBackground(new Color(215, 252, 252));
//        c3.setFont(new Font("Raleway", Font.BOLD, 16));
//        c3.setBounds(100, 550, 200, 30);
//        add(c3);
//
//        c4 = new JCheckBox("EMAIL Alerts");
//        c4.setBackground(new Color(215, 252, 252));
//        c4.setFont(new Font("Raleway", Font.BOLD, 16));
//        c4.setBounds(350, 550, 200, 30);
//        add(c4);
//
//        c5 = new JCheckBox("Cheque Book");
//        c5.setBackground(new Color(215, 252, 252));
//        c5.setFont(new Font("Raleway", Font.BOLD, 16));
//        c5.setBounds(100, 600, 200, 30);
//        add(c5);
//
//        c6 = new JCheckBox("E-Statement");
//        c6.setBackground(new Color(215, 252, 252));
//        c6.setFont(new Font("Raleway", Font.BOLD, 16));
//        c6.setBounds(350, 600, 200, 30);
//        add(c6);
//
//        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.", true);
//        c7.setBackground(new Color(215, 252, 252));
//        c7.setFont(new Font("Raleway", Font.BOLD, 12));
//        c7.setBounds(100, 680, 600, 20);
//        add(c7);
//
//        JLabel l12 = new JLabel("Form No : ");
//        l12.setFont(new Font("Raleway", Font.BOLD, 14));
//        l12.setBounds(700, 10, 100, 30);
//        add(l12);
//
//        JLabel l13 = new JLabel(formno);
//        l13.setFont(new Font("Raleway", Font.BOLD, 14));
//        l13.setBounds(760, 10, 60, 30);
//        add(l13);
//
//
//        s = new JButton("Submit");
//        s.setFont(new Font("Raleway", Font.BOLD, 14));
//        s.setBackground(Color.BLACK);
//        s.setForeground(Color.WHITE);
//        s.setBounds(250, 720, 100, 30);
//        s.addActionListener(this);
//        add(s);
//
//        c = new JButton("Cancel");
//        c.setFont(new Font("Raleway", Font.BOLD, 14));
//        c.setBackground(Color.BLACK);
//        c.setForeground(Color.WHITE);
//        c.setBounds(420, 720, 100, 30);
//        c.addActionListener(this);
//        add(c);
//
//
//
//
////        submitButton.addActionListener(e -> {
////                    try {
////                        String atype = null;
////                        if (r1.isSelected()) {
////                            atype = "Saving Account";
////                        } else if (r2.isSelected()) {
////                            atype = "Fixed Deposit Account";
////                        } else if (r3.isSelected()) {
////                            atype = "Current Account";
////                        } else if (r4.isSelected()) {
////                            atype = "Recurring Deposit Account";
////                        }
////
////                        Random ran = new Random();
////                        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
////                        String cardno = "" + Math.abs(first7);
////
////                        long first3 = (ran.nextLong() % 9000L) + 1000L;
////                        String pin = "" + Math.abs(first3);
////
////                        String fac = "";
////                        if (c1.isSelected()) {
////                            fac = fac + "ATM CARD ";
////                        } else if (c2.isSelected()) {
////                            fac = fac + "Internet Banking";
////                        } else if (c3.isSelected()) {
////                            fac = fac + "Mobile Banking";
////                        } else if (c4.isSelected()) {
////                            fac = fac + "EMAIL Alerts";
////                        } else if (c5.isSelected()) {
////                            fac = fac + "Cheque Book";
////                        } else if (c6.isSelected()) {
////                            fac = fac + "E-Statement";
////                        }
////
////                        try {
////                            if (e.getSource() == s) {
////                                if (atype.equals("")) {
////                                    JOptionPane.showMessageDialog(null, "Fill all the fields");
////                                } else {
////
////                                    String q1 = "insert into signupthree values('" + formno + "', '" + atype + "','" + cardno + "','" + pin + "','" + fac + "')";
////                                    String q2 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
////
////                                    JOptionPane.showMessageDialog(null, "Card Number : " + cardno + "\n Pin : " + pin);
////
////                                    setVisible(false);
////                                }
////                            } else if (e.getSource() == c) {
////                                System.exit(0);
////                            }
////
////                        } catch (Exception E) {
////                            E.printStackTrace();
////                        }
////
////                    } catch (Exception ex) {
////                        throw new RuntimeException(ex);
////                    }
////
////                });
////                closeButton.addActionListener(e -> {
////                    frame.dispose();
////                    user();
////                });
//
//        getContentPane().setBackground(new Color(215, 252, 252));
//        setSize(850, 800);
//        setLayout(null);
//        setLocation(400, 20);
//        setVisible(true);
//    }
//
//    void Signup2(String formno) {
//
//        this.formno = formno;
//        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(25, 10, 100, 100);
//        add(image);
//
//        JLabel formNoLabel = new JLabel("Form No: " + formno);
//        formNoLabel.setFont(new Font("Raleway", Font.BOLD, 18));
//        formNoLabel.setBounds(700, 10, 200, 30);
//        add(formNoLabel);
//
//        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
//        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
//        additionalDetails.setBounds(280, 30, 600, 40);
//        add(additionalDetails);
//
//        JLabel religionLabel = new JLabel("Religion:");
//        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        religionLabel.setBounds(100, 120, 100, 30);
//        add(religionLabel);
//
//        String[] religionOptions = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
//        JComboBox<String> religionComboBox = new JComboBox<>(religionOptions);
//        religionComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
//        religionComboBox.setBounds(300, 120, 400, 30);
//        add(religionComboBox);
//
//        JLabel categoryLabel = new JLabel("Category:");
//        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        categoryLabel.setBounds(100, 170, 200, 30);
//        add(categoryLabel);
//
//        String[] categoryOptions = {"General", "OBC", "SC", "ST", "Other"};
//        JComboBox<String> categoryComboBox = new JComboBox<>(categoryOptions);
//        categoryComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
//        categoryComboBox.setBounds(300, 170, 400, 30);
//        add(categoryComboBox);
//
//        JLabel incomeLabel = new JLabel("Income:");
//        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        incomeLabel.setBounds(100, 220, 200, 30);
//        add(incomeLabel);
//
//        String[] incomeOptions = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
//       JComboBox incomeComboBox = new JComboBox<>(incomeOptions);
//        incomeComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
//        incomeComboBox.setBounds(300, 220, 400, 30);
//        add(incomeComboBox);
//
//        JLabel educationLabel = new JLabel("Educational Qualification:");
//        educationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        educationLabel.setBounds(100, 270, 300, 30);
//        add(educationLabel);
//
//        String[] educationOptions = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Other"};
//        JComboBox educationComboBox = new JComboBox<>(educationOptions);
//        educationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
//        educationComboBox.setBounds(300, 320, 400, 30);
//        add(educationComboBox);
//
//        JLabel occupationLabel = new JLabel("Occupation:");
//        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        occupationLabel.setBounds(100, 370, 200, 30);
//        add(occupationLabel);
//
//        String[] occupationOptions = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
//        JComboBox occupationComboBox = new JComboBox<>(occupationOptions);
//        occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
//        occupationComboBox.setBounds(300, 370, 400, 30);
//        add(occupationComboBox);
//
//        JLabel panLabel = new JLabel("PAN Number:");
//        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        panLabel.setBounds(100, 420, 200, 30);
//        add(panLabel);
//
//        JTextField panField = new JTextField();
//        panField.setFont(new Font("Raleway", Font.BOLD, 14));
//        panField.setBounds(300, 420, 400, 30);
//        add(panField);
//
//        JLabel aadhaarLabel = new JLabel("Aadhaar Number:");
//        aadhaarLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        aadhaarLabel.setBounds(100, 470, 200, 30);
//        add(aadhaarLabel);
//
//       JTextField aadhaarField = new JTextField();
//        aadhaarField.setFont(new Font("Raleway", Font.BOLD, 14));
//        aadhaarField.setBounds(300, 470, 400, 30);
//        add(aadhaarField);
//
//        JLabel seniorLabel = new JLabel("Senior Citizen:");
//        seniorLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        seniorLabel.setBounds(100, 520, 200, 30);
//        add(seniorLabel);
//
//       JRadioButton seniorYes = new JRadioButton("Yes");
//        seniorYes.setFont(new Font("Raleway", Font.BOLD, 14));
//        seniorYes.setBackground(new Color(222, 255, 228));
//        seniorYes.setBounds(300, 520, 100, 30);
//        add(seniorYes);
//
//        JRadioButton seniorNo = new JRadioButton("No");
//        seniorNo.setFont(new Font("Raleway", Font.BOLD, 14));
//        seniorNo.setBackground(new Color(222, 255, 228));
//        seniorNo.setBounds(450, 520, 100, 30);
//        add(seniorNo);
//
//        ButtonGroup seniorGroup = new ButtonGroup();
//        seniorGroup.add(seniorYes);
//        seniorGroup.add(seniorNo);
//
//        JLabel existingLabel = new JLabel("Existing Account:");
//        existingLabel.setFont(new Font("Raleway", Font.BOLD, 20));
//        existingLabel.setBounds(100, 570, 200, 30);
//        add(existingLabel);
//
//        JRadioButton existingYes = new JRadioButton("Yes");
//        existingYes.setFont(new Font("Raleway", Font.BOLD, 14));
//        existingYes.setBackground(new Color(222, 255, 228));
//        existingYes.setBounds(300, 570, 100, 30);
//        add(existingYes);
//
//        JRadioButton existingNo = new JRadioButton("No");
//        existingNo.setFont(new Font("Raleway", Font.BOLD, 14));
//        existingNo.setBackground(new Color(222, 255, 228));
//        existingNo.setBounds(450, 570, 100, 30);
//        add(existingNo);
//
//        ButtonGroup existingGroup = new ButtonGroup();
//        existingGroup.add(existingYes);
//        existingGroup.add(existingNo);
//
//        next = new JButton("Next");
//        next.setFont(new Font("Raleway", Font.BOLD, 14));
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
//        next.setBounds(620, 660, 80, 30);
//        next.addActionListener(this);
//        add(next);
//
//        getContentPane().setBackground(new Color(222, 255, 228));
//        setLayout(null);
//        setSize(850, 800);
//        setLocation(360, 40);
//        setVisible(true);
//
//
////        submitButton.addActionListener(e -> {
////                    try {
////                        String religion = (String) religionComboBox.getSelectedItem();
////                        String category = (String) categoryComboBox.getSelectedItem();
////                        String income = (String) incomeComboBox.getSelectedItem();
////                        String education = (String) educationComboBox.getSelectedItem();
////                        String occupation = (String) occupationComboBox.getSelectedItem();
////                        String pan = panField.getText();
////                        String aadhaar = aadhaarField.getText();
////                        String seniorCitizen = (seniorYes.isSelected()) ? "Yes" : "No";
////                        String existingAccount = (existingYes.isSelected()) ? "Yes" : "No";
////
////                        try {
////                            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "password");
////                            String query = "INSERT INTO signup2 (formno, religion, category, income, education, occupation, pan, aadhaar, seniorCitizen, existingAccount) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
////                            PreparedStatement ps = connection.prepareStatement(query);
////                            ps.setString(1, formno);
////                            ps.setString(2, religion);
////                            ps.setString(3, category);
////                            ps.setString(4, income);
////                            ps.setString(5, education);
////                            ps.setString(6, occupation);
////                            ps.setString(7, pan);
////                            ps.setString(8, aadhaar);
////                            ps.setString(9, seniorCitizen);
////                            ps.setString(10, existingAccount);
////
////                            ps.executeUpdate();
////                            ps.close();
////                            connection.close();
////
////                            setVisible(false);
////                            Signup3(formno);
////
////                        } catch (SQLException ex) {
////                            ex.printStackTrace();
////                        }
////                    } catch (Exception ex) {
////                        throw new RuntimeException(ex);
////                    }
////                });
////                closeButton.addActionListener(e -> {
////                    frame.dispose();
////                    user();
////                });
//    }
//
//    void SignupForm() {
//        setTitle("APPLICATION FORM");
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(25, 10, 100, 100);
//        add(image);
//
//        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
//        label1.setBounds(160, 20, 600, 40);
//        label1.setFont(new Font("Raleway", Font.BOLD, 38));
//        add(label1);
//
//        JLabel label2 = new JLabel("Page 1");
//        label2.setFont(new Font("Raleway", Font.BOLD, 22));
//        label2.setBounds(330, 70, 600, 30);
//        add(label2);
//
//        JLabel label3 = new JLabel("Personal Details");
//        label3.setFont(new Font("Raleway", Font.BOLD, 22));
//        label3.setBounds(290, 90, 600, 30);
//        add(label3);
//
//        JLabel labelName = new JLabel("Name:");
//        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelName.setBounds(100, 190, 100, 30);
//        add(labelName);
//
//        textName = new JTextField();
//        textName.setFont(new Font("Raleway", Font.BOLD, 14));
//        textName.setBounds(300, 190, 400, 30);
//        add(textName);
//
//        JLabel labelfName = new JLabel("Father's Name:");
//        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelfName.setBounds(100, 240, 200, 30);
//        add(labelfName);
//
//        textFname = new JTextField();
//        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
//        textFname.setBounds(300, 240, 400, 30);
//        add(textFname);
//
//        JLabel labelG = new JLabel("Gender:");
//        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelG.setBounds(100, 290, 200, 30);
//        add(labelG);
//
//        r1 = new JRadioButton("Male");
//        r1.setFont(new Font("Raleway", Font.BOLD, 14));
//        r1.setBackground(new Color(222, 255, 228));
//        r1.setBounds(300, 290, 60, 30);
//        add(r1);
//
//        r2 = new JRadioButton("Female");
//        r2.setBackground(new Color(222, 255, 228));
//        r2.setFont(new Font("Raleway", Font.BOLD, 14));
//        r2.setBounds(450, 290, 90, 30);
//        add(r2);
//
//        ButtonGroup genderGroup = new ButtonGroup();
//        genderGroup.add(r1);
//        genderGroup.add(r2);
//
//        JLabel DOB = new JLabel("Date of Birth:");
//        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
//        DOB.setBounds(100, 340, 200, 30);
//        add(DOB);
//
//        JComboBox<String> dayComboBox = new JComboBox<>();
//        dayComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
//        dayComboBox.setBounds(300, 340, 80, 30);
//        for (int i = 1; i <= 31; i++) {
//            dayComboBox.addItem(String.valueOf(i));
//        }
//        add(dayComboBox);
//
//        JComboBox<String> monthComboBox = new JComboBox<>();
//        monthComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
//        monthComboBox.setBounds(390, 340, 120, 30);
//        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//        for (String month : months) {
//            monthComboBox.addItem(month);
//        }
//        add(monthComboBox);
//
//        JComboBox<String> yearComboBox = new JComboBox<>();
//        yearComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
//        yearComboBox.setBounds(520, 340, 100, 30);
//        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
//        for (int i = currentYear - 100; i <= currentYear; i++) {
//            yearComboBox.addItem(String.valueOf(i));
//        }
//        add(yearComboBox);
//
//        JLabel labelEmail = new JLabel("Email address:");
//        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelEmail.setBounds(100, 390, 200, 30);
//        add(labelEmail);
//
//        textEmail = new JTextField();
//        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
//        textEmail.setBounds(300, 390, 400, 30);
//        add(textEmail);
//
//        JLabel labelMs = new JLabel("Marital Status:");
//        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelMs.setBounds(100, 440, 200, 30);
//        add(labelMs);
//
//        m1 = new JRadioButton("Married");
//        m1.setBounds(300, 440, 100, 30);
//        m1.setBackground(new Color(222, 255, 228));
//        m1.setFont(new Font("Raleway", Font.BOLD, 14));
//        add(m1);
//
//        m2 = new JRadioButton("Unmarried");
//        m2.setBackground(new Color(222, 255, 228));
//        m2.setBounds(450, 440, 100, 30);
//        m2.setFont(new Font("Raleway", Font.BOLD, 14));
//        add(m2);
//
//        m3 = new JRadioButton("Other");
//        m3.setBackground(new Color(222, 255, 228));
//        m3.setBounds(635, 440, 100, 30);
//        m3.setFont(new Font("Raleway", Font.BOLD, 14));
//        add(m3);
//
//        ButtonGroup maritalGroup = new ButtonGroup();
//        maritalGroup.add(m1);
//        maritalGroup.add(m2);
//        maritalGroup.add(m3);
//
//        JLabel labelAdd = new JLabel("Address:");
//        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelAdd.setBounds(100, 490, 200, 30);
//        add(labelAdd);
//
//        textAdd = new JTextField();
//        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
//        textAdd.setBounds(300, 490, 400, 30);
//        add(textAdd);
//
//        JLabel labelCity = new JLabel("City:");
//        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelCity.setBounds(100, 540, 200, 30);
//        add(labelCity);
//
//        JTextField textCity = new JTextField();
//        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
//        textCity.setBounds(300, 540, 400, 30);
//        add(textCity);
//
//        JLabel labelPin = new JLabel("Pin Code:");
//        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelPin.setBounds(100, 590, 200, 30);
//        add(labelPin);
//
//        textPin = new JTextField();
//        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
//        textPin.setBounds(300, 590, 400, 30);
//        add(textPin);
//
//        JLabel labelState = new JLabel("State:");
//        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
//        labelState.setBounds(100, 640, 200, 30);
//        add(labelState);
//
//        textState = new JTextField();
//        textState.setFont(new Font("Raleway", Font.BOLD, 14));
//        textState.setBounds(300, 640, 400, 30);
//        add(textState);
//
//        next = new JButton("Next");
//        next.setFont(new Font("Raleway", Font.BOLD, 14));
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
//        next.setBounds(620, 710, 80, 30);
//        next.addActionListener(this);
//        add(next);
//
//        getContentPane().setBackground(new Color(222, 255, 228));
//        setLayout(null);
//        setSize(850, 800);
//        setLocation(360, 40);
//        setVisible(true);
//
//
////        submitButton.addActionListener(e -> {
////            try {
////            String formno = first;
////            String name = textName.getText();
////            String fname = textFname.getText();
////            String email = textEmail.getText();
////            String gender = (r1.isSelected()) ? "Male" : "Female";
////            String maritalStatus = "";
////            if (m1.isSelected()) {
////                maritalStatus = "Married";
////            } else if (m2.isSelected()) {
////                maritalStatus = "Unmarried";
////            } else if (m3.isSelected()) {
////                maritalStatus = "Other";
////            }
////            String address = textAdd.getText();
////            String city = textCity.getText();
////            String pin = textPin.getText();
////            String state = textState.getText();
////            String dob = dayComboBox.getSelectedItem() + "-" + monthComboBox.getSelectedItem() + "-" + yearComboBox.getSelectedItem();
////
////            try {
////
////                String query = "INSERT INTO signup (formno, name, fname, dob, gender, email, maritalStatus, address, city, pin, state) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
////                PreparedStatement ps = connection.prepareStatement(query);
////                ps.setString(1, formno);
////                ps.setString(2, name);
////                ps.setString(3, fname);
////                ps.setString(4, dob);
////                ps.setString(5, gender);
////                ps.setString(6, email);
////                ps.setString(7, maritalStatus);
////                ps.setString(8, address);
////                ps.setString(9, city);
////                ps.setString(10, pin);
////                ps.setString(11, state);
////
////                ps.executeUpdate();
////                ps.close();
////                setVisible(false);
////                 Signup2(formno);
////
////            } catch (SQLException ex) {
////                ex.printStackTrace();
////            }
////        } catch (Exception ex) {
////                throw new RuntimeException(ex);
////            }
////        });
////                closeButton.addActionListener(e -> {
////            frame.dispose();
////            user();
////        });
//    }
//
//
//
//
//
//
//
//
//    private int generateAccountNumber() {
//
//        return 1000000000 + (int) (Math.random() * 900000000);
//
//    }
//
//    void deposit() {
//
//        JFrame jFrame20 = new JFrame();
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jFrame20.setIconImage(imageIcon.getImage());
//
//        jFrame20.setTitle("BANK OF SPAIN");
//        jFrame20.setSize(400, 200);
//        jFrame20.setLayout(null);
//        jFrame20.setResizable(false);
//        jFrame20.setLocationRelativeTo(null);
//
//        JLabel accountNumberLabel = new JLabel("Account Number: ");
//        accountNumberLabel.setBounds(20, 20, 120, 20);
//        jFrame20.add(accountNumberLabel);
//
//        JTextField accountNumberField = new JTextField();
//        accountNumberField.setBounds(150, 20, 200, 20);
//        jFrame20.add(accountNumberField);
//
//        JLabel depositAmountLabel = new JLabel("Deposit Amount: ");
//        depositAmountLabel.setBounds(20, 50, 120, 20);
//        jFrame20.add(depositAmountLabel);
//
//        JTextField depositAmountField = new JTextField();
//        depositAmountField.setBounds(150, 50, 200, 20);
//        jFrame20.add(depositAmountField);
//
//        JButton submitButton = new JButton("Deposit");
//        submitButton.setBounds(150, 100, 100, 30);
//        jFrame20.add(submitButton);
//
//        JButton closeButton = new JButton("Exit");
//        closeButton.setBounds(260, 100, 100, 30);
//        jFrame20.add(closeButton);
//
//        jFrame20.setVisible(true);
//        jFrame20.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        submitButton.addActionListener(e -> {
//            try {
//                int accountNumber = Integer.parseInt(accountNumberField.getText());
//                float depositAmount = Float.parseFloat(depositAmountField.getText());
//
//                String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//                PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//                selectStatement.setInt(1, accountNumber);
//                ResultSet resultSet = selectStatement.executeQuery();
//
//                if (resultSet.next()) {
//                    float currentBalance = resultSet.getFloat("balance");
//                    float newBalance = currentBalance + depositAmount;
//
//                    String updateBalanceSQL = "UPDATE accounts SET balance = ? WHERE account_num = ?";
//                    PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                    updateStatement.setFloat(1, newBalance);
//                    updateStatement.setInt(2, accountNumber);
//                    updateStatement.executeUpdate();
//
//                    int accountId = resultSet.getInt("id");
//
//                    String insertStatementSQL = "INSERT INTO BankStatement (account_id, transaction_date, description, Debit, Credit, balance_after_transaction) VALUES (?, ?, ?, ?, ?, ?)";
//                    PreparedStatement statement = connection.prepareStatement(insertStatementSQL);
//                    statement.setInt(1, accountId);
//                    statement.setDate(2, new java.sql.Date(System.currentTimeMillis()));
//                    statement.setString(3, "Deposit");
//                    statement.setBigDecimal(4, BigDecimal.ZERO);
//                    statement.setBigDecimal(5, BigDecimal.valueOf(depositAmount));
//                    statement.setBigDecimal(6, BigDecimal.valueOf(newBalance));
//                    statement.executeUpdate();
//
//                    String BankSQL = "SELECT bank_money FROM money WHERE id_bank = ?";
//                    PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                    selectStatement2.setInt(1, 2);
//                    ResultSet resultSet2 = selectStatement2.executeQuery();
//
//                    float totalBankBalance = 0.0f;
//                    if (resultSet2.next()) {
//                        float totalBankBalanceOld = resultSet2.getFloat("bank_money");
//                        totalBankBalance = totalBankBalanceOld + depositAmount;
//                    }
//                    String updateBalanceBankSQL = "UPDATE money SET bank_money = ? WHERE id_bank = ?";
//                    PreparedStatement updateBankStatement = connection.prepareStatement(updateBalanceBankSQL);
//                    updateBankStatement.setFloat(1, totalBankBalance);
//                    updateBankStatement.setInt(2, 2);
//                    updateBankStatement.executeUpdate();
//
//                    JOptionPane.showMessageDialog(jFrame20, "Deposit successful! Your new balance is: " + newBalance);
//                } else {
//                    JOptionPane.showMessageDialog(jFrame20, "Invalid account number!");
//                }
//
//            } catch (SQLException | NumberFormatException ex) {
//                ex.printStackTrace();
//                JOptionPane.showMessageDialog(jFrame20, "Error occurred. Please try again.");
//            }
//        });
//        closeButton.addActionListener(e -> {
//            jFrame20.dispose();
//            user();
//        });
//    }
//
//    void credit() {
//
//        JFrame jFrame21 = new JFrame();
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jFrame21.setIconImage(imageIcon.getImage());
//
//        jFrame21.setTitle("BANK OF SPAIN");
//        jFrame21.setSize(400, 200);
//        jFrame21.setLayout(null);
//        jFrame21.setLocationRelativeTo(null);
//        jFrame21.setResizable(false);
//
//        accountNumberLabel = new JLabel("Account Number: ");
//        accountNumberLabel.setBounds(20, 20, 120, 20);
//        jFrame21.add(accountNumberLabel);
//
//        accountNumberField = new JTextField();
//        accountNumberField.setBounds(150, 20, 200, 20);
//        jFrame21.add(accountNumberField);
//
//        creditAmountLabel = new JLabel("Credit Amount: ");
//        creditAmountLabel.setBounds(20, 50, 120, 20);
//        jFrame21.add(creditAmountLabel);
//
//        creditAmountFEILD = new JTextField();
//        creditAmountFEILD.setBounds(150, 50, 200, 20);
//        jFrame21.add(creditAmountFEILD);
//
//        submitButton = new JButton("Credit");
//        submitButton.setBounds(150, 100, 100, 30);
//        submitButton.addActionListener(this);
//        jFrame21.add(submitButton);
//
//        closeButton = new JButton("Exit");
//        closeButton.setBounds(260, 100, 100, 30);
//        closeButton.addActionListener(this);
//        jFrame21.add(closeButton);
//
//        jFrame21.setVisible(true);
//        jFrame21.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        submitButton.addActionListener(e -> {
//
//            try {
//
//                int accountNumber = Integer.parseInt(accountNumberField.getText());
//                float creditAmount = Float.parseFloat(creditAmountFEILD.getText());
//                String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//                PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//                selectStatement.setInt(1, accountNumber);
//                ResultSet resultSet = selectStatement.executeQuery();
//
//                if (resultSet.next()) {
//                    float currentBalance = resultSet.getFloat("balance");
//
//                    if (currentBalance > creditAmount) {
//                        float newBalance = currentBalance - creditAmount;
//
//                        String updateBalanceSQL = "UPDATE accounts SET balance = ? WHERE account_num = ?";
//                        PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                        updateStatement.setFloat(1, newBalance);
//                        updateStatement.setInt(2, accountNumber);
//                        updateStatement.executeUpdate();
//
//                        int accountId = resultSet.getInt("id");
//
//                        String insertStatementSQL = "INSERT INTO BankStatement (account_id, transaction_date, description, Debit, Credit, balance_after_transaction) VALUES (?, ?, ?, ?, ?, ?)";
//                        PreparedStatement statement = connection.prepareStatement(insertStatementSQL);
//                        statement.setInt(1, accountId);
//                        statement.setDate(2, new java.sql.Date(System.currentTimeMillis()));
//                        statement.setString(3, "WithDraw");
//                        statement.setBigDecimal(4, BigDecimal.valueOf(creditAmount));
//                        statement.setBigDecimal(5, BigDecimal.ZERO);
//                        statement.setBigDecimal(6, BigDecimal.valueOf(newBalance));
//                        statement.executeUpdate();
//
//                        String BankSQL = "SELECT bank_money FROM money WHERE id_bank = ?";
//                        PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                        selectStatement2.setInt(1, 2);
//                        ResultSet resultSet2 = selectStatement2.executeQuery();
//
//                        float total_bank_balance = 0.0f;
//                        if (resultSet2.next()) {
//                            total_bank_balance = resultSet2.getFloat("bank_money");
//                            total_bank_balance -= creditAmount;
//                        }
//                        String updateBalanceBankSQL = "UPDATE money SET bank_money = ? WHERE id_bank = ?";
//                        PreparedStatement updateBankStatement = connection.prepareStatement(updateBalanceBankSQL);
//                        updateBankStatement.setFloat(1, total_bank_balance);
//                        updateBankStatement.setInt(2, 2);
//                        updateBankStatement.executeUpdate();
//
//                        JOptionPane.showMessageDialog(jFrame21,
//                                "Deposit successful! Your new balance is: " + newBalance);
//                    } else {
//                        JOptionPane.showMessageDialog(jFrame21, "INSUFFICIENT FUNDS");
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(jFrame21, "Invalid account number!");
//                }
//            } catch (SQLException | NumberFormatException ex) {
//                ex.printStackTrace();
//                JOptionPane.showMessageDialog(null, "Error occurred. Please try again.");
//            }
//        });
//        closeButton.addActionListener(e -> {
//
//            jFrame21.dispose();
//            user();
//        });
//    }
//
//    public void statement() {
//        JFrame jFrame15 = new JFrame();
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jFrame15.setIconImage(imageIcon.getImage());
//
//        jFrame15.setTitle("BANK OF SPAIN");
//        jFrame15.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame15.setSize(400, 130);
//        jFrame15.setLayout(new BorderLayout());
//        jFrame15.setLocationRelativeTo(null);
//        jFrame15.setResizable(false);
//
//        JPanel inputPanel = new JPanel(new BorderLayout());
//        JLabel accountNumberLabel1 = new JLabel("Account Number: ");
//        inputPanel.add(accountNumberLabel1, BorderLayout.WEST);
//
//        JTextField accountNumberField = new JTextField();
//        inputPanel.add(accountNumberField, BorderLayout.CENTER);
//
//        jFrame15.add(inputPanel, BorderLayout.NORTH);
//
//        JPanel buttonPanel = new JPanel();
//        JButton submitButton = new JButton("Submit");
//        buttonPanel.add(submitButton);
//        JButton exitButton = new JButton("Exit");
//        buttonPanel.add(exitButton);
//        jFrame15.add(buttonPanel, BorderLayout.SOUTH);
//
//        JLabel nameLabel = new JLabel();
//        JLabel currencyLabel = new JLabel();
//        JLabel accountNumberLabel = new JLabel();
//        JLabel dateLabel = new JLabel();
//        JLabel opendate = new JLabel();
//
//        jFrame15.setVisible(true);
//
//        submitButton.addActionListener(e -> {
//            try {
//                int accountNumber = Integer.parseInt(accountNumberField.getText());
//                jFrame15.dispose();
//                displayAccountStatement(accountNumber, nameLabel, currencyLabel, accountNumberLabel, dateLabel,
//                        opendate);
//            } catch (NumberFormatException ex) {
//                JOptionPane.showMessageDialog(jFrame15, "Invalid account number format.");
//            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(jFrame15, "Database error: " + ex.getMessage());
//            }
//        });
//
//        exitButton.addActionListener(e -> {
//            jFrame15.dispose();
//            user();
//        });
//    }
//
//    private void displayAccountStatement(int accountNumber, JLabel nameLabel, JLabel currencyLabel,
//                                         JLabel accountNumberLabel, JLabel dateLabel, JLabel opendate) throws SQLException {
//        JFrame jFrame17 = new JFrame();
//        jFrame17.setResizable(false);
//        jFrame17.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame17.setSize(800, 700);
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jFrame17.setIconImage(imageIcon.getImage());
//
//        jFrame17.setTitle("BANK OF SPAIN");
//        jFrame17.setLayout(new BorderLayout());
//        jFrame17.setLocationRelativeTo(null);
//
//        JPanel panel1 = new JPanel(new BorderLayout());
//        ImageIcon imageIcon2 = new ImageIcon("logo.png");
//        Image image = imageIcon2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
//        imageIcon2.setImage(image);
//        panel1.setOpaque(false);
//        panel1.add(new JLabel(imageIcon2), BorderLayout.NORTH);
//
//        JPanel titlePanel = new JPanel(new FlowLayout());
//        JLabel titleLabel = new JLabel("STATEMENT OF ACCOUNT");
//        titlePanel.add(titleLabel);
//        panel1.add(titlePanel, BorderLayout.CENTER);
//
//        String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//        try (PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL)) {
//            selectStatement.setInt(1, accountNumber);
//            ResultSet resultSet = selectStatement.executeQuery();
//
//            if (resultSet.next()) {
//                nameLabel.setText(resultSet.getString("name") + " " + resultSet.getString("father_name"));
//                currencyLabel.setText("PKR");
//                accountNumberLabel.setText(String.valueOf(resultSet.getInt("account_num")));
//                opendate.setText(String.valueOf(resultSet.getDate("open_date")));
//
//                String selectTimeSQL = "SELECT DATE(now())";
//                try (PreparedStatement selectTimeStatement = connection.prepareStatement(selectTimeSQL);
//                     ResultSet timeResultSet = selectTimeStatement.executeQuery()) {
//                    if (timeResultSet.next()) {
//                        dateLabel.setText(String.valueOf(timeResultSet.getDate(1)));
//                    }
//                }
//
//                JPanel infoPanel = new JPanel(new GridLayout(5, 2));
//                addInfoRow(infoPanel, "Account Title           :       ", nameLabel);
//                addInfoRow(infoPanel, "Account number      :       ", accountNumberLabel);
//                addInfoRow(infoPanel, "Currency                  :       ", currencyLabel);
//                addInfoRow(infoPanel, "From Date                :       ", opendate);
//                addInfoRow(infoPanel, "To Date                    :       ", dateLabel);
//
//                panel1.add(infoPanel, BorderLayout.SOUTH);
//                int accountId = resultSet.getInt("id");
//                double closingBalance = resultSet.getDouble("balance");
//
//                String selectTransactionsSQL = "SELECT transaction_date, description, debit, credit, balance_after_transaction "
//                        +
//                        "FROM bankstatement WHERE account_id = ?";
//                try (PreparedStatement selectTransactionsStatement = connection
//                        .prepareStatement(selectTransactionsSQL)) {
//                    selectTransactionsStatement.setInt(1, accountId);
//                    ResultSet transactionsResultSet = selectTransactionsStatement.executeQuery();
//
//                    String[] columnNames = { "Transaction date", "Description", "Debit", "Credit",
//                            "Available balance" };
//                    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//
//                    while (transactionsResultSet.next()) {
//                        model.addRow(new Object[] {
//                                transactionsResultSet.getDate("transaction_date"),
//                                transactionsResultSet.getString("description"),
//                                transactionsResultSet.getDouble("debit"),
//                                transactionsResultSet.getDouble("credit"),
//                                transactionsResultSet.getDouble("balance_after_transaction")
//                        });
//                    }
//
//                    String selectTimeSQL5 = "SELECT DATE(now())";
//                    try (PreparedStatement selectTimeStatement5 = connection.prepareStatement(selectTimeSQL5);
//                         ResultSet timeResultSet5 = selectTimeStatement5.executeQuery()) {
//                        if (timeResultSet5.next()) {
//                            model.addRow(new Object[] {
//                                    timeResultSet5.getDate(1), "Closing Balance", null, null, closingBalance
//                            });
//                        }
//                    }
//
//                    JTable table = new JTable(model);
//                    table.getColumnModel().getColumn(0).setPreferredWidth(150);
//                    table.getColumnModel().getColumn(1).setPreferredWidth(250);
//                    table.getColumnModel().getColumn(2).setPreferredWidth(100);
//                    table.getColumnModel().getColumn(3).setPreferredWidth(100);
//                    table.getColumnModel().getColumn(4).setPreferredWidth(150);
//
//                    JScrollPane scrollPane = new JScrollPane(table);
//                    jFrame17.add(scrollPane, BorderLayout.CENTER);
//                }
//            } else {
//                JOptionPane.showMessageDialog(jFrame17, "Invalid account number!");
//            }
//
//            jFrame17.add(panel1, BorderLayout.NORTH);
//            jFrame17.setVisible(true);
//        }
//    }
//
//    private void addInfoRow(JPanel panel, String label, JLabel valueLabel) {
//        JPanel row = new JPanel();
//        row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
//        row.add(new JLabel(label));
//        row.add(valueLabel);
//        panel.add(row);
//    }
//
//    void zakat() {
//
//        JFrame jFrame55 = new JFrame();
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jFrame55.setIconImage(imageIcon.getImage());
//        jFrame55.setResizable(false);
//        jFrame55.setTitle("BANK OF SPAIN");
//        jFrame55.setSize(450, 130);
//        jFrame55.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame55.setLocationRelativeTo(null);
//        jFrame55.setLayout(new BorderLayout());
//
//        JPanel titlePanel = new JPanel();
//        JLabel title = new JLabel("PAY ZAKAT");
//        titlePanel.add(title);
//
//        JPanel inputPanel = new JPanel(new BorderLayout(5, 5));
//        JLabel accountNumberLabel = new JLabel("Account Number: ");
//        JTextField accountNumberField = new JTextField(20);
//        inputPanel.add(accountNumberLabel, BorderLayout.WEST);
//        inputPanel.add(accountNumberField, BorderLayout.CENTER);
//
//        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        JButton submitButton = new JButton("Submit");
//        JButton exitButton = new JButton("Exit");
//        submitButton.setFocusable(false);
//        exitButton.setFocusable(false);
//        buttonPanel.add(submitButton);
//        buttonPanel.add(exitButton);
//
//        jFrame55.add(titlePanel, BorderLayout.NORTH);
//        jFrame55.add(inputPanel, BorderLayout.CENTER);
//        jFrame55.add(buttonPanel, BorderLayout.SOUTH);
//
//        jFrame55.setVisible(true);
//
//        submitButton.addActionListener(e -> {
//            try {
//                int accountNumber = Integer.parseInt(accountNumberField.getText());
//
//                String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//                try (PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL)) {
//                    selectStatement.setInt(1, accountNumber);
//                    try (ResultSet resultSet = selectStatement.executeQuery()) {
//                        if (resultSet.next()) {
//                            float currentBalance = resultSet.getFloat("balance");
//                            int accountId = resultSet.getInt("id");
//
//                            JFrame jFrame = new JFrame();
//                            ImageIcon imageIcon1 = new ImageIcon("logo.png");
//                            jFrame.setIconImage(imageIcon1.getImage());
//                            jFrame.setTitle("BANK OF SPAIN");
//                            jFrame.setResizable(false);
//                            jFrame.setSize(450, 150);
//                            jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                            jFrame.setLocationRelativeTo(null);
//                            jFrame.setLayout(new BorderLayout());
//
//                            JPanel panel = new JPanel();
//                            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//
//                            JLabel balanceLabel = new JLabel("YOUR TOTAL BALANCE IN BANK IS: " + currentBalance);
//                            panel.add(balanceLabel);
//
//                            float zakatAmount = currentBalance / 40;
//                            JLabel zakatLabel = new JLabel("YOUR ZAKAT PAYABLE IS: " + zakatAmount);
//                            panel.add(zakatLabel);
//
//                            JLabel questionLabel = new JLabel("DO YOU WANT TO PAY ZAKAT?");
//                            panel.add(questionLabel);
//
//                            JCheckBox confirmCheckBox = new JCheckBox("Confirm");
//                            confirmCheckBox.setFocusable(false);
//                            panel.add(confirmCheckBox);
//
//                            JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
//                            JButton payButton = new JButton("Pay Zakat");
//                            JButton exit = new JButton("Exit");
//                            payButton.setFocusable(false);
//                            exit.setFocusable(false);
//                            buttonPanel2.add(payButton);
//                            buttonPanel2.add(exit);
//
//                            jFrame.add(panel, BorderLayout.CENTER);
//                            jFrame.add(buttonPanel2, BorderLayout.SOUTH);
//
//                            jFrame.setVisible(true);
//
//                            payButton.addActionListener(payEvent -> {
//                                if (confirmCheckBox.isSelected()) {
//                                    try {
//                                        float newBalance = currentBalance - zakatAmount;
//
//                                        String updateBalanceSQL = "UPDATE accounts SET balance = ? WHERE account_num = ?";
//                                        try (PreparedStatement updateStatement = connection
//                                                .prepareStatement(updateBalanceSQL)) {
//                                            updateStatement.setFloat(1, newBalance);
//                                            updateStatement.setInt(2, accountNumber);
//                                            updateStatement.executeUpdate();
//                                        }
//
//                                        String insertStatementSQL = "INSERT INTO BankStatement (account_id, transaction_date, description, Debit, Credit, balance_after_transaction) VALUES (?, ?, ?, ?, ?, ?)";
//                                        try (PreparedStatement insertStatement = connection
//                                                .prepareStatement(insertStatementSQL)) {
//                                            insertStatement.setInt(1, accountId);
//                                            insertStatement.setDate(2, new java.sql.Date(System.currentTimeMillis()));
//                                            insertStatement.setString(3, "Pay Zakat");
//                                            insertStatement.setBigDecimal(4, BigDecimal.valueOf(zakatAmount));
//                                            insertStatement.setBigDecimal(5, BigDecimal.ZERO);
//                                            insertStatement.setBigDecimal(6, BigDecimal.valueOf(newBalance));
//                                            insertStatement.executeUpdate();
//                                        }
//
//                                        JOptionPane.showMessageDialog(jFrame,
//                                                "Zakat payment successful! Your new balance is: " + newBalance);
//                                        jFrame.dispose();
//                                    } catch (SQLException ex) {
//                                        ex.printStackTrace();
//                                        JOptionPane.showMessageDialog(jFrame,
//                                                "Error updating balance. Please try again.");
//                                    }
//                                } else {
//                                    JOptionPane.showMessageDialog(jFrame,
//                                            "Please confirm to proceed with the payment.");
//                                }
//                            });
//
//                            exit.addActionListener(exitEvent -> jFrame.dispose());
//                        } else {
//                            JOptionPane.showMessageDialog(jFrame55, "Invalid account number!");
//                        }
//                    }
//                }
//            } catch (SQLException | NumberFormatException ex) {
//                ex.printStackTrace();
//                JOptionPane.showMessageDialog(jFrame55, "Error occurred. Please try again.");
//            }
//        });
//
//        exitButton.addActionListener(e -> {
//            jFrame55.dispose();
//            user();
//        });
//    }
//
//    void atm() {
//        JFrame jFrame11 = new JFrame();
//
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jFrame11.setIconImage(imageIcon.getImage());
//
//        jFrame11.setTitle("BANK OF SPAIN");
//        jFrame11.setResizable(false);
//        jFrame11.setSize(450, 450);
//        jFrame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame11.setLocationRelativeTo(null);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(null);
//
//        JLabel welcomeLabel = new JLabel("<html><center>======================================<br>"
//                + "================ATM MACHINE ==============<br>"
//                + "======================================<br><br><br><br><br>"
//                + "SCAN YOUR CARD<br>"
//                + "======================================<br>"
//                + "=      SCAN                          =<br>"
//                + "=          HERE                      =<br>"
//                + "=               YOUR                 =<br>"
//                + "=                     CARD           =<br>"
//                + "=                           !!       =<br>"
//                + "=                                    =<br>"
//                + "=======================================<br>"
//                + "SCANNING.........<br>"
//                + "<br>ENTER YOUR PIN</center></html>");
//        welcomeLabel.setBounds(50, 30, 400, 200);
//        panel.add(welcomeLabel);
//
//        pinField = new JTextField();
//        pinField.setBounds(180, 250, 100, 20);
//        panel.add(pinField);
//
//        submitButton = new JButton("Submit");
//        submitButton.setBounds(120, 280, 100, 20);
//        panel.add(submitButton);
//
//        clearButton = new JButton("Exit");
//        clearButton.setBounds(250, 280, 100, 20);
//        clearButton.addActionListener(this);
//        panel.add(clearButton);
//        jFrame11.add(panel);
//
//        jFrame11.setVisible(true);
//
//        submitButton.addActionListener(e -> {
//            try {
//                jFrame11.dispose();
//                int pin1 = Integer.parseInt(pinField.getText());
//                String selectAccountSQL = "SELECT * FROM accounts WHERE pin = ?";
//                PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//                selectStatement.setInt(1, pin1);
//                ResultSet resultSet = selectStatement.executeQuery();
//
//                if (resultSet.next()) {
//                    JFrame jFrame13 = new JFrame();
//                    jFrame13.setTitle("BANK OF SPAIN");
//                    jFrame13.setSize(800, 800);
//                    jFrame13.setResizable(false);
//                    jFrame13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                    jFrame13.setLocationRelativeTo(null);
//
//                    ImageIcon imageIcon2 = new ImageIcon("logo.png");
//                    jFrame13.setIconImage(imageIcon2.getImage());
//
//                    JLabel backgroundLabel = new JLabel(new ImageIcon("atm.png"));
//                    backgroundLabel.setLayout(null);
//
//                    JPanel panel1 = new JPanel();
//                    panel1.setLayout(null);
//                    panel1.setOpaque(false);
//
//                    JButton depositButton = new JButton("Deposit Money");
//                    depositButton.setBounds(140, 350, 150, 20);
//                    depositButton.setBackground(Color.GRAY);
//                    depositButton.setForeground(Color.BLACK);
//                    depositButton.setFocusable(false);
//                    backgroundLabel.add(depositButton);
//
//                    JButton withdrawButton = new JButton("Withdraw Money");
//                    withdrawButton.setBounds(300, 350, 150, 20);
//                    withdrawButton.setBackground(Color.GRAY);
//                    withdrawButton.setForeground(Color.BLACK);
//                    withdrawButton.setFocusable(false);
//                    backgroundLabel.add(withdrawButton);
//
//                    JButton changePINButton = new JButton("Change PIN");
//                    changePINButton.setBounds(140, 390, 150, 20);
//                    changePINButton.setBackground(Color.GRAY);
//                    changePINButton.setForeground(Color.BLACK);
//                    changePINButton.setFocusable(false);
//                    backgroundLabel.add(changePINButton);
//
//                    JButton checkBalanceButton = new JButton("Check Balance");
//                    checkBalanceButton.setBounds(300, 390, 150, 20);
//                    checkBalanceButton.setBackground(Color.GRAY);
//                    checkBalanceButton.setForeground(Color.BLACK);
//                    checkBalanceButton.setFocusable(false);
//                    backgroundLabel.add(checkBalanceButton);
//
//                    jFrame13.setContentPane(backgroundLabel);
//                    jFrame13.setVisible(true);
//                    depositButton.addActionListener(depositEvent -> {
//                        try {
//                            jFrame13.dispose();
//                            float currentBalance = resultSet.getFloat("balance");
//                            float depositAmount = Float
//                                    .parseFloat(JOptionPane.showInputDialog(jFrame13, "ENTER MONEY DEPOSIT IN BANK "));
//                            float newBalance = currentBalance + depositAmount;
//
//                            String updateBalanceSQL = "UPDATE accounts SET balance = ? WHERE pin = ?";
//                            PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                            updateStatement.setFloat(1, newBalance);
//                            updateStatement.setInt(2, pin1);
//                            updateStatement.executeUpdate();
//
//                            int accountId = resultSet.getInt("id");
//
//                            String insertStatementSQL = "INSERT INTO BankStatement (account_id, transaction_date, description, Debit, Credit, balance_after_transaction) VALUES (?, ?, ?, ?, ?, ?)";
//                            PreparedStatement statement = connection.prepareStatement(insertStatementSQL);
//                            statement.setInt(1, accountId);
//                            statement.setDate(2, new java.sql.Date(System.currentTimeMillis()));
//                            statement.setString(3, "Deposit Via Atm");
//                            statement.setBigDecimal(4, BigDecimal.ZERO);
//                            statement.setBigDecimal(5, BigDecimal.valueOf(depositAmount));
//                            statement.setBigDecimal(6, BigDecimal.valueOf(newBalance));
//                            statement.executeUpdate();
//
//                            String BankSQL = "SELECT bank_money FROM money WHERE id_bank = ?";
//                            PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                            selectStatement2.setInt(1, 2);
//                            ResultSet resultSet2 = selectStatement2.executeQuery();
//                            float total_bank_balance = 0.0f;
//                            if (resultSet2.next()) {
//                                float total_bank_balance_old = resultSet2.getFloat("bank_money");
//                                total_bank_balance = total_bank_balance_old + depositAmount;
//                            }
//
//                            String updateBalanceBankSQL = "UPDATE money SET bank_money = ? WHERE id_bank = ?";
//                            PreparedStatement updateBankStatement = connection.prepareStatement(updateBalanceBankSQL);
//                            updateBankStatement.setFloat(1, total_bank_balance);
//                            updateBankStatement.setInt(2, 2);
//                            updateBankStatement.executeUpdate();
//
//                            JOptionPane.showMessageDialog(jFrame13, "NOW YOUR NEW BALANCE IS: " + newBalance);
//                            atm();
//                        } catch (SQLException | NumberFormatException exception) {
//                            JOptionPane.showMessageDialog(jFrame13, "An error occurred. Please try again.", "Error",
//                                    JOptionPane.ERROR_MESSAGE);
//                        }
//                    });
//                    withdrawButton.addActionListener(withdrawEvent -> {
//                        try {
//                            jFrame13.dispose();
//                            float currentBalance = resultSet.getFloat("balance");
//                            float creditAmount = Float
//                                    .parseFloat(JOptionPane.showInputDialog(jFrame13, "ENTER WITHDRAW MONEY  "));
//                            if (currentBalance > creditAmount) {
//                                float newBalance = currentBalance - creditAmount;
//
//                                String updateBalanceSQL = "UPDATE accounts SET balance = ? WHERE pin = ?";
//                                PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                                updateStatement.setFloat(1, newBalance);
//                                updateStatement.setInt(2, pin1);
//                                updateStatement.executeUpdate();
//
//                                int accountId = resultSet.getInt("id");
//
//                                String insertStatementSQL = "INSERT INTO BankStatement (account_id, transaction_date, description, Debit, Credit, balance_after_transaction) VALUES (?, ?, ?, ?, ?, ?)";
//                                PreparedStatement statement = connection.prepareStatement(insertStatementSQL);
//                                statement.setInt(1, accountId);
//                                statement.setDate(2, new java.sql.Date(System.currentTimeMillis()));
//                                statement.setString(3, "WithDraw Via Atm");
//                                statement.setBigDecimal(4, BigDecimal.valueOf(creditAmount));
//                                statement.setBigDecimal(5, BigDecimal.ZERO);
//                                statement.setBigDecimal(6, BigDecimal.valueOf(newBalance));
//                                statement.executeUpdate();
//
//                                String BankSQL = "SELECT bank_money FROM money WHERE id_bank = ?";
//                                PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                                selectStatement2.setInt(1, 2);
//                                ResultSet resultSet2 = selectStatement2.executeQuery();
//                                float total_bank_balance = 0.0f;
//                                if (resultSet2.next()) {
//                                    float total_bank_balance_old = resultSet2.getFloat("bank_money");
//                                    total_bank_balance = total_bank_balance_old - creditAmount;
//                                }
//                                String updateBalanceBankSQL = "UPDATE money SET bank_money = ? WHERE id_bank = ?";
//                                PreparedStatement updateBankStatement = connection
//                                        .prepareStatement(updateBalanceBankSQL);
//                                updateBankStatement.setFloat(1, total_bank_balance);
//                                updateBankStatement.setInt(2, 2);
//                                updateBankStatement.executeUpdate();
//
//                                JOptionPane.showMessageDialog(jFrame13, "NOW YOUR NEW BALANCE IS: " + newBalance);
//                                atm();
//                            } else {
//                                JOptionPane.showMessageDialog(jFrame13, "INSUFFICIENT FUNDS");
//                            }
//                        } catch (SQLException | NumberFormatException exception) {
//                            JOptionPane.showMessageDialog(jFrame13, "An error occurred. Please try again.", "Error",
//                                    JOptionPane.ERROR_MESSAGE);
//                        }
//                    });
//
//                    changePINButton.addActionListener(changePinEvent -> {
//                        try {
//                            jFrame13.dispose();
//                            int newPin = Integer.parseInt(JOptionPane.showInputDialog(jFrame13, "ENTER YOUR NEW PIN "));
//                            String checkPinSQL = "SELECT pin FROM accounts WHERE pin = ?";
//                            PreparedStatement pinCheckStatement = connection.prepareStatement(checkPinSQL);
//                            pinCheckStatement.setInt(1, newPin);
//                            ResultSet pinResultSet = pinCheckStatement.executeQuery();
//                            if (pinResultSet.next()) {
//                                JOptionPane.showMessageDialog(jFrame13,
//                                        "New PIN is already present. Please choose another PIN.");
//                            } else {
//                                String updatePinSQL = "UPDATE accounts SET pin = ? WHERE pin = ?";
//                                PreparedStatement updateStatement = connection.prepareStatement(updatePinSQL);
//                                updateStatement.setInt(1, newPin);
//                                updateStatement.setInt(2, pin1);
//                                int rowsAffected = updateStatement.executeUpdate();
//                                if (rowsAffected > 0) {
//                                    JOptionPane.showMessageDialog(jFrame13, "PIN updated successfully.");
//                                    atm();
//                                } else {
//                                    JOptionPane.showMessageDialog(jFrame13, "Failed to update PIN.");
//                                }
//                            }
//                        } catch (SQLException | NumberFormatException exception) {
//                            JOptionPane.showMessageDialog(jFrame13, "An error occurred. Please try again.", "Error",
//                                    JOptionPane.ERROR_MESSAGE);
//                        }
//                    });
//
//                    checkBalanceButton.addActionListener(checkBalanceEvent -> {
//                        try {
//                            jFrame13.dispose();
//                            JOptionPane.showMessageDialog(jFrame13,
//                                    "YOUR TOTAL BALANCE IS THIS " + resultSet.getFloat("balance"));
//                        } catch (SQLException exception) {
//                            JOptionPane.showMessageDialog(jFrame13, "An error occurred. Please try again.", "Error",
//                                    JOptionPane.ERROR_MESSAGE);
//                        }
//                    });
//                } else {
//                    JOptionPane.showMessageDialog(jFrame11, "YOUR PIN IS NOT CORRECT");
//                }
//            } catch (SQLException | NumberFormatException exception) {
//                JOptionPane.showMessageDialog(jFrame11, "Invalid PIN. Please enter a number.", "Error",
//                        JOptionPane.ERROR_MESSAGE);
//            } catch (Exception exception) {
//                JOptionPane.showMessageDialog(jFrame11, "An error occurred. Please try again.", "Error",
//                        JOptionPane.ERROR_MESSAGE);
//            }
//        });
//
//        clearButton.addActionListener(e -> {
//            jFrame11.dispose();
//            user();
//        });
//    }
//
//    void loan() {
//        try {
//            JFrame jFrame10 = new JFrame();
//            ImageIcon imageIcon = new ImageIcon("logo.png");
//            jFrame10.setIconImage(imageIcon.getImage());
//
//            jFrame10.setTitle("BANK OF SPAIN");
//            jFrame10.setSize(400, 200);
//            jFrame10.setLayout(null);
//            jFrame10.setResizable(false);
//            jFrame10.setLocationRelativeTo(null);
//            accountNumberLabel = new JLabel("Account Number: ");
//            accountNumberLabel.setBounds(20, 20, 120, 20);
//            jFrame10.add(accountNumberLabel);
//
//            accountNumberField = new JTextField();
//            accountNumberField.setBounds(150, 20, 200, 20);
//            jFrame10.add(accountNumberField);
//
//            submitButton = new JButton("Submit");
//            submitButton.setBounds(150, 100, 100, 30);
//            submitButton.addActionListener(this);
//            jFrame10.add(submitButton);
//
//            clearButton = new JButton("Exit");
//            clearButton.setBounds(260, 100, 100, 30);
//            clearButton.addActionListener(this);
//            jFrame10.add(clearButton);
//
//            jFrame10.setVisible(true);
//            jFrame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            submitButton.addActionListener(e -> {
//                try {
//                    int accountNumber = Integer.parseInt(accountNumberField.getText());
//                    String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//                    PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//                    selectStatement.setInt(1, accountNumber);
//                    ResultSet resultSet = selectStatement.executeQuery();
//
//                    if (resultSet.next()) {
//                        float totalBalance = resultSet.getFloat("balance");
//                        float loanLimit = 200000;
//
//                        JOptionPane.showMessageDialog(this, "YOUR ACCOUNT IS PRESENT IN THE BANK", "Information",
//                                JOptionPane.INFORMATION_MESSAGE);
//
//                        if (totalBalance <= loanLimit) {
//                            float requestedLoan = Float
//                                    .parseFloat(JOptionPane.showInputDialog(this, "ENTER THE AMOUNT FOR THE LOAN"));
//                            String selectBankSQL = "SELECT bank_money FROM money WHERE id_bank = ?";
//                            PreparedStatement bankStatement = connection.prepareStatement(selectBankSQL);
//                            bankStatement.setInt(1, 2);
//                            ResultSet bankResultSet = bankStatement.executeQuery();
//
//                            float oldLoan = resultSet.getFloat("loan");
//
//                            if (bankResultSet.next()) {
//                                float totalBankBalance = bankResultSet.getFloat("bank_money");
//                                if (totalBankBalance >= requestedLoan) {
//                                    JOptionPane.showMessageDialog(this, "YOUR LOAN REQUEST IS ACCEPTED", "Information",
//                                            JOptionPane.INFORMATION_MESSAGE);
//                                    float newBalance = totalBalance + requestedLoan;
//                                    float newLoan = oldLoan + requestedLoan;
//
//                                    String updateBalanceSQL = "UPDATE accounts SET balance = ?, loan = ? WHERE account_num = ?";
//                                    PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                                    updateStatement.setFloat(1, newBalance);
//                                    updateStatement.setFloat(2, newLoan);
//                                    updateStatement.setInt(3, accountNumber);
//                                    updateStatement.executeUpdate();
//
//                                    int accountId = resultSet.getInt("id");
//
//                                    String insertStatementSQL = "INSERT INTO BankStatement (account_id, transaction_date, description, Debit, Credit, balance_after_transaction) VALUES (?, ?, ?, ?, ?, ?)";
//                                    PreparedStatement statement = connection.prepareStatement(insertStatementSQL);
//                                    statement.setInt(1, accountId);
//                                    statement.setDate(2, new java.sql.Date(System.currentTimeMillis()));
//                                    statement.setString(3, "Loan ");
//                                    statement.setBigDecimal(4, BigDecimal.ZERO);
//                                    statement.setBigDecimal(5, BigDecimal.valueOf(requestedLoan));
//                                    statement.setBigDecimal(6, BigDecimal.valueOf(newBalance));
//                                    statement.executeUpdate();
//                                    String BankSQL = "SELECT bank_money, loan FROM money WHERE id_bank = ?";
//                                    PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                                    selectStatement2.setInt(1, 2);
//                                    ResultSet resultSet2 = selectStatement2.executeQuery();
//                                    float total_bank_balance = 0.0f;
//                                    float old_bank_loan = 0.0f;
//                                    if (resultSet2.next()) {
//                                        float total_bank_balance_old = resultSet2.getFloat("bank_money");
//                                        float old_bank_loan_old = resultSet2.getFloat("loan");
//                                        total_bank_balance = total_bank_balance_old - requestedLoan;
//                                        old_bank_loan = old_bank_loan_old + requestedLoan;
//                                    }
//
//                                    String updateBalanceBankSQL = "UPDATE money SET bank_money = ?, loan = ? WHERE id_bank = ?";
//                                    PreparedStatement updateBankStatement = connection
//                                            .prepareStatement(updateBalanceBankSQL);
//                                    updateBankStatement.setFloat(1, total_bank_balance);
//                                    updateBankStatement.setFloat(2, old_bank_loan);
//                                    updateBankStatement.setInt(3, 2);
//                                    updateBankStatement.executeUpdate();
//
//                                    JOptionPane.showMessageDialog(this, "YOUR TOTAL BALANCE IS: " + newBalance,
//                                            "Information", JOptionPane.INFORMATION_MESSAGE);
//
//                                    JOptionPane.showMessageDialog(this, "NOW YOU CAN REPAY YOUR LOAN WITHIN ONE YEAR",
//                                            "Information", JOptionPane.INFORMATION_MESSAGE);
//                                } else {
//                                    JOptionPane.showMessageDialog(this, "INSUFFICIENT FUNDS IN THE BANK", "Error",
//                                            JOptionPane.ERROR_MESSAGE);
//                                }
//                            }
//                        } else {
//                            JOptionPane.showMessageDialog(this,
//                                    "YOUR REQUEST IS NOT ACCEPTED BECAUSE YOUR TOTAL BALANCE IS MORE THAN " + loanLimit,
//                                    "Error", JOptionPane.ERROR_MESSAGE);
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(this, "INVALID ACCOUNT NUMBER", "Error",
//                                JOptionPane.ERROR_MESSAGE);
//                    }
//                } catch (SQLException | NumberFormatException ex) {
//                    ex.printStackTrace();
//                }
//            });
//            clearButton.addActionListener(e -> {
//                jFrame10.dispose();
//                user();
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    void repayLoan() {
//        try {
//            JFrame jFrame9 = new JFrame();
//
//            ImageIcon imageIcon = new ImageIcon("logo.png");
//            jFrame9.setIconImage(imageIcon.getImage());
//
//            jFrame9.setTitle("BANK OF SPAIN");
//            jFrame9.setSize(400, 200);
//            jFrame9.setLayout(null);
//            jFrame9.setResizable(false);
//            jFrame9.setLocationRelativeTo(null);
//
//            accountNumberLabel = new JLabel("Account Number: ");
//            accountNumberLabel.setBounds(20, 20, 120, 20);
//            jFrame9.add(accountNumberLabel);
//
//            accountNumberField = new JTextField();
//            accountNumberField.setBounds(150, 20, 200, 20);
//            jFrame9.add(accountNumberField);
//
//            submitButton = new JButton("Submit");
//            submitButton.setBounds(150, 100, 100, 30);
//            submitButton.addActionListener(this);
//            jFrame9.add(submitButton);
//
//            clearButton = new JButton(" Exit");
//            clearButton.setBounds(260, 100, 100, 30);
//            clearButton.addActionListener(this);
//            jFrame9.add(clearButton);
//
//            jFrame9.setVisible(true);
//            jFrame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            submitButton.addActionListener(e -> {
//                try {
//                    int accountNumber = Integer.parseInt(accountNumberField.getText());
//                    String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//                    PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//                    selectStatement.setInt(1, accountNumber);
//                    ResultSet resultSet = selectStatement.executeQuery();
//
//                    if (resultSet.next()) {
//                        float currentLoan = resultSet.getFloat("loan");
//
//                        if (currentLoan > 0) {
//                            JOptionPane.showMessageDialog(this, "YOUR CURRENT LOAN AMOUNT TO REPAY: " + currentLoan);
//                            float repaymentAmount = Float
//                                    .parseFloat(JOptionPane.showInputDialog(this, "ENTER AMOUNT TO REPAY: "));
//
//                            if (repaymentAmount <= currentLoan && repaymentAmount > 0) {
//                                float newLoan = currentLoan - repaymentAmount;
//                                float newBalance = resultSet.getFloat("balance") - repaymentAmount;
//
//                                String updateBalanceSQL = "UPDATE accounts SET balance = ?, loan = ? WHERE account_num = ?";
//                                PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                                updateStatement.setFloat(1, newBalance);
//                                updateStatement.setFloat(2, newLoan);
//                                updateStatement.setInt(3, accountNumber);
//                                updateStatement.executeUpdate();
//                                int accountId = resultSet.getInt("id");
//
//                                String insertStatementSQL = "INSERT INTO BankStatement (account_id, transaction_date, description, Debit, Credit, balance_after_transaction) VALUES (?, ?, ?, ?, ?, ?)";
//                                PreparedStatement statement = connection.prepareStatement(insertStatementSQL);
//                                statement.setInt(1, accountId);
//                                statement.setDate(2, new java.sql.Date(System.currentTimeMillis()));
//                                statement.setString(3, "Loan Repay");
//                                statement.setBigDecimal(4, BigDecimal.valueOf(repaymentAmount));
//                                statement.setBigDecimal(5, BigDecimal.ZERO);
//                                statement.setBigDecimal(6, BigDecimal.valueOf(newBalance));
//                                statement.executeUpdate();
//
//                                String BankSQL = "SELECT bank_money, loan FROM money WHERE id_bank = ?";
//                                PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                                selectStatement2.setInt(1, 2);
//                                ResultSet resultSet2 = selectStatement2.executeQuery();
//                                float total_bank_balance = 0.0f;
//                                float old_bank_loan = 0.0f;
//                                if (resultSet2.next()) {
//                                    float total_bank_balance_old = resultSet2.getFloat("bank_money");
//                                    float old_bank_loan_old = resultSet2.getFloat("loan");
//                                    total_bank_balance = total_bank_balance_old + repaymentAmount;
//                                    old_bank_loan = old_bank_loan_old - repaymentAmount;
//                                }
//
//                                String updateBalanceBankSQL = "UPDATE money SET bank_money = ?, loan = ? WHERE id_bank = ?";
//                                PreparedStatement updateBankStatement = connection
//                                        .prepareStatement(updateBalanceBankSQL);
//                                updateBankStatement.setFloat(1, total_bank_balance);
//                                updateBankStatement.setFloat(2, old_bank_loan);
//                                updateBankStatement.setInt(3, 2);
//                                updateBankStatement.executeUpdate();
//
//                                JOptionPane.showMessageDialog(this, "LOAN REPAYED SUCCESSFULLY!");
//                                JOptionPane.showMessageDialog(this, "YOUR REMAINING LOAN AMOUNT: " + newLoan);
//                                JOptionPane.showMessageDialog(this, "YOUR NEW BALANCE: " + newBalance);
//                            } else {
//                                JOptionPane.showMessageDialog(this,
//                                        "INVALID REPAYMENT AMOUNT. PLEASE ENTER A VALID AMOUNT GREATER THAN 0 AND LESS THAN OR EQUAL TO CURRENT LOAN AMOUNT.");
//                            }
//                        } else {
//                            JOptionPane.showMessageDialog(this, "YOU DON'T HAVE ANY OUTSTANDING LOAN TO REPAY.");
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(this, "YOU ENTERED WRONG ACCOUNT NUMBER.");
//                    }
//                } catch (SQLException | NumberFormatException ex) {
//                    ex.printStackTrace();
//                }
//            });
//            clearButton.addActionListener(e -> {
//                jFrame9.dispose();
//                user();
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
//
//    void manager_loan() {
//        try {
//            JFrame jFrame8 = new JFrame();
//            ImageIcon imageIcon = new ImageIcon("logo.png");
//            jFrame8.setIconImage(imageIcon.getImage());
//
//            jFrame8.setTitle("BANK OF SPAIN");
//
//            jFrame8.setSize(450, 380);
//            jFrame8.setLocationRelativeTo(null);
//            jFrame8.setResizable(false);
//            JPanel panel = new JPanel();
//            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//            JScrollPane scrollPane = new JScrollPane(panel);
//            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//            jFrame8.getContentPane().add(scrollPane);
//
//            String count_query = "SELECT count(*) AS count FROM accounts where loan >= 1";
//            PreparedStatement statement_count = connection.prepareStatement(count_query);
//            ResultSet resultSet4 = statement_count.executeQuery();
//            resultSet4.next();
//            int number_count = resultSet4.getInt("count");
//
//            String selectAccountsSQL = "SELECT account_num, name, father_name, loan FROM accounts WHERE loan >= 1";
//            PreparedStatement selectStatement = connection.prepareStatement(selectAccountsSQL);
//            ResultSet resultSet = selectStatement.executeQuery();
//            JLabel titleLabel5 = new JLabel("LOAN CHECK");
//            panel.add(titleLabel5);
//            JLabel titleLabel = new JLabel("ACCOUNT DETAILS");
//            panel.add(titleLabel);
//            JLabel titleLabel6 = new JLabel(number_count + " ACCOUNTS ARE TAKE LOAN FROM  BANK.");
//            panel.add(titleLabel6);
//            JLabel titleLabel4 = new JLabel("ACCOUNT NUMBERS AND CUSTOMER NAME AND LOAN ");
//            panel.add(titleLabel4);
//
//            int yset = 50;
//
//            while (resultSet.next()) {
//                int accountNum = resultSet.getInt("account_num");
//                String name = resultSet.getString("name");
//                String fatherName = resultSet.getString("father_name");
//                float loan = resultSet.getFloat("loan");
//
//                JLabel accountNumberLabel = new JLabel("ACCOUNT NUMBER: " + accountNum);
//                panel.add(accountNumberLabel);
//
//                JLabel nameLabel = new JLabel("NAME: " + name + " " + fatherName);
//                panel.add(nameLabel);
//
//                JLabel loanLabel = new JLabel("LOAN: " + loan);
//                panel.add(loanLabel);
//
//                JLabel line = new JLabel("-------------------------------------------------------------");
//                panel.add(line);
//
//                yset += 100;
//            }
//
//            JLabel accountNumberLabel = new JLabel("TO SHOW ENTER Account Number: ");
//            panel.add(accountNumberLabel);
//
//            JTextField accountNumberField = new JTextField();
//            panel.add(accountNumberField);
//
//            JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//            JButton submitButton = new JButton("Submit");
//            buttonsPanel.add(submitButton);
//
//            JButton closeButton = new JButton("Exit");
//            buttonsPanel.add(closeButton);
//
//            panel.add(buttonsPanel);
//
//            submitButton.addActionListener(e -> {
//                try {
//                    int accountNumber = Integer.parseInt(accountNumberField.getText());
//                    String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//                    PreparedStatement selectStatement2 = connection.prepareStatement(selectAccountSQL);
//                    selectStatement2.setInt(1, accountNumber);
//                    ResultSet resultSet2 = selectStatement2.executeQuery();
//
//                    if (resultSet2.next()) {
//                        StringBuilder details = new StringBuilder();
//                        details.append("Account details:\n");
//                        details.append("Name: ").append(resultSet2.getString("name")).append(" ")
//                                .append(resultSet2.getString("father_name")).append("\n");
//                        details.append("Account type: ").append(resultSet2.getString("account_type")).append("\n");
//                        details.append("Date of Birth: ").append(resultSet2.getString("dob")).append("\n");
//                        details.append("Nationality: ").append(resultSet2.getString("nationality")).append("\n");
//                        details.append("Address: ").append(resultSet2.getString("address")).append("\n");
//                        details.append("Marital Status: ").append(resultSet2.getString("marital_status")).append("\n");
//                        details.append("Qualification: ").append(resultSet2.getString("qualification")).append("\n");
//                        details.append("Phone Number: ").append(resultSet2.getString("phone_num")).append("\n");
//                        details.append("Your Account Number: ").append(resultSet2.getInt("account_num")).append("\n");
//                        details.append("Total Balance is: ").append(resultSet2.getFloat("balance")).append("\n");
//                        details.append("Account Open Date: ").append(resultSet2.getDate(("open_date"))).append("\n");
//                        if (resultSet2.getFloat("loan") > 1) {
//                            details.append("Loan is: ").append(resultSet2.getFloat("loan")).append("\n");
//                        }
//
//                        JTextArea displayArea = new JTextArea(details.toString());
//                        displayArea.setEditable(false);
//                        JScrollPane scrollPane2 = new JScrollPane(displayArea);
//                        panel.add(scrollPane2);
//                    } else {
//                        JOptionPane.showMessageDialog(jFrame8, "ACCOUNT NUMBER IS WRONG");
//                    }
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            });
//
//            closeButton.addActionListener(e -> {
//                jFrame8.dispose();
//                manager1();
//
//            });
//
//            jFrame8.setVisible(true);
//            jFrame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    void show_total_bank_balance() {
//        try {
//            JFrame jFrame7 = new JFrame();
//            ImageIcon imageIcon = new ImageIcon("logo.png");
//            jFrame7.setIconImage(imageIcon.getImage());
//
//            jFrame7.setTitle("BANK OF SPAIN");
//
//            jFrame7.setSize(500, 150);
//            jFrame7.setLayout(null);
//            jFrame7.setResizable(false);
//            jFrame7.setLocationRelativeTo(null);
//            String BankSQL = "SELECT Bank_money, loan FROM money WHERE id_bank = ?";
//            PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//            selectStatement2.setInt(1, 2);
//            ResultSet resultSet = selectStatement2.executeQuery();
//
//            JLabel bankBalanceLabel = new JLabel();
//            JLabel loanAmountLabel = new JLabel();
//            JLabel loanAmount = new JLabel();
//
//            if (resultSet.next()) {
//                bankBalanceLabel.setText("Total money in bank: " + resultSet.getString("Bank_money"));
//                loanAmountLabel.setText("Money to be returned to bank in the form of loan: ");
//                loanAmount.setText(
//                        "                                                                                       "
//                                + resultSet.getString("loan"));
//            } else {
//                bankBalanceLabel.setText("No records found for bank balance.");
//                loanAmountLabel.setText("");
//                loanAmount.setText("");
//            }
//
//            bankBalanceLabel.setBounds(20, 20, 350, 20);
//            loanAmountLabel.setBounds(20, 40, 350, 40);
//            loanAmount.setBounds(20, 40, 350, 60);
//
//            jFrame7.add(bankBalanceLabel);
//            jFrame7.add(loanAmountLabel);
//            jFrame7.add(loanAmount);
//
//            jFrame7.setVisible(true);
//            jFrame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        } catch (SQLException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//
//    void showAccount() {
//        try {
//            JFrame jFrame6 = new JFrame();
//            ImageIcon imageIcon = new ImageIcon("logo.png");
//            jFrame6.setIconImage(imageIcon.getImage());
//
//            jFrame6.setTitle("BANK OF SPAIN");
//            jFrame6.setSize(450, 450);
//            jFrame6.setLocationRelativeTo(null);
//            jFrame6.setResizable(false);
//            JPanel panel = new JPanel();
//            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//            JScrollPane scrollPane = new JScrollPane(panel);
//            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//            jFrame6.getContentPane().add(scrollPane);
//
//            String count_query = "SELECT count(*) AS count FROM accounts";
//            PreparedStatement statement_count = connection.prepareStatement(count_query);
//            ResultSet resultSet4 = statement_count.executeQuery();
//            resultSet4.next();
//            int number_count = resultSet4.getInt("count");
//
//            String selectAccountsSQL = "SELECT account_num, name, father_name,balance FROM accounts";
//            PreparedStatement selectStatement1 = connection.prepareStatement(selectAccountsSQL);
//            ResultSet resultSet = selectStatement1.executeQuery();
//
//            JLabel titleLabel = new JLabel("ACCOUNT DETAILS");
//            panel.add(titleLabel);
//            JLabel titleLabel6 = new JLabel(number_count + " ACCOUNTS ARE OPEN IN BANK.");
//            panel.add(titleLabel6);
//            JLabel titleLabel4 = new JLabel("ALL ACCOUNT NUMBERS AND CUSTOMER NAME");
//            panel.add(titleLabel4);
//
//            int yset = 50;
//
//            while (resultSet.next()) {
//                int accountNum = resultSet.getInt("account_num");
//                String name = resultSet.getString("name");
//                String fatherName = resultSet.getString("father_name");
//                float balance = resultSet.getFloat("balance");
//
//                JLabel accountNumberLabel = new JLabel("ACCOUNT NUMBER: " + accountNum);
//                panel.add(accountNumberLabel);
//
//                JLabel nameLabel = new JLabel("NAME: " + name + " " + fatherName);
//                panel.add(nameLabel);
//                JLabel balanceLabel = new JLabel("Balance:" + balance);
//                panel.add(balanceLabel);
//
//                JLabel line = new JLabel("-------------------------------------------------------------");
//                panel.add(line);
//
//                yset += 100;
//            }
//
//            JLabel accountNumberLabel = new JLabel("ENTER Account Number: ");
//            panel.add(accountNumberLabel);
//
//            JTextField accountNumberField = new JTextField();
//            panel.add(accountNumberField);
//
//            JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//            JButton submitButton = new JButton("Submit");
//            buttonsPanel.add(submitButton);
//
//            JButton closeButton = new JButton("Exit");
//            buttonsPanel.add(closeButton);
//
//            panel.add(buttonsPanel);
//
//            submitButton.addActionListener(e -> {
//                try {
//                    int accountNumber = Integer.parseInt(accountNumberField.getText());
//
//                    String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//                    PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//                    selectStatement.setInt(1, accountNumber);
//                    ResultSet accountResultSet = selectStatement.executeQuery();
//
//                    if (accountResultSet.next()) {
//                        StringBuilder details = new StringBuilder();
//                        details.append("Account details:\n");
//                        details.append("Name: ").append(accountResultSet.getString("name")).append(" ")
//                                .append(accountResultSet.getString("father_name")).append("\n");
//                        details.append("Account type: ").append(accountResultSet.getString("account_type"))
//                                .append("\n");
//                        details.append("Date of Birth: ").append(accountResultSet.getString("dob")).append("\n");
//                        details.append("Nationality: ").append(accountResultSet.getString("nationality")).append("\n");
//                        details.append("Address: ").append(accountResultSet.getString("address")).append("\n");
//                        details.append("Marital Status: ").append(accountResultSet.getString("marital_status"))
//                                .append("\n");
//                        details.append("Qualification: ").append(accountResultSet.getString("qualification"))
//                                .append("\n");
//                        details.append("Phone Number: ").append(accountResultSet.getString("phone_num")).append("\n");
//                        details.append("Your Account Number: ").append(accountResultSet.getInt("account_num"))
//                                .append("\n");
//                        details.append("Total Balance is: ").append(accountResultSet.getFloat("balance")).append("\n");
//                        details.append("Account Open Date: ").append(accountResultSet.getDate("open_date"))
//                                .append("\n");
//                        if (accountResultSet.getFloat("loan") > 1) {
//                            details.append("Loan is: ").append(accountResultSet.getFloat("loan")).append("\n");
//                        }
//
//                        JTextArea displayArea = new JTextArea(details.toString());
//                        displayArea.setEditable(false);
//                        JScrollPane scrollPane3 = new JScrollPane(displayArea);
//                        scrollPane3.setBounds(20, 140, 350, 150);
//                        panel.add(scrollPane3);
//                    } else {
//                        JOptionPane.showMessageDialog(panel, "ACCOUNT NUMBER IS WRONG");
//                    }
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            });
//
//            closeButton.addActionListener(e -> {
//                jFrame6.dispose();
//                manager1();
//            });
//
//            jFrame6.setVisible(true);
//            jFrame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    void delete_Account() {
//        try {
//            JFrame jFrame5 = new JFrame();
//            ImageIcon imageIcon = new ImageIcon("logo.png");
//            jFrame5.setIconImage(imageIcon.getImage());
//
//            jFrame5.setTitle("BANK OF SPAIN");
//            jFrame5.setSize(450, 650);
//            jFrame5.setLocationRelativeTo(null);
//            jFrame5.setResizable(false);
//            JPanel panel = new JPanel();
//            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//            JScrollPane scrollPane = new JScrollPane(panel);
//            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//            jFrame5.getContentPane().add(scrollPane);
//
//            String count_query = "SELECT count(*) AS count FROM accounts";
//            PreparedStatement statement_count = connection.prepareStatement(count_query);
//            ResultSet resultSet4 = statement_count.executeQuery();
//            resultSet4.next();
//            int number_count = resultSet4.getInt("count");
//
//            String selectAccountsSQL = "SELECT account_num, name, father_name, loan FROM accounts";
//            PreparedStatement selectStatement1 = connection.prepareStatement(selectAccountsSQL);
//            ResultSet resultSet = selectStatement1.executeQuery();
//
//            JLabel titleLabel = new JLabel("ACCOUNT DETAILS");
//            panel.add(titleLabel);
//            JLabel titleLabel6 = new JLabel(number_count + " ACCOUNTS ARE OPEN IN BANK.");
//            panel.add(titleLabel6);
//            JLabel titleLabel4 = new JLabel("ALL ACCOUNT NUMBERS AND CUSTOMER NAME");
//            panel.add(titleLabel4);
//
//            int yset = 50;
//
//            while (resultSet.next()) {
//                int accountNum = resultSet.getInt("account_num");
//                String name = resultSet.getString("name");
//                String fatherName = resultSet.getString("father_name");
//                float loan = resultSet.getFloat("loan");
//
//                JLabel accountNumberLabel = new JLabel("ACCOUNT NUMBER: " + accountNum);
//                panel.add(accountNumberLabel);
//
//                JLabel nameLabel = new JLabel("NAME: " + name + " " + fatherName);
//                panel.add(nameLabel);
//
//                JLabel loanLabel = new JLabel("LOAN: " + loan);
//                panel.add(loanLabel);
//
//                JLabel line = new JLabel("-------------------------------------------------------------");
//                panel.add(line);
//
//                yset += 100;
//            }
//
//            JLabel accountNumberLabel = new JLabel("ENTER Account Number: ");
//            panel.add(accountNumberLabel);
//
//            JTextField accountNumberField = new JTextField();
//            panel.add(accountNumberField);
//
//            JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//            JButton submitButton = new JButton("Submit");
//            buttonsPanel.add(submitButton);
//
//            JButton exitButton = new JButton("Exit");
//            buttonsPanel.add(exitButton);
//
//            panel.add(buttonsPanel);
//
//            submitButton.addActionListener(e -> {
//                try {
//                    int accountNumber = Integer.parseInt(accountNumberField.getText());
//
//                    String deleteAccountSQL = "DELETE FROM accounts WHERE account_num = ?";
//                    PreparedStatement deleteStatement = connection.prepareStatement(deleteAccountSQL);
//                    deleteStatement.setInt(1, accountNumber);
//                    int rowsAffected = deleteStatement.executeUpdate();
//
//                    if (rowsAffected > 0) {
//                        JOptionPane.showMessageDialog(jFrame5, "Account deleted successfully.");
//                    } else {
//                        JOptionPane.showMessageDialog(jFrame5, "Account not found with the given account number.");
//                    }
//
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            });
//
//            exitButton.addActionListener(e -> {
//                jFrame5.dispose();
//                manager1();
//            });
//
//            jFrame5.setVisible(true);
//            jFrame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    void updateAccount() {
//        frame = new JFrame();
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        frame.setIconImage(imageIcon.getImage());
//
//        frame.setTitle(" BANK OF SPAIN");
//        frame.setSize(400, 150);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new BorderLayout());
//        frame.setResizable(false);
//        frame.setLocationRelativeTo(null);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(4, 2));
//
//        JTextField accountNumberField = new JTextField(20);
//        String[] fields = { "Name", "Father Name", "Account Type", "Date of Birth", "Nationality", "Address",
//                "Phone Number", "Email", "Marital Status", "Qualification", "PIN" };
//        JComboBox<String> fieldSelector = new JComboBox<>(fields);
//        JTextField newValueField = new JTextField(20);
//
//        JPanel panel1 = new JPanel();
//        panel1.add(new JLabel("Update Account Details "));
//        panel.add(new JLabel("Account Number:"));
//        panel.add(accountNumberField);
//        panel.add(new JLabel("Select Field to Update:"));
//        panel.add(fieldSelector);
//        panel.add(new JLabel("New Value:"));
//        panel.add(newValueField);
//
//        submitButton = new JButton("Update");
//        panel.add(submitButton, BorderLayout.LINE_END);
//        closeButton = new JButton("Exit");
//        panel.add(closeButton, BorderLayout.LINE_START);
//
//        submitButton.addActionListener(e -> {
//            try {
//                String accountNumber = accountNumberField.getText();
//                String selectedField = (String) fieldSelector.getSelectedItem();
//                String newValue = newValueField.getText();
//
//                if (accountNumber.isEmpty() || newValue.isEmpty()) {
//                    JOptionPane.showMessageDialog(frame, "Please fill all fields.");
//                    return;
//                }
//
//                String updateSQL;
//                PreparedStatement preparedStatement;
//
//                switch (selectedField) {
//                    case "Name":
//                        updateSQL = "UPDATE accounts SET name = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setString(1, newValue);
//                        break;
//                    case "Father Name":
//                        updateSQL = "UPDATE accounts SET father_name = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setString(1, newValue);
//                        break;
//                    case "Account Type":
//                        updateSQL = "UPDATE accounts SET account_type = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setString(1, newValue);
//                        break;
//                    case "Date of Birth":
//                        updateSQL = "UPDATE accounts SET dob = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setString(1, newValue);
//                        break;
//                    case "Nationality":
//                        updateSQL = "UPDATE accounts SET nationality = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setString(1, newValue);
//                        break;
//                    case "Address":
//                        updateSQL = "UPDATE accounts SET address = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setString(1, newValue);
//                        break;
//                    case "Phone Number":
//                        updateSQL = "UPDATE accounts SET phone_num = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setString(1, newValue);
//                        break;
//                    case "Email":
//                        updateSQL = "UPDATE accounts SET email = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setString(1, newValue);
//                        break;
//                    case "Marital Status":
//                        updateSQL = "UPDATE accounts SET marital_status = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setString(1, newValue);
//                        break;
//                    case "Qualification":
//                        updateSQL = "UPDATE accounts SET qualification = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setString(1, newValue);
//                        break;
//                    case "PIN":
//                        int pin;
//                        try {
//                            pin = Integer.parseInt(newValue);
//                        } catch (NumberFormatException ex) {
//                            JOptionPane.showMessageDialog(frame, "Please enter PIN in numbers.");
//                            return;
//                        }
//                        String checkPinSQL = "SELECT pin FROM accounts WHERE pin = ?";
//                        PreparedStatement pinCheckStatement = connection.prepareStatement(checkPinSQL);
//                        pinCheckStatement.setInt(1, pin);
//                        ResultSet pinResultSet = pinCheckStatement.executeQuery();
//                        if (pinResultSet.next()) {
//                            JOptionPane.showMessageDialog(frame, "PIN is already in use. Please enter another PIN.");
//                            return;
//                        }
//                        updateSQL = "UPDATE accounts SET pin = ? WHERE account_num = ?";
//                        preparedStatement = connection.prepareStatement(updateSQL);
//                        preparedStatement.setInt(1, pin);
//                        break;
//                    default:
//                        JOptionPane.showMessageDialog(frame, "Invalid field selected.");
//                        return;
//                }
//
//                preparedStatement.setString(2, accountNumber);
//                int rowsUpdated = preparedStatement.executeUpdate();
//                if (rowsUpdated > 0) {
//                    JOptionPane.showMessageDialog(frame, "Account updated successfully.");
//                } else {
//                    JOptionPane.showMessageDialog(frame, "Account number not found.");
//                }
//
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        });
//
//        closeButton.addActionListener(e -> {
//            frame.dispose();
//            manager1();
//        });
//
//        panel.add(submitButton);
//        frame.add(panel1, BorderLayout.NORTH);
//        frame.add(panel, BorderLayout.CENTER);
//        frame.setVisible(true);
//    }
//
//    void manager1() {
//        JFrame jFrame4 = new JFrame();
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jFrame4.setIconImage(imageIcon.getImage());
//
//        jFrame4.setTitle("BANK OF SPAIN");
//        jFrame4.setSize(400, 120);
//        jFrame4.setLocationRelativeTo(null);
//        jFrame4.setResizable(false);
//        JPanel panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//
//        JLabel titleLabel = new JLabel("MANAGER MODE");
//        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//        panel.add(titleLabel);
//
//        String[] options = { "Show Total Money in Bank", "Show Account Detail", "Delete Account",
//                "Show Accounts with Loan", "Update Account", "Exit" };
//        JComboBox<String> comboBox = new JComboBox<>(options);
//
//        comboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
//        comboBox.setBackground(Color.darkGray);
//        comboBox.setForeground(Color.white);
//        panel.add(comboBox);
//
//        JButton submitButton = new JButton("Submit");
//        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//        submitButton.setBackground(Color.darkGray);
//        submitButton.setForeground(Color.white);
//        panel.add(submitButton);
//
//        jFrame4.getContentPane().add(panel);
//        jFrame4.setVisible(true);
//
//        submitButton.addActionListener(e -> {
//            int choice = comboBox.getSelectedIndex();
//            switch (choice) {
//                case 0:
//                    jFrame4.dispose();
//                    show_total_bank_balance();
//                    break;
//                case 1:
//                    jFrame4.dispose();
//                    showAccount();
//                    break;
//                case 2:
//                    jFrame4.dispose();
//                    delete_Account();
//                    break;
//                case 3:
//                    jFrame4.dispose();
//                    manager_loan();
//                    break;
//                case 4:
//                    jFrame4.dispose();
//                    updateAccount();
//                    break;
//                case 5:
//                    jFrame4.dispose();
//                    Accounts();
//                    break;
//                default:
//                    jFrame4.dispose();
//                    JOptionPane.showMessageDialog(this, "YOU ENTERED A WRONG OPTION");
//            }
//        });
//    }
//
//    void user1() {
//        JFrame jframe3 = new JFrame();
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jframe3.setIconImage(imageIcon.getImage());
//
//        jframe3.setTitle("BANK OF SPAIN");
//        jframe3.setSize(400, 120);
//        jframe3.setResizable(false);
//        jframe3.setLocationRelativeTo(null);
//        jframe3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        jframe3.getContentPane().add(panel);
//
//        JLabel titleLabel = new JLabel("USER MODE");
//        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//        panel.add(titleLabel);
//
//        String[] options = {
//                "Open New Account",
//                "Deposit Money",
//                "Credit Money",
//                "Loan Application",
//                "Repay Your Loan",
//                "Bank Statement",
//                "ATM",
//                "Pay Zakat",
//                "Exit"
//        };
//
//        JComboBox<String> comboBox = new JComboBox<>(options);
//        comboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
//        comboBox.setBackground(Color.darkGray);
//        comboBox.setForeground(Color.white);
//        panel.add(comboBox);
//
//        JButton submitButton = new JButton("Submit");
//        submitButton.setBackground(Color.darkGray);
//        submitButton.setForeground(Color.white);
//        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//        panel.add(submitButton);
//
//        submitButton.addActionListener(e -> {
//            int choice = comboBox.getSelectedIndex() + 1;
//            switch (choice) {
//                case 1:
//                    jframe3.dispose();
//                   SignupForm();
//                    break;
//                case 2:
//                    jframe3.dispose();
//                    deposit();
//                    break;
//                case 3:
//                    jframe3.dispose();
//                    credit();
//                    break;
//                case 4:
//                    jframe3.dispose();
//                    loan();
//                    break;
//                case 5:
//                    jframe3.dispose();
//                    repayLoan();
//                    break;
//                case 6:
//                    jframe3.dispose();
//                    statement();
//                    break;
//                case 7:
//                    jframe3.dispose();
//                    atm();
//                    break;
//                case 8:
//                    jframe3.dispose();
//
//                    zakat();
//                    break;
//                case 9:
//                    jframe3.dispose();
//
//                    Accounts();
//                    break;
//                default:
//                    jframe3.dispose();
//                    JOptionPane.showMessageDialog(this, "YOU ENTERED A WRONG OPTION");
//            }
//        });
//
//        jframe3.setVisible(true);
//    }
//
//    void manager() {
//        JFrame jframe1 = new JFrame();
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jframe1.setIconImage(imageIcon.getImage());
//
//        jframe1.setTitle("BANK OF SPAIN");
//        jframe1.setSize(400, 200);
//        jframe1.setLocationRelativeTo(null);
//        jframe1.setResizable(false);
//        jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel contentPane = new JPanel();
//        contentPane.setBackground(new Color(46, 49, 49));
//        contentPane.setLayout(new BorderLayout());
//        jframe1.setContentPane(contentPane);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(null);
//        panel.setOpaque(false);
//        jframe1.getContentPane().add(panel);
//
//        JLabel titleLabel = new JLabel("Manager Login");
//        titleLabel.setBounds(150, 20, 150, 20);
//        titleLabel.setForeground(Color.WHITE);
//        panel.add(titleLabel);
//
//        JTextField branchNameField = new JTextField();
//        branchNameField.setBounds(100, 50, 170, 20);
//        panel.add(branchNameField);
//
//        JPasswordField passwordField = new JPasswordField();
//        passwordField.setBounds(100, 80, 170, 20);
//        panel.add(passwordField);
//
//        JButton loginButton = new JButton("Login");
//        loginButton.setBackground(Color.darkGray);
//        loginButton.setForeground(Color.white);
//        loginButton.setBounds(70, 110, 100, 20);
//        JButton closeButton = new JButton("Exit");
//        closeButton.setBackground(Color.darkGray);
//        closeButton.setForeground(Color.white);
//        closeButton.setBounds(190, 110, 100, 20);
//        panel.add(loginButton);
//
//        panel.add(closeButton);
//
//        loginButton.addActionListener(e -> {
//            String branchName = branchNameField.getText();
//            String password = new String(passwordField.getPassword());
//
//            if (branchName.equalsIgnoreCase("Universitybranch") && password.equalsIgnoreCase("admin")) {
//                jframe1.dispose();
//
//                manager1();
//            } else {
//                jframe1.dispose();
//                JOptionPane.showMessageDialog(this, "Invalid branch name or password.", "Error",
//                        JOptionPane.ERROR_MESSAGE);
//            }
//        });
//
//        closeButton.addActionListener(e -> {
//            Accounts();
//        });
//
//        jframe1.setVisible(true);
//    }
//
//    void user() {
//        user1();
//    }
//
//    void Accounts() {
//        JFrame jframe = new JFrame();
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jframe.setIconImage(imageIcon.getImage());
//
//        jframe.setTitle("BANK OF SPAIN");
//        jframe.setSize(900, 700);
//        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jframe.setResizable(false);
//
//        JLabel backgroundLabel = new JLabel(new ImageIcon("banklogo.png"));
//        backgroundLabel.setLayout(new BorderLayout());
//
//        JPanel contentPane = new JPanel();
//        contentPane.setOpaque(false);
//        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 500));
//
//        JButton managerButton = new JButton(" As Manager");
//        managerButton.setFocusable(false);
//        managerButton.setBackground(Color.white);
//        managerButton.setForeground(Color.BLACK);
//        JButton userButton = new JButton(" As User");
//        userButton.setBackground(Color.white);
//        userButton.setForeground(Color.BLACK);
//        userButton.setFocusable(false);
//        JButton exitButton = new JButton("Exit");
//        exitButton.setBackground(Color.white);
//        exitButton.setForeground(Color.BLACK);
//        exitButton.setFocusable(false);
//        contentPane.add(managerButton);
//        contentPane.add(userButton);
//        contentPane.add(exitButton);
//
//        managerButton.addActionListener(e -> {
//            jframe.dispose();
//            manager();
//        });
//
//        userButton.addActionListener(e -> {
//            jframe.dispose();
//            user();
//        });
//
//        exitButton.addActionListener(e -> {
//            System.exit(0);
//        });
//
//        backgroundLabel.add(contentPane, BorderLayout.CENTER);
//
//        jframe.setContentPane(backgroundLabel);
//
//        jframe.setLocationRelativeTo(null);
//        jframe.setVisible(true);
//    }
//
//}
//
//class Bank extends account {
//    public Bank() {
//        String username = "root";
//        String password = "";
//        String url = "jdbc:mysql://localhost:3306/BANK";
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(url, username, password);
//        } catch (ClassNotFoundException | SQLException e) {
//            throw new RuntimeException(e);
//
//        }
//
//        Accounts();
//    }
//}
//
//
//
//public class applicationform {
//    public static void main(String[] args) {
//        Bank bank = new Bank();
//
//
//    }
//}