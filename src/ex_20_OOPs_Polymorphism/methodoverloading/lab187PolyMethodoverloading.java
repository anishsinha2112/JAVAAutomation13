package ex_20_OOPs_Polymorphism.methodoverloading;

public class lab187PolyMethodoverloading {
    public static void main(String[] args) {
          Mathoperations m1 = new Mathoperations();
          int r1 = m1.add(3,5);
          int r2 = m1.add(3,5,8);
          double r3 = m1.add(3.55,4.66);
          String r4 = m1.add("Anish","Sinha");

        System.out.println("r1 ="+r1);
        System.out.println("r2 ="+r2);
        System.out.println("r3 ="+r3);
        System.out.println("r4 ="+r4);



    }
}


class Mathoperations {
    // In the same class, when you have a method with same
    // Same name methods but different arguments and different return type.


    int add(int a, int b){
        return a + b;
    }

    int add(int a,int b,int c ){
        return a+b+c;

    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b) {
        return a + b;
    }


}
