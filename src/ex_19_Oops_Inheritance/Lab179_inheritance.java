package ex_19_Oops_Inheritance;

public class Lab179_inheritance {
    public static void main(String[] args) {
        Father F1 = new Father();
        System.out.println(F1.gold_f);
        F1.bhk2();

        Son S1 = new Son();
        System.out.println(S1.gold_f);
        S1.bhk3();
        S1.bhk2();
    }

}
class Father {
    int gold_f = 1000; // Attribute | Data variables | Property | Instance variables

    void bhk2() { // Behaver | method | Function | Data members
        System.out.println("Father - 2BHK");

        }


}

class Son extends Father {


    void bhk3() {
        System.out.println("3bhk Son");
    }

}




