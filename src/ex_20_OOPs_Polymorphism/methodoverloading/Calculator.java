package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.add(3,5);
        c1.add(3.66, 6.88);
    }
}


class Calc{
    int add(int a, int b) {
        return a + b;
    }
    double add(boolean a, boolean b){
        return (a ? 1 : 0) + (b ? 1 : 0);

    }
}