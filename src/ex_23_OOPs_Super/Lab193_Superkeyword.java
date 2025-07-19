package ex_23_OOPs_Super;

public class Lab193_Superkeyword {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}


class Vehicle {
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("Defult C");
    }

    // Method Overloading - Same, Same name function with different arguments.
    void message(int a){
        System.out.println("Type 2");
    }
    void message(){
        System.out.println("Type 1");
    }
    int message(String a){
        System.out.println("Type 4");
        return 0;
    }

    int display(){
        System.out.println("Vechicle Parent");
        return 0;
    }
}

class Car extends Vehicle{
    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    Car(){
     super();
    }
    Car(int a){
      super();
    }

    @Override
    int display() {
        System.out.println("Hi Override");
        return 0;
    }
}
