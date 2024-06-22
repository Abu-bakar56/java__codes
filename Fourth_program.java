import java.util.Scanner;
public class Fourth_program {
    public static void main(String[] args) {
        System.out.println("Number for find name of day in week");
        System.out.println("1 : for Monday");
        System.out.println("2 : for Tuesday");
        System.out.println("3 : for Wednesday");
        System.out.println("4 : for Thursday");
        System.out.println("5 : for Friday");
        System.out.println("6 : for Saturday");
        System.out.println("7 : for Sunday");
        System.out.println("Now you Enter number");
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();


        switch (a) {
            case 1:
                System.out.println("MONDAY!");
                break;
            case 2:
                System.out.println("TUESDAY!");
                break;
            case 3:
                System.out.println("WEDNESDAY!");
                break;
            case 4:
                System.out.println("THURSDAY!");
                break;
            case 5:
                System.out.println("FRIDAY!");
                break;
            case 6:
                System.out.println("SATURDAY!");
                break;
            case 7:
                System.out.println("SUNDAY!");
                break;
        }
    }

}
