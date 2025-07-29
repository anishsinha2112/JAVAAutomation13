package ex_25_OOPs_Abstraction_interface;

public class Lab200_Car_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        Child C1 = new Child();
        C1.money();
    }





}


interface Father1{
    void money();
}

interface Father2{
    void money();
}


class Child implements Father1,Father2{

    @Override
    public void money() {
        System.out.println("Child own Money!");
    }
}



