import java.util.Scanner;
public class Tenth_program {
        public static void main(String[] args) {
            Scanner ac = new Scanner(System.in);
            int n;
            System.out.println("Enter the number of table which you want");
            n=ac.nextInt();
            for(int i=10;i>=1;i--){
                System.out.printf("%d * %d = %d \n",n,i,n*i);

            }
        }


}
