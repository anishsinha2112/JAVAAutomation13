package Task_2_Vehicle_Constructor_Chain;

public class VehicleConstructorChain {
    public static void main(String[] args) {
        Bike bike = new Bike();  // Object creation triggers constructor chain

    }
}

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is ready");
    }
}

// Derived class
class Bike extends Vehicle {
    Bike() {
        System.out.println("Bike is ready");
    }
}


