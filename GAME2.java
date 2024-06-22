
import java.util.Scanner;
import java.util.Random;
class MyGame{
    int user_number =0 ;
    int computer_number;
    int times =0 ;
    MyGame(){
        Random random = new Random();
        computer_number=random.nextInt(100);
    }
    void userInput(){
        System.out.println("Guess number to play game : 1-100 ");
        Scanner input = new Scanner(System.in);
        user_number=input.nextInt();
    }
    void isCorrect(){
        if(computer_number==user_number){
            System.out.println("YOU CORRECTLY GUESS THE NUMBER AND YOU WON !");
        }else if (computer_number > user_number){
            System.out.println("your number is less than computer number ");

        } else if( computer_number < user_number) {
            System.out.println("your number is greater  than computer number ");

        }
    }
    void show_u_input(){
        System.out.println("Number guess by user is that ");
        System.out.println(user_number);
    }
    void show_co_input(){
        System.out.println("Number guess by computer is that ");
        System.out.println(computer_number);
    }
    void main1(){

        while(computer_number!=user_number){
            userInput();
            isCorrect();
            times ++;
        }
        System.out.println("your score is " + times);
        show_u_input();
        show_co_input();
    }
}
public class GAME2 {
    public static void main(String[] args) {
        String option;
        Scanner input1 = new Scanner(System.in);
        MyGame myGame = new MyGame();
        System.out.println("ENTER Y TO START GAME ");
        System.out.println("ENTER N TO  END GAME ");
        option=input1.next();
        if(option.equalsIgnoreCase(("y"))){
            myGame.main1();
        }else{
            System.out.println("Thanks to play game !");
        }
    }
}
