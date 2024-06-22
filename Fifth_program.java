import java.util.Scanner;
public class Fifth_program {
    public static void main(String[] args) {
      int year;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to find is it is leap year or not");
        year = sc.nextInt();
        if(year%400==0 || year%4==0){
            System.out.println("This is leap year");
        }else{
            System.out.println("This is not leap year");
        }
    }
}
