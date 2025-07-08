package ex_19_Oops_Inheritance.Single_inheritance;

public class Lab181_real_si {
    public static void main(String[] args) {
       TestCase1 t1 = new TestCase1();
       t1.runningTC1();

       TestCase2 t2 = new TestCase2();
       t2.runningTC1();

       CommonToAll c1 = new CommonToAll();
       TestCase1 t3 = new TestCase1();
       CommonToAll c2 = new TestCase1(); // Dynamic Dispatch (extends)



    }
}
