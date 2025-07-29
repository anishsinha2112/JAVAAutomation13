package ex_25_OOPs_Abstraction_interface;

public class Lab199_Car_Practicel_Interface {

    public static void main(String[] args) {
        Car1 tasla = new Car1();
        tasla.drive();
    }


}





class Car1 implements Engines1,Breaks{

    void drive (){
        StartEngine();
        applyBreak();
        StopEngine();
    }

    @Override
    public Void applyBreak() {
        return null;
    }

    @Override
    public Void StartEngine() {
        return null;
    }

    @Override
    public Void StopEngine() {
        return null;
    }

    @Override
    public void Money() {
        System.out.println("son have earn by itself");

    }
}























interface Breaks{
    Void applyBreak();
    void Money();
}

interface Engines1{
    Void StartEngine();
    void Money();
    Void StopEngine();
    default Void completeF1(){
        System.out.println("concrete complete");
        return null;
    }
}
