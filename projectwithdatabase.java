//import java.sql.*;
//import java.util.Scanner;
//
//
//public class projectwithdatabase {
//    int choice1;
//    String branchName;
//    String password,email;
//    int accNum, choice2;
//    int  pin;
//    String name, nationality, address, phoneNo, fname;
//
//    String accountType, maritalStatus, qualification;
//
//    String date;
//    Scanner input = new Scanner(System.in);
//    Connection connection;
//
//
//    public projectwithdatabase() {
//        String username ="root";
//        String password="";
//        String url="jdbc:mysql://localhost:3306/BANK";
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(url,username,password);
//        } catch (ClassNotFoundException | SQLException e) {
//            throw new RuntimeException(e);
//
//        }
//        welcomee.welcome();
//    }
//
//    float new_balance;
//    public void openAccount() {
//
//        try {
//
//            welcomee.title();
//            System.out.println("Enter account details:");
//            System.out.print("Name: ");
//            name = input.next();
//            System.out.print("Father Name: ");
//            fname = input.next();
//            accNum = generateAccountNumber();
//            System.out.print("Enter account type (current, savings, etc.): ");
//            accountType = input.next();
//            System.out.print("Enter date of birth (YYYY-MM-DD): ");
//            date = input.next();
//            System.out.print("Enter nationality: ");
//            nationality = input.next();
//            System.out.print("Enter address: ");
//            address = input.next();
//            System.out.print("Enter phone number: ");
//            phoneNo = input.next();
//            System.out.print("Email : ");
//            email = input.next();
//            System.out.print("Enter marital status: ");
//            maritalStatus = input.next();
//            System.out.print("Enter qualification: ");
//            qualification = input.next();
//
//            try {
//                System.out.println("Deposit amount (At least 5000): ");
//                new_balance = input.nextFloat();
//                System.out.print("Enter PIN for card: ");
//                pin = input.nextInt();
//            }catch(Exception e){
//                System.out.println(" plz Enter in Numbers!");
//            }
//
//            String checkPinSQL = "SELECT pin FROM accounts WHERE pin = ?";
//            PreparedStatement pinCheckStatement = connection.prepareStatement(checkPinSQL);
//            pinCheckStatement.setInt(1, pin);
//            ResultSet pinResultSet = pinCheckStatement.executeQuery();
//            while (pinResultSet.next()) {
//                System.out.println("Pin is already present. Enter another PIN.");
//                System.out.print("Enter OTHER PIN for card: ");
//                pin = input.nextInt();
//                pinCheckStatement.setInt(1, pin);
//                pinResultSet = pinCheckStatement.executeQuery();
//            }
//
//            String insertSQL = "INSERT INTO accounts (name, father_name, account_num, account_type, dob, nationality, address, phone_num, email, marital_status, qualification, balance, pin, loan) " +
//                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, fname);
//            preparedStatement.setInt(3, accNum);
//            preparedStatement.setString(4, accountType);
//            preparedStatement.setString(5, date);
//            preparedStatement.setString(6, nationality);
//            preparedStatement.setString(7, address);
//            preparedStatement.setString(8, phoneNo);
//            preparedStatement.setString(9, email);
//            preparedStatement.setString(10, maritalStatus);
//            preparedStatement.setString(11, qualification);
//            preparedStatement.setFloat(12, new_balance);
//            preparedStatement.setInt(13, pin);
//            preparedStatement.setInt(14, 0);
//            preparedStatement.executeUpdate();
//            System.out.println("Account created successfully!");
//            System.out.println("Your account number is: " + accNum);
//
//            String updateBalanceBankSQL = "UPDATE money SET bank_money = bank_money + ? WHERE id_bank = ?";
//            PreparedStatement updateBankStatement = connection.prepareStatement(updateBalanceBankSQL);
//            updateBankStatement.setFloat(1, new_balance);
//            updateBankStatement.setInt(2, 1);
//            updateBankStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//
//
//
//    private int generateAccountNumber() {
//
//  return 1000000000 + (int) (Math.random() * 900000000);
//
//    }
//
//
//    void deposit() {
//        try {
//            welcomee.title();
//            System.out.println("ENTER YOUR ACCOUNT NUMBER ");
//            int accountNumber = input.nextInt();
//
//            String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//            PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//            selectStatement.setInt(1, accountNumber);
//            ResultSet resultSet = selectStatement.executeQuery();
//
//            if (resultSet.next()) {
//                float currentBalance = resultSet.getFloat("balance");
//                System.out.println("ENTER MONEY DEPOSIT IN BANK ");
//                float depositAmount = input.nextFloat();
//                float newBalance = currentBalance + depositAmount;
//
//
//                String updateBalanceSQL = "UPDATE accounts SET balance = ? WHERE account_num = ?";
//                PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                updateStatement.setFloat(1, newBalance);
//                updateStatement.setInt(2, accountNumber);
//                updateStatement.executeUpdate();
//
//
//                String BankSQL = "SELECT bank_money FROM money WHERE id_bank = ?";
//                PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                selectStatement2.setInt(1, 1);
//                ResultSet resultSet2 = selectStatement2.executeQuery();
//                float total_bank_balance = 0.0f;
//                if(resultSet2.next()) {
//                    float total_bank_balance_old = resultSet2.getFloat("bank_money");
//                    total_bank_balance = total_bank_balance_old + depositAmount;
//                }
//
//                String updateBalanceBankSQL = "UPDATE money SET bank_money = ? WHERE id_bank = ?";
//                PreparedStatement updateBankStatement = connection.prepareStatement(updateBalanceBankSQL);
//                updateBankStatement.setFloat(1, total_bank_balance);
//                updateBankStatement.setInt(2, 1);
//                updateBankStatement.executeUpdate();
//
//                System.out.println("NOW YOUR NEW BALANCE IS: " + newBalance);
//            } else {
//                System.out.println("YOUR ACCOUNT NUMBER IS NOT CORRECT");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//
//    void credit() {
//        try {
//            welcomee.title();
//            System.out.println("ENTER YOUR ACCOUNT NUMBER ");
//            int accountNumber = input.nextInt();
//
//            String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//            PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//            selectStatement.setInt(1, accountNumber);
//            ResultSet resultSet = selectStatement.executeQuery();
//
//            if (resultSet.next()) {
//                float currentBalance = resultSet.getFloat("balance");
//                System.out.println("ENTER MONEY CREDIT IN BANK ");
//                float creditAmount = input.nextFloat();
//                if(currentBalance>creditAmount) {
//                    float newBalance = currentBalance - creditAmount;
//
//                    String updateBalanceSQL = "UPDATE accounts SET balance = ? WHERE account_num = ?";
//                    PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                    updateStatement.setFloat(1, newBalance);
//                    updateStatement.setInt(2, accountNumber);
//                    updateStatement.executeUpdate();
//
//                    String BankSQL = "SELECT bank_money FROM money WHERE id_bank = ?";
//                    PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                    selectStatement2.setInt(1, 1);
//                    ResultSet resultSet2 = selectStatement2.executeQuery();
//                    float total_bank_balance = 0.0f;
//                    if (resultSet2.next()) {
//                        total_bank_balance = resultSet2.getFloat("bank_money");
//                        total_bank_balance -= creditAmount;
//                    }
//
//                    String updateBalanceBankSQL = "UPDATE money SET bank_money = ? WHERE id_bank = ?";
//                    PreparedStatement updateBankStatement = connection.prepareStatement(updateBalanceBankSQL);
//                    updateBankStatement.setFloat(1, total_bank_balance);
//                    updateBankStatement.setInt(2, 1);
//                    updateBankStatement.executeUpdate();
//
//                    System.out.println("NOW YOUR BALANCE IS: " + newBalance);
//                }else {
//                    System.out.println("INSUFFICIENT FUNDS");
//                }
//            } else {
//                System.out.println("YOUR ACCOUNT NUMBER IS NOT CORRECT");
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    void manager_loan() {
//
//            try {
//
//                welcomee.title();
//
//                String selectAccountsSQL = "SELECT account_num, name, father_name, loan FROM accounts WHERE loan >= 1";
//                PreparedStatement selectStatement = connection.prepareStatement(selectAccountsSQL);
//                ResultSet resultSet = selectStatement.executeQuery();
//
//                System.out.println(" ACCOUNT NUMBERS AND CUSTOMER NAME AND LOAN ");
//                while (resultSet.next()) {
//                    int accountNum = resultSet.getInt("account_num");
//                    String name = resultSet.getString("name");
//                    String fatherName = resultSet.getString("father_name");
//                    float loan = resultSet.getFloat("loan");
//
//                    System.out.println("ACCOUNT NUMBER: " + accountNum);
//                    System.out.println("NAME: " + name + " " + fatherName);
//                    System.out.println("LOAN: " + loan);
//                }
//                System.out.println("================================================================================");
//
//                System.out.println("TO SHOW ACCOUNT DETAIL");
//                System.out.println("ENTER ACCOUNT NUMBER ");
//                int accountNumber = input.nextInt();
//
//
//                String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//                PreparedStatement selectStatement2 = connection.prepareStatement(selectAccountSQL);
//                selectStatement2.setInt(1, accountNumber);
//                ResultSet resultSet2 = selectStatement2.executeQuery();
//
//                if (resultSet2.next()) {
//                    System.out.println("Account details:");
//                    System.out.println("Name: " + resultSet2.getString("name") + " " + resultSet2.getString("father_name"));
//                    System.out.println("Account type: " + resultSet2.getString("account_type"));
//                    System.out.println("DATE OF BIRTH: " + resultSet2.getString("dob"));
//                    System.out.println("NATIONALITY: " + resultSet2.getString("nationality"));
//                    System.out.println("ADDRESS: " + resultSet2.getString("address"));
//                    System.out.println("MARITAL STATUS: " + resultSet2.getString("marital_status"));
//                    System.out.println("QUALIFICATION: " + resultSet2.getString("qualification"));
//                    System.out.println("PHONE NUMBER: " + resultSet2.getString("phone_num"));
//                    System.out.println("YOUR ACCOUNT NUMBER: " + resultSet2.getInt("account_num"));
//                    System.out.println("TOTAL BALANCE IS: " + resultSet2.getFloat("balance"));
//                    if (resultSet2.getFloat("loan") > 1) {
//                        System.out.println("LOAN IS: " + resultSet2.getFloat("loan"));
//                    }
//                    System.out.println("-------------------------------------------------------------");
//                } else {
//                    System.out.println("ACCOUNT NUMBER IS WRONG");
//                }
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//
//    void statement() {
//
//            try {
//
//                welcomee.title();
//                System.out.println("ENTER YOUR ACCOUNT NUMBER ");
//                int accountNumber = input.nextInt();
//
//
//                String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//                PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//                selectStatement.setInt(1, accountNumber);
//                ResultSet resultSet = selectStatement.executeQuery();
//
//                if (resultSet.next()) {
//
//                    System.out.println("=============================================================== ");
//                    System.out.println("=========================STATEMENT============================= ");
//                    System.out.println("=============================================================== ");
//                    for (int i = 0; i < 5; i++) {
//                        System.out.println();
//                    }
//                    System.out.println("NAME : " + resultSet.getString("name") + " " + resultSet.getString("father_name"));
//                    System.out.println("ACCOUNT TYPE : " + resultSet.getString("account_type"));
//                    System.out.println("PHONE NUMBER : " + resultSet.getString("phone_num"));
//                    System.out.println("YOUR ACCOUNT NUMBER  : " + resultSet.getInt("account_num"));
//                    for (int i = 0; i < 5; i++) {
//                        System.out.println();
//                    }
//                    System.out.println("-------------------------------------------------------------");
//                    System.out.println("TOTAL BALANCE IS " + resultSet.getFloat("balance"));
//                    if (resultSet.getFloat("loan") > 1) {
//                        System.out.println("LOAN IS " + resultSet.getFloat("loan"));
//                    }
//                    System.out.println("THANKS !!");
//                } else {
//
//                    System.out.println("YOUR ACCOUNT NUMBER IS NOT CORRECT ");
//                }
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//
//
//
//
//    void atm() {
//
//        try {
//            welcomee.title();
//            System.out.println("=============================================================== ");
//            System.out.println("=========================ATM MACHINE ==========================");
//            System.out.println("=============================================================== ");
//            for (int i = 0; i < 7; i++) {
//                System.out.println();
//            }
//            System.out.println("SCAN YOUR CARD  ");
//            System.out.println("======================================");
//            System.out.println("=      SCAN                          =");
//            System.out.println("=          HERE                      =");
//            System.out.println("=               YOUR                 =");
//            System.out.println("=                     CARD           =");
//            System.out.println("=                           !!       =");
//            System.out.println("=                                    =");
//            System.out.println("=======================================");
//            System.out.println("SCANNING.........");
//
//            System.out.println("ENTER YOUR PIN ");
//            int pin1 = input.nextInt();
//            String selectAccountSQL = "SELECT * FROM accounts WHERE pin = ?";
//            PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//            selectStatement.setInt(1, pin1);
//            ResultSet resultSet = selectStatement.executeQuery();
//            method.cls();
//            if (resultSet.next()) {
//                System.out.println("ENTER 1 DEPOSIT MONEY ");
//                System.out.println("ENTER 2 WITHDRAW MONEY");
//                System.out.println("ENTER 3 CHANGE PIN ");
//                System.out.println("ENTER 4 CHECK  BALANCE ");
//                System.out.println("ENTER 5 TO EXIT");
//                int choice3 = input.nextInt();
//
//                switch (choice3) {
//                    case 1: {
//                        try {
//
//                            String selectpinSQL = "SELECT * FROM accounts WHERE pin = ?";
//                            PreparedStatement selectpinStatement = connection.prepareStatement(selectpinSQL);
//                            selectpinStatement.setInt(1, pin1);
//                            resultSet = selectpinStatement.executeQuery();
//
//                            if (resultSet.next()) {
//                                float currentBalance = resultSet.getFloat("balance");
//                                System.out.println("ENTER MONEY DEPOSIT IN BANK ");
//                                float depositAmount = input.nextFloat();
//                                float newBalance = currentBalance + depositAmount;
//
//                                String updateBalanceSQL = "UPDATE accounts SET balance = ? WHERE pin = ?";
//                                PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                                updateStatement.setFloat(1, newBalance);
//                                updateStatement.setInt(2, pin1);
//                                updateStatement.executeUpdate();
//
//                                String BankSQL = "SELECT bank_money FROM money WHERE id_bank = ?";
//                                PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                                selectStatement2.setInt(1, 1);
//                                ResultSet resultSet2 = selectStatement2.executeQuery();
//                                float total_bank_balance = 0.0f;
//                                if (resultSet2.next()) {
//                                    float total_bank_balance_old = resultSet2.getFloat("bank_money");
//                                    total_bank_balance = total_bank_balance_old + depositAmount;
//                                }
//
//                                String updateBalanceBankSQL = "UPDATE money SET bank_money = ? WHERE id_bank = ?";
//                                PreparedStatement updateBankStatement = connection.prepareStatement(updateBalanceBankSQL);
//                                updateBankStatement.setFloat(1, total_bank_balance);
//                                updateBankStatement.setInt(2, 1);
//                                updateBankStatement.executeUpdate();
//
//                                System.out.println("NOW YOUR NEW BALANCE IS: " + newBalance);
//                            } else {
//                                System.out.println("YOUR PIN IS NOT CORRECT");
//                            }
//
//                        } catch (SQLException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                    break;
//                    case 2: {
//                        try {
//
//                            String selectpinSQL = "SELECT * FROM accounts WHERE pin = ?";
//                            PreparedStatement selectpinStatement = connection.prepareStatement(selectpinSQL);
//                            selectpinStatement.setInt(1, pin1);
//                            resultSet = selectpinStatement.executeQuery();
//
//                            if (resultSet.next()) {
//                                float currentBalance = resultSet.getFloat("balance");
//                                System.out.println("ENTER WITHDRAW MONEY  ");
//                                float newBalance;
//                                float creditAmount = input.nextFloat();
//                                if(currentBalance>creditAmount) {
//                                    newBalance = currentBalance - creditAmount;
//
//                                    String updateBalanceSQL = "UPDATE accounts SET balance = ? WHERE pin = ?";
//                                    PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                                    updateStatement.setFloat(1, newBalance);
//                                    updateStatement.setInt(2, pin1);
//                                    updateStatement.executeUpdate();
//
//                                    String BankSQL = "SELECT bank_money FROM money WHERE id_bank = ?";
//                                    PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                                    selectStatement2.setInt(1, 1);
//                                    ResultSet resultSet2 = selectStatement2.executeQuery();
//                                    float total_bank_balance = 0.0f;
//                                    if (resultSet2.next()) {
//                                        float total_bank_balance_old = resultSet2.getFloat("bank_money");
//                                        total_bank_balance = total_bank_balance_old - creditAmount;
//                                    }
//
//                                    String updateBalanceBankSQL = "UPDATE money SET bank_money = ? WHERE id_bank = ?";
//                                    PreparedStatement updateBankStatement = connection.prepareStatement(updateBalanceBankSQL);
//                                    updateBankStatement.setFloat(1, total_bank_balance);
//                                    updateBankStatement.setInt(2, 1);
//                                    updateBankStatement.executeUpdate();
//
//                                    System.out.println("NOW YOUR NEW BALANCE IS: " + newBalance);
//                                }else{
//                                    System.out.println("INSUFFICIENT FUNDS");
//                                }
//                            } else {
//                                System.out.println("YOUR PIN IS NOT CORRECT");
//                            }
//                        } catch (SQLException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    break;
//                    case 3: {
//                        System.out.println("ENTER YOUR NEW PIN ");
//                        int newPin = input.nextInt();
//                        String checkPinSQL = "SELECT pin FROM accounts WHERE pin = ?";
//                        PreparedStatement pinCheckStatement = connection.prepareStatement(checkPinSQL);
//                        pinCheckStatement.setInt(1, newPin);
//                        ResultSet pinResultSet = pinCheckStatement.executeQuery();
//                        if (pinResultSet.next()) {
//                            System.out.println("New PIN is already present. Please choose another PIN.");
//                        } else {
//                            String updatePinSQL = "UPDATE accounts SET pin = ? WHERE pin = ?";
//                            PreparedStatement updateStatement = connection.prepareStatement(updatePinSQL);
//                            updateStatement.setInt(1, newPin);
//                            updateStatement.setInt(2, pin1);
//                            int rowsAffected = updateStatement.executeUpdate();
//                            if (rowsAffected > 0) {
//                                System.out.println("PIN updated successfully.");
//                            } else {
//                                System.out.println("Failed to update PIN.");
//                            }
//                        }
//
//                    }
//                    break;
//                    case 4: {
//                        System.out.println("YOUR TOTAL BALANCE IS THIS " + resultSet.getFloat("balance"));
//                    }
//                    break;
//                    case 5: {
//                        System.exit(0);
//                    }
//                    break;
//                    default:
//                        System.out.println("YOU ENTERED A WRONG OPTION");
//                }
//            } else {
//                System.out.println("YOUR PIN IS WRONG ");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//    void loan() {
//        try {
//            welcomee.title();
//            System.out.println("ENTER YOUR ACCOUNT NUMBER TO REQUEST A LOAN");
//            int accountNumber = input.nextInt();
//
//            String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//            PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//            selectStatement.setInt(1, accountNumber);
//            ResultSet resultSet = selectStatement.executeQuery();
//
//            if (resultSet.next()) {
//                float totalBalance = resultSet.getFloat("balance");
//                float loanLimit = 200000;
//
//                System.out.println("YOUR ACCOUNT IS PRESENT IN THE BANK");
//
//                if (totalBalance <= loanLimit) {
//                    System.out.println("ENTER THE AMOUNT FOR THE LOAN");
//                    float requestedLoan = input.nextFloat();
//
//                    String selectBankSQL = "SELECT bank_money FROM money WHERE id_bank = ?";
//                    PreparedStatement bankStatement = connection.prepareStatement(selectBankSQL);
//                    bankStatement.setInt(1, 1);
//                    ResultSet bankResultSet = bankStatement.executeQuery();
//
//
//                    float oldLoan = resultSet.getFloat("loan");
//
//                    if (bankResultSet.next()) {
//                        float totalBankBalance = bankResultSet.getFloat("bank_money");
//                        if (totalBankBalance >= requestedLoan) {
//                            System.out.println("YOUR LOAN REQUEST IS ACCEPTED");
//                            float newBalance = totalBalance + requestedLoan;
//
//
//                            float newLoan = oldLoan + requestedLoan;
//
//
//                            String updateBalanceSQL = "UPDATE accounts SET balance = ?, loan = ? WHERE account_num = ?";
//                            PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                            updateStatement.setFloat(1, newBalance);
//                            updateStatement.setFloat(2, newLoan);
//                            updateStatement.setInt(3, accountNumber);
//                            updateStatement.executeUpdate();
//
//                            String BankSQL = "SELECT bank_money, loan FROM money WHERE id_bank = ?";
//                            PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                            selectStatement2.setInt(1, 1);
//                            ResultSet resultSet2 = selectStatement2.executeQuery();
//                            float total_bank_balance = 0.0f;
//                            float old_bank_loan = 0.0f;
//                            if (resultSet2.next()) {
//                                float total_bank_balance_old = resultSet2.getFloat("bank_money");
//                                float old_bank_loan_old = resultSet2.getFloat("loan");
//                                total_bank_balance = total_bank_balance_old - requestedLoan;
//                                old_bank_loan = old_bank_loan_old + requestedLoan;
//                            }
//
//                            String updateBalanceBankSQL = "UPDATE money SET bank_money = ?, loan = ? WHERE id_bank = ?";
//                            PreparedStatement updateBankStatement = connection.prepareStatement(updateBalanceBankSQL);
//                            updateBankStatement.setFloat(1, total_bank_balance);
//                            updateBankStatement.setFloat(2, old_bank_loan);
//                            updateBankStatement.setInt(3, 1);
//                            updateBankStatement.executeUpdate();
//
//                            System.out.println("YOUR NEW BALANCE IS: " + newBalance);
//                            System.out.println("NOW YOU CAN REPAY YOUR LOAN WITHIN ONE YEAR");
//                        } else {
//                            System.out.println("INSUFFICIENT FUNDS IN THE BANK");
//                        }
//                    }
//                } else {
//                    System.out.println("YOUR REQUEST IS NOT ACCEPTED BECAUSE YOUR TOTAL BALANCE IS MORE THAN " + loanLimit);
//                }
//            } else {
//                System.out.println("INVALID ACCOUNT NUMBER");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//
//    void repayLoan() {
//        try {
//            welcomee.title();
//            System.out.println("ENTER YOUR ACCOUNT NUMBER TO REPAY LOAN: ");
//            int accountNumber = input.nextInt();
//
//            String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//            PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//            selectStatement.setInt(1, accountNumber);
//            ResultSet resultSet = selectStatement.executeQuery();
//
//            if (resultSet.next()) {
//                float currentLoan = resultSet.getFloat("loan");
//
//                if (currentLoan > 0) {
//                    System.out.println("YOUR CURRENT LOAN AMOUNT TO REPAY: " + currentLoan);
//                    System.out.println("ENTER AMOUNT TO REPAY: ");
//                    float repaymentAmount = input.nextFloat();
//
//                    if (repaymentAmount <= currentLoan) {
//
//                        float newLoan = currentLoan - repaymentAmount;
//                        float newBalance = resultSet.getFloat("balance") - repaymentAmount;
//
//                        String updateBalanceSQL = "UPDATE accounts SET balance = ?, loan = ? WHERE account_num = ?";
//                        PreparedStatement updateStatement = connection.prepareStatement(updateBalanceSQL);
//                        updateStatement.setFloat(1, newBalance);
//                        updateStatement.setFloat(2, newLoan);
//                        updateStatement.setInt(3, accountNumber);
//                        updateStatement.executeUpdate();
//
//                        String BankSQL = "SELECT bank_money, loan FROM money WHERE id_bank = ?";
//                        PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//                        selectStatement2.setInt(1, 1);
//                        ResultSet resultSet2 = selectStatement2.executeQuery();
//                        float total_bank_balance = 0.0f;
//                        float old_bank_loan = 0.0f;
//                        if (resultSet2.next()) {
//                            float total_bank_balance_old = resultSet2.getFloat("bank_money");
//                            float old_bank_loan_old = resultSet2.getFloat("loan");
//                            total_bank_balance = total_bank_balance_old  + repaymentAmount;
//                            old_bank_loan = old_bank_loan_old - repaymentAmount;
//                        }
//
//                        String updateBalanceBankSQL = "UPDATE money SET bank_money = ?, loan = ? WHERE id_bank = ?";
//                        PreparedStatement updateBankStatement = connection.prepareStatement(updateBalanceBankSQL);
//                        updateBankStatement.setFloat(1, total_bank_balance);
//                        updateBankStatement.setFloat(2, old_bank_loan);
//                        updateBankStatement.setInt(3, 1);
//                        updateBankStatement.executeUpdate();
//
//                        System.out.println("LOAN REPAYED SUCCESSFULLY!");
//                        System.out.println("YOUR REMAINING LOAN AMOUNT: " + newLoan);
//                        System.out.println("YOUR NEW BALANCE: " + newBalance);
//                    } else {
//                        System.out.println("INVALID REPAYMENT AMOUNT. PLEASE ENTER A VALID AMOUNT.");
//                    }
//                } else {
//                    System.out.println("YOU DON'T HAVE ANY OUTSTANDING LOAN TO REPAY.");
//                }
//            } else {
//                System.out.println("YOU ENTERED WRONG ACCOUNT NUMBER.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//    void show_total_bank_balance() {
//        try {
//            welcomee.title();
//            String BankSQL = "SELECT Bank_money, loan FROM money WHERE id_bank = ?";
//            PreparedStatement selectStatement2 = connection.prepareStatement(BankSQL);
//            selectStatement2.setInt(1, 1);
//            ResultSet resultSet = selectStatement2.executeQuery();
//
//            if (resultSet.next()) {
//                System.out.println("TOTAL MONEY IN BANK IS " + resultSet.getString("Bank_money"));
//                System.out.println("TOTAL MONEY TO RETURN IN BANK IN THE FORM OF LOAN " + resultSet.getString("loan"));
//            } else {
//                System.out.println("No records found for bank balance.");
//            }
//        } catch (SQLException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//
//
//
//    void showAccount() {
//        try {
//
//            welcomee.title();
//            System.out.println("ALL ACCOUNT NUMBERS AND CUSTOMER NAME");
//            String selectAccountsSQL = "SELECT account_num, name, father_name FROM accounts";
//            PreparedStatement selectStatement1 = connection.prepareStatement(selectAccountsSQL);
//            ResultSet resultSet = selectStatement1.executeQuery();
//
//
//            while (resultSet.next()) {
//                System.out.println("Account number: " + resultSet.getString("account_num"));
//                System.out.println("Name: " + resultSet.getString("name"));
//                System.out.println("Father Name: " + resultSet.getString("father_name"));
//                System.out.println();
//            }
//
//            System.out.println("ENTER ACCOUNT NUMBER");
//            int accountNumber = input.nextInt();
//
//
//            String selectAccountSQL = "SELECT * FROM accounts WHERE account_num = ?";
//            PreparedStatement selectStatement = connection.prepareStatement(selectAccountSQL);
//            selectStatement.setInt(1, accountNumber);
//            ResultSet accountResultSet = selectStatement.executeQuery();
//
//            if (accountResultSet.next()) {
//
//                System.out.println("Account details:");
//                System.out.println("Name: " + accountResultSet.getString("name") + " " + accountResultSet.getString("father_name"));
//                System.out.println("Account type: " + accountResultSet.getString("account_type"));
//                System.out.println("DATE OF BIRTH: " + accountResultSet.getString("dob"));
//                System.out.println("NATIONALITY: " + accountResultSet.getString("nationality"));
//                System.out.println("ADDRESS: " + accountResultSet.getString("address"));
//                System.out.println("MARITAL STATUS: " + accountResultSet.getString("marital_status"));
//                System.out.println("QUALIFICATION: " + accountResultSet.getString("qualification"));
//                System.out.println("PHONE NUMBER: " + accountResultSet.getString("phone_num"));
//                System.out.println("YOUR ACCOUNT NUMBER: " + accountNumber);
//                System.out.println("TOTAL BALANCE IS: " + accountResultSet.getFloat("balance"));
//                if (accountResultSet.getFloat("loan") > 1) {
//                    System.out.println("LOAN IS: " + accountResultSet.getFloat("loan"));
//                }
//                System.out.println("-------------------------------------------------------------");
//            } else {
//
//                System.out.println("ACCOUNT NUMBER IS WRONG");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//
//    void delete_Account() {
//        try {
//
//            welcomee.title();
//            System.out.println("ALL ACCOUNT NUMBERS AND CUSTOMER NAME");
//            String selectAccountsSQL = "SELECT account_num, name, father_name FROM accounts";
//            PreparedStatement selectStatement1 = connection.prepareStatement(selectAccountsSQL);
//            ResultSet resultSet = selectStatement1.executeQuery();
//
//
//            while (resultSet.next()) {
//                System.out.println("Account number: " + resultSet.getString("account_num"));
//                System.out.println("Name: " + resultSet.getString("name"));
//                System.out.println("Father Name: " + resultSet.getString("father_name"));
//                System.out.println();
//            }
//
//            System.out.println("ENTER ACCOUNT NUMBER");
//            int accountNumber = input.nextInt();
//
//
//            String deleteAccountSQL = "DELETE FROM accounts WHERE account_num = ?";
//            PreparedStatement deleteStatement = connection.prepareStatement(deleteAccountSQL);
//            deleteStatement.setInt(1, accountNumber);
//            int rowsAffected = deleteStatement.executeUpdate();
//
//            if (rowsAffected > 0) {
//
//                System.out.println("Account deleted successfully.");
//            } else {
//
//                System.out.println("Account not found with the given account number.");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//    void manager1() {
//        while (true) {
//
//            welcomee.title();
//            System.out.println("MANAGER MODE ");
//            System.out.println("ENTER 1 FOR SHOW TOTAL MONEY IN BANK ");
//            System.out.println("ENTER 2 FOR SHOW ACCOUNT DETAIL");
//            System.out.println("ENTER 3 FOR DELETE ACCOUNT ");
//            System.out.println("ENTER 4 FOR SHOW HOW MANY  ACCOUNT HAS LOAN ");
//            System.out.println("ENTER 5 TO EXIT");
//            choice2 = input.nextInt();
//            switch (choice2) {
//                case 1: {
//
//                    show_total_bank_balance();
//                }
//                break;
//                case 2: {
//
//                    showAccount();
//                }
//                break;
//                case 3: {
//
//                    delete_Account();
//                }
//                break;
//                case 4: {
//
//                    manager_loan();
//                }
//                break;
//                case 5: {
//                    method.cls();
//                    welcomee.title();
//                    Accounts();
//                }
//                break;
//                default:
//                    System.out.println("YOU ENTER WRONG OPTION");
//            }
//        }
//
//    }
//
//    void user1() {
//        while (true) {
//
//            welcomee.title();
//            System.out.println("USER MODE ");
//            System.out.println("ENTER 1 FOR OPEN NEW ACCOUNT ");
//            System.out.println("ENTER 2 FOR DEPOSIT MONEY");
//            System.out.println("ENTER 3 FOR CREDIT  MONEY");
//            System.out.println("ENTER 4 FOR LOAN APPLICATION");
//            System.out.println("ENTER 5 TO REPAY YOUR LOAN ");
//            System.out.println("ENTER 6 FOR BANK STATEMENT");
//            System.out.println("ENTER 7 FOR ATM");
//            System.out.println("ENTER 8 FOR EXIT");
//            choice2 = input.nextInt();
//            switch (choice2) {
//                case 1: {
//
//                    openAccount();
//                }
//                break;
//                case 2: {
//
//                    deposit();
//                }
//                break;
//                case 3: {
//
//                    credit();
//                }
//                break;
//                case 4: {
//
//                    loan();
//                }
//                break;
//                case 5:{
//
//                    repayLoan();
//                }
//                break;
//                case 6: {
//
//                    statement();
//                }
//                break;
//                case 7: {
//
//                    atm();
//                }
//                break;
//                case 8: {
//                    method.cls();
//                    welcomee.title();
//                    Accounts();
//                }
//                break;
//                default:
//                    System.out.println("YOU ENTER WRONG OPTION");
//            }
//        }
//    }
//
//    void manager() {
//        method.cls();
//        welcomee.title();
//        System.out.print("ENTER BRANCH NAME: ");
//        branchName = input.next();
//        System.out.print("ENTER PASSWORD: ");
//        password = input.next();
//
//        if (branchName.equalsIgnoreCase("Universitybranch") || password.equalsIgnoreCase("admin")) {
//            method.cls();
//            manager1();
//        } else {
//            System.out.println("Invalid branch name or password.");
//        }
//    }
//
//    void user() {
//        method.cls();
//        user1();
//    }
//
//    void Accounts() {
//
//        System.out.println("1. AS MANAGER");
//        System.out.println("2. AS USER");
//        System.out.println("3. to EXIT ");
//        System.out.print("Enter your choice: ");
//        choice1 = input.nextInt();
//
//        switch (choice1) {
//            case 1:
//
//                manager();
//                break;
//            case 2:
//
//                user();
//                break;
//            case 3: {
//                System.exit(0);
//            }
//            default:
//                System.out.println("Invalid choice.");
//        }
//    }
//
//
//    public static void main(String[] args) {
//    projectwithdatabase projectwithdatabase = new projectwithdatabase();
//    projectwithdatabase.Accounts();
//    }
//}