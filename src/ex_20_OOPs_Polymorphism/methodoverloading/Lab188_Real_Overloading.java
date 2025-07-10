package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab188_Real_Overloading {
    public static void main(String[] args) {
            Home h1 = new Home();
            h1.task(3);
            h1.task(true);


    }
}


class Home {

    Void task (){
        System.out.println("Task 1");
        return null;
    }

    int task(int a){
        System.out.println("Task 1");
        return a;
    }

    boolean task(boolean a){
        return false;

    }


}
