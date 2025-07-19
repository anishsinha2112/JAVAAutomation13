package ex_22_OOPs_accessModifer.police;

public class Cop {
    public int gun;
    String iCard;


    public Cop(int bullet){
        this.gun = bullet;
    }

    //Method and / Behav
   protected Void canIShoot(){
        System.out.println("Yes you can !!");
        return null;
    }



}
