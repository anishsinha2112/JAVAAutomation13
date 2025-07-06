package ex_17_OOPs;

public class Person {

    // These are called properties, attributes, instance variables, member variables.
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;


    // These are called as Behaviours, Member Functions, Functions, Methods.

    Void walk(){
        System.out.println("Walking");
        return null;
    }
    void eat(String food){
        System.out.println("eating");
    }

    Void Sleep(){
        System.out.println("Sleeping");
        return null;
    }

    String food (int a){
        System.out.println("eating");
        return null;

    }



}
