import java.util.Scanner;

class student4{
    int roll;
    String name;

    static int count;
    Scanner ac = new Scanner(System.in);
    student4(){

    }

    student4(int roll,String name){
        this.roll=roll;
        this.name=name;
        count++;
    }

    void get(){
        System.out.println("ENTER YOUR NAME");
        name=ac.next();
        System.out.println("ENTER YOUR ROLL NUMBER");
        roll=ac.nextInt();
        count++;
    }
    student4(Student s){
        name=s.name;
        roll=s.roll;
        count++;
    }


    void show(){
        System.out.println("Your name is "+name);
        System.out.println("your roll is"+roll);
        System.out.println(count);
    }
}


class Final_practice{
    public static void main(String[] args) {
        student4 st = new student4(44,"ali");

        st.show();
    }
}