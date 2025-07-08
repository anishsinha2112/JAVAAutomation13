package Task1_Animal_Sound_Simulator;

public class Animal_sound_simulator {
    public static void main(String[] args) {

        Cat cat = new Cat();         // Create Cat object
        cat.makeSound();             // Call method from base class
        cat.meow();                  // Call method from derived class

    }

}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
// Derived class (Single Inheritance)
class Cat extends Animal {
    void meow() {
        System.out.println("Cat says Meow!");
    }
}


