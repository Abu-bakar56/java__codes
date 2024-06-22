
import java.util.InputMismatchException;
import java.util.Scanner;
class max_Input_exp extends Exception{

    public String toString(){

        return "your input is greather than 1000";
    }

}
class max_mal_exp extends Exception{

    public String toString(){

        return "your input is greather than 7000 to multiplication";
    }

}
class Calculator2 {


    private int a;
    private int b;
    private int c;

    Calculator2()  {
        Scanner ac = new Scanner(System.in);
        while (true) {
            try {

                System.out.println("enter first number");
                a = ac.nextInt();
                System.out.println("enter second number");
                b = ac.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("you enter invalid input " + e);
            }
        }
        try {
            if (a > 1000 && b > 1000) {
                throw new max_Input_exp();
            }
        } catch (Exception e) {

            System.out.println(e.toString());


        }
    }

    public void  addition(){
        c=a+b;
        System.out.println("addition =" + c);
    }
    public void  subtraction(){
        c=a-b;
        System.out.println("subtraction =" + c);
    }

    public void multiplication(){
        try {
            if (a > 7000 && b > 7000) {
                throw new max_mal_exp();
            }
        } catch (Exception e) {

            System.out.println(e.toString());


        }
        c=a*b;
        System.out.println("multiplication =" + c);
    }
    public void   division(){
        try {
            c = a / b;
            System.out.println("division =" + c);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero" + e);
        }
    }
}


public class practice01  {
    public static void main(String[] args) throws max_Input_exp,max_mal_exp {

        System.out.println("enter 1. for addition ");
        System.out.println("enter 2. for subtraction ");
        System.out.println("enter 3. for multiplication ");
        System.out.println("enter 4. for division ");

        int option;
        Scanner  y = new Scanner(System.in);
        option = y.nextInt();

        Calculator2 c1 = new Calculator2();

        switch (option){

            case 1:
            {
                c1.addition();
                break;
            }
            case 2:
            {
                c1.subtraction();
                break;
            }
            case 3:
            {
                c1.multiplication();
                break;
            }
            case 4:
            {
                c1.division();
                break;
            }
            default: {
                System.out.println("you enter invalid number ");
            }

        }
    }
}

