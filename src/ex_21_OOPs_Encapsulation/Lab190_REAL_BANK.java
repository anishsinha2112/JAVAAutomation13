package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_BANK {
    public static void main(String[] args) {
        ICICIBANK amit = new ICICIBANK("Amit",100);
        long bal = amit.getBal();
        System.out.println(bal);
        amit.setBal(550,true);
        long bal2 = amit.getBal();
        System.out.println(bal2);
    }
}

class ICICIBANK {
    private String name;
    private long bal;

    public ICICIBANK(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the bal");

        }
    }
}