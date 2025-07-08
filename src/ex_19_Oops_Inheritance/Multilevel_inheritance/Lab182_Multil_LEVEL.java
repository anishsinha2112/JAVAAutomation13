package ex_19_Oops_Inheritance.Multilevel_inheritance;

public class Lab182_Multil_LEVEL {
    public static void main(String[] args) {
        Grand_Father gf = new Grand_Father();
        gf.gf();

        Father F1 = new Father();
        F1.gf();
        F1.f();
        System.out.println("---");

        Son S1 = new Son();
        S1.gf();
        S1.f();
        S1.s();



    }

}
