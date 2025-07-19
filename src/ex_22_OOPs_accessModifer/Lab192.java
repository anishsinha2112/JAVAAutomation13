package ex_22_OOPs_accessModifer;

public class Lab192 {


}

class Father{
    private int gold =10;
    int car = 1;
    public int bhk3 = 1;


}


class son extends Father{
    void weCause(){
  //      System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);
    }
}