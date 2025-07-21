package ex_25_OOPs_Abstraction_interface;

public class Lab198_Interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(10,33);

        Square S1 = new Square();
        S1.getArea(3,6);


    }








}

class Rectangle implements Polygon {

    @Override
    public Void getArea(int lenght, int breadth){
        System.out.println("The area of the rectangle is " + (lenght*breadth));
        return null;
    }
}

class Square implements Polygon {

    @Override
    public Void getArea(int length,int breadth) {
        System.out.println("Area of Square ->" + 3.14 * length * breadth);
        return null;
    }

}

interface Polygon {
    Void getArea(int length, int breacth);
 //   void complete(){
 //
 //   }

    default void complete(){
        System.out.println("This is possible");

    }
    default void Complete2(){
        System.out.println("This is possible2");


    }

    static void staticComplete(){
        System.out.println("Static F1 in interface allowed, complete");


    }
}
