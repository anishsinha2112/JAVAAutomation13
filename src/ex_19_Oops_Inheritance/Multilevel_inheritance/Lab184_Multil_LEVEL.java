package ex_19_Oops_Inheritance.Multilevel_inheritance;

public class Lab184_Multil_LEVEL {
    public static void main(String[] args) {
        Son amit = new Son();
        System.out.println(amit.gold_gf);
        amit.gf();

        Grand_Father grandFather = new Son();
        grandFather.home();
    }
}
