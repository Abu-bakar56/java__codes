import java.util.Scanner;
public class board {
    public static void main(String[] args) {
        int a;
        int b;
        int c , d ,f;
        Scanner se = new Scanner(System.in);
        System.out.println("enter the number of subject 1");
        a=se.nextInt();
        System.out.println("enter the number of subject 2");
        b=se.nextInt();
        System.out.println("enter the number of subject 3");
        c=se.nextInt();
        System.out.println("enter the number of subject 4");
        d=se.nextInt();
        System.out.println("enter the number of subject 5");
        f=se.nextInt();
        int sum=a+b+c+d+f;

         int tol=5*5;
        int per=(sum*100)/tol;

        System.out.println("percentage of marks is this ");
        System.out.println(per);

    }
}
