
import java.util.Scanner;

public class Plane{
    public static void main(String[] args) {
        boolean[][] plane = new boolean[10][10];

        for (int i = 0; i < plane.length; i++) {
            for (int j = 0; j < plane[i].length; j++) {
                System.out.print("[ ]");
                System.out.print(" ");
                if(j==4){
                    System.out.print("   ");

                }
                System.out.print(" ");


            }
            System.out.println();
        }

        int seat;
        System.out.println("Enter seat number to book in the airplane: ");
        Scanner scanner = new Scanner(System.in);
        seat = scanner.nextInt();

        if (seat >= 1 && seat <= 100) {
            int row = (seat - 1) / 10;
            int col = (seat - 1) % 10;

            if (!plane[row][col]) {
                plane[row][col] = true;
                System.out.println("Seat booked successfully.");
            } else {
                System.out.println("Seat is already booked.");
            }
        } else {
            System.out.println("Invalid seat number. Please enter a number between 1 and 100.");
        }

        // Display the updated plane with booked seats
        System.out.println("Updated Plane with Booked Seats:");
        for (int i = 0; i < plane.length; i++) {
            for (int j = 0; j < plane[i].length; j++) {
                if (plane[i][j]) {
                    System.out.print("[X] ");

                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }
}
