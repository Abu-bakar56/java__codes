import java.util.Scanner;
import java.util.Random;

public class GAME1 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] options = {"rock", "paper", "scissors"};

        String userMove;
        String computerMove;

        Scanner sc = new Scanner(System.in);

        System.out.println("PRESS Y for Start Game");
        System.out.println("PRESS N for exit Game");

        String choice = sc.next();
        int i = 0;
        while (i < 3) {
            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("NOW CHOICE ONE FROM THESE THREE");
                System.out.println("rock");
                System.out.println("paper");
                System.out.println("scissors");
                userMove = sc.next();
                computerMove = options[random.nextInt(3)];

                System.out.println("Computer's move: " + computerMove);

                if (computerMove.equals(userMove)) {
                    System.out.println("GAME IS TIE!");
                } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                        (userMove.equals("paper") && computerMove.equals("rock")) ||
                        (userMove.equals("scissors") && computerMove.equals("paper"))) {
                    System.out.println("YOU WON THIS GAME");
                } else {
                    System.out.println("YOU LOSE THIS GAME");
                }
            } else {
                System.out.println("Thanks for playing. Goodbye!");
            }
            i++;
        }
    }
}
