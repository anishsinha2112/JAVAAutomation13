package ex_27_Static;

public class Lab205_Static_IIB {

    public static void main(String[] args) {
        P p1 = new P();
        System.out.println(P.a);
        p1.a = 12;
        System.out.println(P.a);
        System.out.println(p1.a);

    }

}



class P{
    static int a = 10;
}

