import java.util.Scanner;
public class Second_program {
    public static void main(String[] args) {
        float english,urdu,computer;
        int marks=100;
        int subjects=3;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks of English subject out of : 100");
        english = sc.nextFloat();
        System.out.println("Enter the marks of Urdu subject out of : 100");
        urdu = sc.nextFloat();
        System.out.println("Enter the marks of Computer subject out of : 100");
        computer = sc.nextFloat();

        float total_marks=english+urdu+computer;

        float per = total_marks*100/(marks*subjects);


        if(per > 40){
            if(english > 33 && urdu > 33&& computer >33){
                System.out.println("Student is pass");
            }else{
                System.out.println("Student is fail ");
            }

        }else{
            System.out.println("Student is fail ");
        }
    }

}
