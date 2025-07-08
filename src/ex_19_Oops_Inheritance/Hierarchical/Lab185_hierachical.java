package ex_19_Oops_Inheritance.Hierarchical;

public class Lab185_hierachical {
    public static void main(String[] args) {


 Father f1 = new Father();
 Ruhani r1 = new Ruhani();

    r1.home();
    f1.home();

    Promad p1 = new Promad();
    p1.home();

    lucky l1 = new lucky();
    l1.l2();
    l1.home();

    }


}

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class Promad extends Father {
    void h2() {
        System.out.println("h2 - Pramod");
    }
}

class lucky extends Father {
    void l2(){
        System.out.println("Lucky");
    }
}

class Ruhani extends  Father {
    void r1(){
        System.out.println("Ruhani");
    }
}