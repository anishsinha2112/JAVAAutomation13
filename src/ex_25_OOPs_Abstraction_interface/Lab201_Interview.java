package ex_25_OOPs_Abstraction_interface;

public class Lab201_Interview {
}


interface I11{}
interface I12{}
class A1{}
class B2{}
abstract class Anish{
    abstract void aa();
}
class Test1 extends A1{}
//class Test2 extends A1,B2{} // Multiple interheirn in class is not  allowed
class Test3 implements I11 {}
class Test4 implements I12,I11{}
class Test5 extends A1 implements I11,I12{}
//class Test6 implements I12 extends A1{}
// interface I3 extands A1{}
interface I3{}
interface I4{
    default void m1(){

    }
    default void m19(){

    }
    static void m2 (){

    }

}

