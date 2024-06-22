abstract class Animal1 {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

public class a_16_program{
    public static void main(String[] args) {
        Animal1 animal1 = new Dog1();
        animal1.makeSound();
    }
}
