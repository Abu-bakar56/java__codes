//abstract class Animal{
//    String work;
//    abstract void eat();
//}
//
//class Dog extends Animal{
//    void eat(){
//        System.out.println("Eating");
//    }
//}
//
//class Horse extends Animal{
//    void eat(){
//        System.out.println("Eating");
//    }
//}
//
//interface Working{
//    void setWork(String str);
//    String getWork();
//}
//
//class WorkingDog extends Dog implements Working{
//
//    public void setWork(String str){
//        work = str;
//    }
//
//    public String getWork(){
//        return "GetWork";
//    }
//
//}
//
//class WorkingHorse extends Horse implements Working{
//    public void setWork(String str){
//        System.out.println("SetWork");
//    }
//
//    public String getWork(){
//        return "GetWork";
//    }
//}
//
//
//class Person123{
//
//}
//
//class Farmer extends Person123 implements Working{
//    public void setWork(String str){
//        System.out.println("SetWork");
//    }
//
//    public String getWork(){
//        return "GetWork";
//    }
//}
//
//class FarmWorker{
//    public FarmWorker(){
//        Working [] obj = new Working[4];
//        obj[0] = new Farmer();
//        obj[1] = new Farmer();
//        obj[2] = new WorkingDog();
//        obj[3] = new WorkingHorse();
//    }
//
//}
//
//public class arslan {
//    public static void main(String[] args) {
//
//    }
//}
