//import javax.swing.*;
//import java.awt.*;
//import java.math.BigDecimal;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//class o1{
//    void zakat() {
//        JFrame jFrame55 = new JFrame();
//        ImageIcon imageIcon = new ImageIcon("logo.png");
//        jFrame55.setIconImage(imageIcon.getImage());
//        jFrame55.setTitle("BANK OF SPAIN");
//        jFrame55.setSize(450, 200);
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
//                JFrame jFrame = new JFrame();
//                ImageIcon imageIcon1 = new ImageIcon("logo.png");
//                jFrame.setIconImage(imageIcon1.getImage());
//                jFrame.setTitle("BANK OF SPAIN");
//                jFrame.setSize(450, 400);
//                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                jFrame.setLocationRelativeTo(null);
//                jFrame.setLayout(new BorderLayout());
//
//                int accountNumber = Integer.parseInt(accountNumberField.getText());
//
//                String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//                PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//                selectStatement.setInt(1, accountNumber);
//                ResultSet resultSet = selectStatement.executeQuery();
//
//                if (resultSet.next()) {
//                    float currentBalance = resultSet.getFloat("balance");
//
//                    JPanel panel = new JPanel();
//                    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//
//                    JLabel balanceLabel = new JLabel("YOUR TOTAL BALANCE IN BANK IS: " + currentBalance);
//                    panel.add(balanceLabel);
//
//                    float zakatAmount = currentBalance / 40;
//                    JLabel zakatLabel = new JLabel("YOUR ZAKAT PAYABLE IS: " + zakatAmount);
//                    panel.add(zakatLabel);
//
//                    JLabel questionLabel = new JLabel("DO YOU WANT TO PAY ZAKAT?");
//                    panel.add(questionLabel);
//
//                    JCheckBox confirmCheckBox = new JCheckBox("Confirm");
//                    panel.add(confirmCheckBox);
//
//                    JButton payButton = new JButton("Pay Zakat");
//                    panel.add(payButton);
//
//                    jFrame.add(panel, BorderLayout.CENTER);
//                    jFrame.setVisible(true);
//
//                    payButton.addActionListener(payEvent -> {
//                        if (confirmCheckBox.isSelected()) {
//                            float newBalance = currentBalance - zakatAmount;
//
//                            String updateBalanceSQL = "UPDATE accounts SET balance = ? WHERE account_num = ?";
//                            PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                            updateStatement.setFloat(1, newBalance);
//                            updateStatement.setInt(2, accountNumber);
//                            updateStatement.executeUpdate();
//
//                            int accountId = resultSet.getInt("id");
//
//                            String insertStatementSQL = "INSERT INTO BankStatement (account_id, transaction_date, description, Debit, Credit, balance_after_transaction) VALUES (?, ?, ?, ?, ?, ?)";
//                            PreparedStatement statement = connection.prepareStatement(insertStatementSQL);
//                            statement.setInt(1, accountId);
//                            statement.setDate(2, new java.sql.Date(System.currentTimeMillis()));
//                            statement.setString(3, "PAY ZAKAT ");
//                            statement.setBigDecimal(4, BigDecimal.valueOf(zakatAmount));
//                            statement.setBigDecimal(5, BigDecimal.ZERO);
//                            statement.setBigDecimal(6, BigDecimal.valueOf(newBalance));
//                            statement.executeUpdate();
//
//                            JOptionPane.showMessageDialog(jFrame, "Zakat payment successful! Your new balance is: " + newBalance);
//                            jFrame.dispose();
//                        } else {
//                            JOptionPane.showMessageDialog(jFrame, "Please confirm to proceed with the payment.");
//                        }
//                    });
//
//                } else {
//                    JOptionPane.showMessageDialog(jFrame55, "Invalid account number!");
//                }
//
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
//    class First_program {
//    public static void main(String[] args) {
//o1 o1 = new o1();
//o1.zakat();
//    }
//}