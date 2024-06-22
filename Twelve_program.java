import java.util.Scanner;

public class Twelve_program {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of table which you want");
        n=ac.nextInt();
        int a=0;
        for(int i=1;i<=10;i++){
           a=a+(n*i);

        }
        System.out.println(a);
    }
}
