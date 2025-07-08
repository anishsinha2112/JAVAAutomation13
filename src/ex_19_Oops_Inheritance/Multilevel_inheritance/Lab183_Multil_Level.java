package ex_19_Oops_Inheritance.Multilevel_inheritance;

public class Lab183_Multil_Level {
    public static void main(String[] args) {
        Son amit = new Son();
        // Son s1 = New Father
        // Son s1 = New GrandFather();

        Grand_Father g1 = new Son(); // Dynamic Dispatch
        g1.gf();
        g1.home();

        Grand_Father g2 = new Father();
        g2.home();

        Father f2 = new Son();
        f2.home();


        // WebDriver driver = new ChromeDriver()l;

    }
}
