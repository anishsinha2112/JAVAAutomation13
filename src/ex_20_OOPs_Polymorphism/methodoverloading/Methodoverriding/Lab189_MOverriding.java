package ex_20_OOPs_Polymorphism.methodoverloading.Methodoverriding;

public class Lab189_MOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }

}

class Animal{

    void sound(){
        System.out.println("Default sound");
    }

}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Bark!!");
    }
        }
