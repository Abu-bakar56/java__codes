
abstract class Animal{
    abstract public void eats();
}

class Dog extends Animal{
    @Override
    public void eats(){
        System.out.println("Dog eats dog food");
        System.out.println(""sdfs);
    }
}

class Horse extends Animal{
    @Override
    public void eats() {
        System.out.println("Horse eats grass");
    }
}

interface Working{
    public void setWork(String str);
    public String getWork();
}

class WorkingDog extends Dog implements Working{
    String work;
    public void setWork(String str){
        work = str;
    }

    @Override
    public String getWork() {
        return work;
    }
}

class WorkingHorse extends Horse implements Working{
    String work;
    public void setWork(String str){
        work = str;
    }

    @Override
    public String getWork() {
        return work;
    }
}

class Person{
    String work;
}

class Farmer extends Person implements Working{
    public void setWork(String str){
        work = str;
    }

    @Override
    public String getWork() {
        return work;
    }
}

class FarmWorkers{
    Working[] arr = new Working[4];

    public void displayWorks() {
        for (Working worker : arr) {
            System.out.println(worker.getWork());
        }
    }

    public static void main(String[] args) {
        FarmWorkers farmWorkers = new FarmWorkers();

        Farmer farmer1 = new Farmer();
        farmer1.setWork("Farmer 1 is working in the field");
        Farmer farmer2 = new Farmer();
        farmer2.setWork("Farmer 2 is resting");

        WorkingDog workingDog = new WorkingDog();
        workingDog.setWork("Dog is eating dog food");

        WorkingHorse workingHorse = new WorkingHorse();
        workingHorse.setWork("Horse is eating grass");


        farmWorkers.arr[0] = farmer1;
        farmWorkers.arr[1] = farmer2;
        farmWorkers.arr[2] = workingDog;
        farmWorkers.arr[3] = workingHorse;

        System.out.println("Animal function overriding:");
        workingDog.eats();
        workingHorse.eats();
        System.out.println("Farm workers:");
        farmWorkers.displayWorks();
}
}
