package shape;


import java.util.Scanner;

interface shapee{
    void volume();
    void area();
}

class rectangular implements shapee{
    public void volume(){
        System.out.println("calculate volume");
        int a,b,c;
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a ");
        a=ac.nextInt();
        System.out.println("enter b ");
        b=ac.nextInt();
        System.out.println("enter b ");
        c=ac.nextInt();
        System.out.println("result is that "+(a*b*c));

    }
   public void area(){
       System.out.println("calculate area");
       int e,f;
       Scanner ac = new Scanner(System.in);
       System.out.println("enter e ");
       e=ac.nextInt();
       System.out.println("enter f ");
       f=ac.nextInt();

       System.out.println("result is that "+(e*f));
    }

}
public class mainShape {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        rectangular r = new rectangular();
        r.volume();
        r.area();
    }
}
