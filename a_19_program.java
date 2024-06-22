import java.util.Scanner;
class Employee{
    int id;
    String name;
    int salary;
     Scanner ac = new Scanner(System.in);
     public void get_info(){
        System.out.println("Enter the id of employee");
        id=ac.nextInt();
        System.out.println("Enter the name of employee");
        name=ac.next();
        System.out.println("Enter the salary of employee");
        salary=ac.nextInt();
     }
     public void show_info(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

}
public class a_19_program {
    public static void main(String[] args) {
           Employee ep = new Employee();
           ep.get_info();
           ep.show_info();
    }
}
