package shape;
import shape.rectangular;

import java.util.Scanner;


class circle extends rectangular{
    public void volume1(){
        System.out.println("calculate volume");
        int a,b,c;
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a ");
        a=ac.nextInt();
        System.out.println("enter b ");
        b=ac.nextInt();
        System.out.println("enter b ");
        c=ac.nextInt();
        System.out.println("result is that "+(a*b*c)/2);

    }
    public void area1(){
        System.out.println("calculate area");
        int e,f;
        Scanner ac = new Scanner(System.in);
        System.out.println("enter e ");
        e=ac.nextInt();
        System.out.println("enter f ");
        f=ac.nextInt();

        System.out.println("result is that "+(e*f)/2);
    }

}
public class mainshape1 {
    public static void main(String[] args) {
        circle c = new circle();
        c.area1();
        c.volume1();
    }

}
