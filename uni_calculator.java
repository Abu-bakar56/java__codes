import java.util.Scanner;
    class mine_Calculator {
        Scanner ac = new Scanner(System.in);
        int choice;
        private
        int Add, Subtract, Multiply, First_number, Second_number,Division;
        mine_Calculator(){
            System.out.println("Enter the first number ");
            First_number=ac.nextInt();
            System.out.println("Enter the second number ");
            Second_number=ac.nextInt();
        }
        void Multiplication() {
            Multiply = First_number * Second_number;
            System.out.println("Result is this :");
            System.out.println(First_number + "*" +Second_number + "=" + Multiply);

        }
        void Division() {
                Division = First_number / Second_number;
            System.out.println("Result is this :");
                System.out.println(First_number + "/" + Second_number+ "=" + Division);

        }
        void Subtraction() {
            Subtract = First_number - Second_number;
            System.out.println("Result is this :");
            System.out.println(First_number + "-" + Second_number + "=" + Subtract);
        }
        void Addition() {
            Add = First_number + Second_number;
            System.out.println("Result is this :");
            System.out.println(First_number + "+" + Second_number + "=" + Add);
        }

        void menu() {

            System.out.println("1. FOR ADDITION       (+)  ");
            System.out.println("2. FOR SUBTRACTION    (-)  ");
            System.out.println("3. FOR MULTIPLICATION (*)  ");
            System.out.println("4. FOR DIVISION       (/)  ");
            System.out.println("Enter operation number");
         choice=ac.nextInt();

            switch (choice) {
                case 1:
                    Addition();
                    break;
                case 2:
                    Subtraction();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                default:
                    System.out.println("INVALID INPUT !");
            }

        }
    }

    public class uni_calculator {
        public static void main(String[] args) {
            mine_Calculator c = new mine_Calculator();
            c.menu();
        }
    }


