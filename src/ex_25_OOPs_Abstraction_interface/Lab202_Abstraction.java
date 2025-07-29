package ex_25_OOPs_Abstraction_interface;

public class Lab202_Abstraction {
}

abstract class Incomplete_abstarct{
    int a= 10;
    abstract void display1();
    void display2(){
        System.out.println("print");
    }
}

interface Incomplete_Interface{
    int a = 10;  // final
    void display();

    default void display2(){
        System.out.println("Default is allowed!");

    }
    static void display3(){
        System.out.println("Default is allowed");
    }
}