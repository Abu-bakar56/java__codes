import java.util.Scanner;

public class Call_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int call_duration_min;
        int call_charges;
        int Total_charges;
        System.out.print("Enter the call duration in minutes: ");
        call_duration_min = scanner.nextInt();
        System.out.println("Total call duration: " + call_duration_min + " minutes");

        if (call_duration_min > 0 && call_duration_min <= 2) {
            call_charges = 12;
        } else if (call_duration_min > 2 && call_duration_min <= 5) {
            call_charges = 10;
        } else if (call_duration_min > 5 && call_duration_min <= 8) {
            call_charges = 7;
        } else if (call_duration_min > 8 && call_duration_min <= 10) {
            call_charges = 5;
        } else {
            call_charges = 3;
        }

        Total_charges = call_charges * call_duration_min;
        System.out.println("Total charges are: " + Total_charges);

    }


    }


//
