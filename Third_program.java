import java.util.Scanner;
public class Third_program {
    public static void main(String[] args) {
        int  income;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        income = sc.nextInt();


        if(income < 250000){
            System.out.println(" No tax for you ");
        } else if (income > 250000 && income < 500000) {
             double money1= 0.5*income;
            System.out.println("Your income tax to be paid is ");
            System.out.println(money1);
        } else if (income > 500000 && income < 1000000) {
            double money2= 0.20*income;
            System.out.println("Your income tax to be paid is ");
            System.out.println(money2);
        } else if (income > 1000000) {
            double money3= 0.30*income;
            System.out.println("Your income tax to be paid is ");
            System.out.println(money3);
        }
    }
}
