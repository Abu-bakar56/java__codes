import java.util.Scanner;
public class Ninth_program {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of table which you want");
        n=ac.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d ",n,i,n*i);
            System.out.println();
        }
    }
}
