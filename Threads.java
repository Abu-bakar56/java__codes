
class myThread1 extends  Thread{
     public void run(){
int i=0;
        while(i<500){
            System.out.println("Good morning");

        }
    }
}
class myThread2 extends  Thread{
   public void run(){
 int i=0;
        while(i<500){
            System.out.println("welcome");
           /* try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } */
        }
    }
}

public class Threads {
    public static void main(String[] args) {
    myThread1 t1 = new myThread1();
    myThread2 t2 = new myThread2();
    t1.setPriority(6);
    t2.setPriority(9);
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
    t1.start();
    t2.start();
    }
}
