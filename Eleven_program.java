import java.util.Scanner;
public class Eleven_program {
    public static void main(String[] args) {
        int n;
        Scanner se = new Scanner(System.in);
        System.out.println("Enter number which you want factorial");
        n=se.nextInt();
        int fact=1;
        for( int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
