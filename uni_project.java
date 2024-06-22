//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Random;
//import java.util.Scanner;
//
//class Accounts {
//    LinkedList<Accounts> linklist = new LinkedList<>();
//    Scanner input = new Scanner(System.in);
//    int choice1;
//    String branchName;
//    String password;
//    int accNum,choice2;
//    int choice3;
//    int accountNumber,pin;
//    String name, nationality, address, phoneNo,fname;
//    float new_balance,total_balance,credit_money,loan,total_bank_balance=0;
//    String accountType, date, maritalStatus, qualification;
//
//    void openAccount() {
//
//        System.out.println("Enter account details:");
//        System.out.print("Name: ");
//        name = input.next();
//        System.out.print("Father Name: ");
//        fname = input.next();
//        Random random = new Random();
//        accNum = random.nextInt(1000000000);
//
//        System.out.print("Enter account type (current, savings, etc.): ");
//        accountType = input.next();
//        System.out.println("ENTER YOUR DATE OF BIRTH ");
//        date = input.next();
//        System.out.println("ENTER YOUR NATIONALITY");
//        nationality = input.next();
//        System.out.println("ENTER YOUR ADDRESS");
//        address = input.next();
//        System.out.println("ENTER YOUR PHONE NUMBER ");
//        phoneNo = input.next();
//        System.out.println("ENTER YOUR MARITAL STATUS");
//        maritalStatus = input.next();
//        System.out.println("ENTER YOUR QUALIFICATION");
//        qualification = input.next();
//
//        System.out.println("Account created successfully!");
//        System.out.println("YOUR ACCOUNT NUMBER IS: " + accNum);
//        System.out.println("NOW YOU DEPOSIT SOME MONEY (Atleast 5000)");
//        new_balance=input.nextFloat();
//        System.out.println("ENTER PIN FOR CARD ");
//        pin=input.nextInt();
//        total_balance=0+new_balance;
//        total_bank_balance=total_bank_balance+new_balance;
//        linklist.add(this);
//
//
//    }
//    void deposit(){
//        System.out.println("ENTER YOUR ACCOUNT NUMBER ");
//        accountNumber=input.nextInt();
//        for (Accounts account : linklist) {
//            if (accountNumber == accNum) {
//                System.out.println("ENTER MONEY DEPOSIT IN BANK ");
//                account.new_balance=input.nextFloat();
//                account.total_balance=account.total_balance+account.new_balance;
//                System.out.println("NOW YOUR  NEW BALANCE IS THIS "+account.total_balance);
//                account.total_bank_balance=account.total_bank_balance+account.new_balance;
//                break;
//            }else{
//                System.out.println("YOUR ACCOUNT NUMBER IS NOT CORRECT ");
//            }
//        }
//    }
//    void credit(){
//        System.out.println("ENTER YOUR ACCOUNT NUMBER ");
//        accountNumber=input.nextInt();
//        for (Accounts account : linklist) {
//            if (accountNumber == accNum) {
//                System.out.println("ENTER MONEY CREDIT IN BANK ");
//                account.credit_money=input.nextFloat();
//                account.total_balance=account.total_balance-account.credit_money;
//                System.out.println("NOW YOUR BALANCE IS THIS "+account.total_balance);
//                account.total_bank_balance=account.total_bank_balance-account.credit_money;
//                break;
//            }else{
//                System.out.println("YOUR ACCOUNT NUMBER IS NOT CORRECT ");
//            }
//        }
//    }
//      void manager_loan() {
//          System.out.println(" ACCOUNT NUMBERS AND CUSTOMER NAME AND lOAN ");
//          for (Accounts account : linklist) {
//              if (account.loan >= 1) {
//                  System.out.println("ACCOUNT NUMBER :" + account.accNum);
//                  System.out.println("NAME :" + account.name + account.fname);
//                  System.out.println("LOAN :" + account.loan);
//              }
//
//          }
//          System.out.println("================================================================================");
//          System.out.println("TO SHOW ACCOUNT DETAIL");
//          System.out.println("ENTER ACCOUNT NUMBER ");
//          accountNumber = input.nextInt();
//          for (Accounts account : linklist) {
//              if (accountNumber == accNum) {
//                  System.out.println(" account details:");
//                  System.out.print("Name : " + account.name + " " + account.fname);
//                  System.out.print("Account type : " + account.accountType);
//                  System.out.println("DATE OF BIRTH : " + account.date);
//                  System.out.println("NATIONALITY : " + account.nationality);
//                  System.out.println("ADDRESS :" + account.address);
//                  System.out.println("MARITAL STATUS : " + account.maritalStatus);
//                  System.out.println("QUALIFICATION :" + account.qualification);
//                  System.out.println("PHONE NUMBER : " + account.phoneNo);
//                  System.out.println("YOUR ACCOUNT NUMBER  : " + accNum);
//                  System.out.println("TOTAL BALANCE IS " + account.total_balance);
//                  if (account.loan > 1) {
//                      System.out.println("LOAN IS " + account.loan);
//                  }
//                  System.out.println("-------------------------------------------------------------");
//                  break;
//              } else {
//                  System.out.println("ACCOUNT NUMBER IS WRONG");
//              }
//
//
//          }
//      }
//    void statement (){
//
//        System.out.println("ENTER YOUR ACCOUNT NUMBER ");
//        accountNumber=input.nextInt();
//        for (Accounts account : linklist) {
//            if (accountNumber == accNum) {
//                System.out.println("=============================================================== ");
//                System.out.println("=========================STATEMENT============================= ");
//                System.out.println("=============================================================== ");
//                for (int i = 0; i < 5; i++) {
//                    System.out.println();
//                }
//                System.out.println("NAME : " + account.name +" "+ account.fname);
//                System.out.println("ACCOUNT TYPE : " + account.accountType);
//                System.out.println("PHONE NUMBER : " + account.phoneNo);
//                System.out.println("YOUR ACCOUNT NUMBER  : " + accNum);
//
//                for (int i = 0; i < 5; i++) {
//                    System.out.println();
//                }
//                System.out.println("-------------------------------------------------------------");
//                System.out.println("TOTAL BALANCE IS "+account.total_balance);
//                if(account.loan>1){
//                    System.out.println("LOAN IS "+account.loan);
//                }
//                System.out.println("THANKS !!");
//                break;
//            } else {
//                System.out.println("YOUR ACCOUNT NUMBER IS NOT CORRECT ");
//            }
//        }
//
//    }
// void atm(){
//     System.out.println("=============================================================== ");
//     System.out.println("=========================ATM MACHINE ==========================");
//     System.out.println("=============================================================== ");
//     for (int i = 0; i < 7; i++) {
//         System.out.println();
//     }
//     System.out.println("SCAN YOUR CARD  ");
//     System.out.println("======================================");
//     System.out.println("=      SCAN                          =");
//     System.out.println("=          HERE                      =");
//     System.out.println("=               YOUR                 =");
//     System.out.println("=                     CARD           =");
//     System.out.println("=                           !!       =");
//     System.out.println("=                                    =");
//     System.out.println("=======================================");
//     System.out.println("SCANNIG.........");
//     System.out.println("SCANNIG.........");
//     System.out.println("SCANNIG.........");
//
//     System.out.println("ENTER YOUR PIN ");
//     int pin1=input.nextInt();
//     for (Accounts account : linklist) {
//        if(account.pin==pin1){
//                System.out.println("ENTER 1 DEPOSIT MONEY ");
//                System.out.println("ENTER 2 WITHDRAW MONEY");
//                System.out.println("ENTER 3 CHANGE PIN ");
//                System.out.println("ENTER 4 CHECK  BALANCE ");
//                System.out.println("ENTER 5 TO EXIT");
//                choice3=input.nextInt();
//                switch (choice3){
//                    case 1: {
//                                System.out.println("ENTER MONEY DEPOSIT IN BANK ");
//                                account.new_balance = input.nextFloat();
//                                account.total_balance = account.total_balance + account.new_balance;
//                                System.out.println("NOW YOUR  NEW BALANCE IS THIS " + account.total_balance);
//                                account.total_bank_balance = account.total_bank_balance + account.new_balance;
//                            }
//
//                    break;
//                    case 2:
//                    {
//                        System.out.println("ENTER WITHDRAW MONEY ");
//                        account.credit_money=input.nextFloat();
//                        account.total_balance=account.total_balance-account.credit_money;
//                        System.out.println("NOW YOUR BALANCE IS THIS "+account.total_balance);
//                        account.total_bank_balance=account.total_bank_balance-account.credit_money;
//                    }
//                    break;
//                    case 3:
//                    {
//                        System.out.println("ENTER YOUR NEW PIN ");
//                        account.pin=input.nextInt();
//                    }
//                    break;
//                    case 4:
//                    {
//                        System.out.println("YOUR TOTAL BALANCE IS THIS "+account.total_balance);
//                    }
//                    break;
//                    case 5:
//                    {
//                        System.exit(0);
//                    }
//                    break;
//                    default:
//                        System.out.println("YOU ENTER WRONG OPTION");
//                }
//
//
//            break;
//        }else{
//            System.out.println("YOUR PIN IS WRONG ");
//        }
//     }
//
// }
//    void loan() {
//        System.out.println("ENTER YOUR ACCOUNT NUMBER TO REQUEST LOAN  ");
//        accountNumber = input.nextInt();
//        for (Accounts account : linklist) {
//            if (accountNumber == accNum) {
//                System.out.println("YOUR ACCOUNT IS PRESENT IN BANK ");
//                System.out.println("NOW ENTER AMOUNT FOR LOAN ");
//                account.loan = input.nextFloat();
//                if (account.total_balance <= 200000) {
//                    System.out.println("YOUR REQUEST IS ACCEPTED ");
//                    System.out.println("YOUR LOAN IS ADDED IN YOUR BALANCE");
//                    account.total_balance = account.total_balance + account.loan;
//                    account.total_bank_balance = account.total_bank_balance + account.new_balance;
//                    System.out.println("YOUR NEW BALANCE IS THIS " + account.total_balance);
//                    System.out.println("NOW YOU REPAY YOUR LOAN IN ONE YEAR ");
//                    break;
//                }else{
//                    System.out.println("YOUR REQUEST IS NOT ACCEPTED BECAUSE YOUR TOTAL BALANCE IS  "+account.total_balance);
//                }
//            } else {
//                System.out.println("YOU ENTER WRONG ACCOUNT NUMBER ");
//            }
//        }
//    }
//    void show_total_bank_balance(){
//        System.out.println("TOTAL MONEY IN BANK IS "+total_bank_balance);
//    }
//    void showAccount() {
//        System.out.println("ALL ACCOUNT NUMBERS AND CUSTOMER NAME  ");
//        for (Accounts account : linklist) {
//            System.out.println(account.accNum);
//            System.out.println(account.name + account.fname);
//        }
//        System.out.println("================================================================================");
//        System.out.println("TO SHOW ACCOUNT DETAIL");
//        System.out.println("ENTER ACCOUNT NUMBER ");
//        accountNumber = input.nextInt();
//        for (Accounts account : linklist) {
//            if (accountNumber == accNum) {
//                System.out.println(" account details:");
//                System.out.print("Name : " + account.name + " " + account.fname);
//                System.out.print("Account type : " + account.accountType);
//                System.out.println("DATE OF BIRTH : " + account.date);
//                System.out.println("NATIONALITY : " + account.nationality);
//                System.out.println("ADDRESS :" + account.address);
//                System.out.println("MARITAL STATUS : " + account.maritalStatus);
//                System.out.println("QUALIFICATION :" + account.qualification);
//                System.out.println("PHONE NUMBER : " + account.phoneNo);
//                System.out.println("YOUR ACCOUNT NUMBER  : " + accNum);
//                System.out.println("TOTAL BALANCE IS " + account.total_balance);
//                if (account.loan > 1) {
//                    System.out.println("LOAN IS " + account.loan);
//                }
//                System.out.println("-------------------------------------------------------------");
//                break;
//            } else {
//                System.out.println("ACCOUNT NUMBER IS WRONG");
//            }
//        }
//    }
//    void delete_Account() {
//        System.out.println("ALL ACCOUNT NUMBERS AND CUSTOMER NAME  ");
//        for (Accounts account : linklist) {
//            System.out.println(account.accNum);
//            System.out.println(account.name+account.fname);
//        }
//        System.out.println("================================================================================");
//        System.out.println("TO DELETE ACCOUNT ");
//        System.out.println("ENTER ACCOUNT NUMBER ");
//        int accountNumber = input.nextInt();
//        for (Accounts account : linklist) {
//            if (accountNumber == accNum) {
//                linklist.remove(account);
//            }
//        }
//
//    }
//    void manager1() {
//       while(true){
//           System.out.println("MANAGER MODE ");
//           System.out.println("ENTER 1 FOR SHOW TOTAL MONEY IN BANK ");
//           System.out.println("ENTER 2 FOR SHOW ACCOUNT DETAIL");
//           System.out.println("ENTER 3 FOR DELETE ACCOUNT ");
//           System.out.println("ENTER 4 FOR SHOW HOW MANY  ACCOUNT HAS LOAN ");
//           System.out.println("ENTER 5 TO EXIT");
//           choice2=input.nextInt();
//           switch (choice2){
//               case 1:
//               {
//                   show_total_bank_balance();
//               }
//               break;
//               case 2:
//               {
//                   showAccount();
//               }
//               break;
//               case 3:
//               {
//                   delete_Account();
//               }
//               break;
//               case 4:
//               {
//                   manager_loan();
//               }
//               break;
//               case 5:
//               {
//                  Accounts();
//               }
//               break;
//               default:
//                   System.out.println("YOU ENTER WRONG OPTION");
//           }
//       }
//
//    }
//    void user1() {
//        while(true){
//            System.out.println("USER MODE ");
//            System.out.println("ENTER 1 FOR OPEN NEW ACCOUNT ");
//            System.out.println("ENTER 2 FOR DEPOSIT MONEY");
//            System.out.println("ENTER 3 FOR CREDIT  MONEY");
//            System.out.println("ENTER 4 FOR LOAN APPLICATION");
//            System.out.println("ENTER 5 FOR BANK STATEMENT");
//            System.out.println("ENTER 6 FOR ATM");
//            System.out.println("ENTER 7 FOR EXIT");
//            choice2=input.nextInt();
//            switch (choice2) {
//                case 1: {
//                    openAccount();
//                }
//                break;
//                case 2: {
//                    deposit();
//                }
//                break;
//                case 3: {
//                    credit();
//                }
//                break;
//                case 4: {
//                    loan();
//                }
//                break;
//                case 5: {
//                    statement();
//                }
//                break;
//                case 6: {
//                    atm();
//                }
//                break;
//                case 7:
//                {
//                   Accounts();
//                }
//                break;
//                default:
//                    System.out.println("YOU ENTER WRONG OPTION");
//            }
//        }
//    }
//    void manager() {
//        System.out.print("ENTER BRANCH NAME: ");
//        branchName = input.next();
//        System.out.print("ENTER PASSWORD: ");
//        password = input.next();
//
//        if (branchName.equalsIgnoreCase("Universitybranch") || password.equalsIgnoreCase("admin")) {
//            manager1();
//        } else {
//            System.out.println("Invalid branch name or password.");
//        }
//    }
//    void user() {
//        user1();
//    }
//        void Accounts() {
//            System.out.println("1. AS MANAGER");
//            System.out.println("2. AS USER");
//            System.out.println("3. to EXIT ");
//            System.out.print("Enter your choice: ");
//            choice1 = input.nextInt();
//
//            switch (choice1) {
//                case 1:
//                    manager();
//                    break;
//                case 2:
//                    user();
//                    break;
//                case 3:
//                {
//                    System.exit(0);
//                }
//                default:
//                    System.out.println("Invalid choice.");
//            }
//    }
//}
//public class uni_project{
//    public static void main(String[] args) {
//        Accounts accounts = new Accounts();
//        accounts.Accounts();
//    }
//}