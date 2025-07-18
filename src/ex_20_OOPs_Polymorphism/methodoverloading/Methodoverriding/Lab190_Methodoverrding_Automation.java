package ex_20_OOPs_Polymorphism.methodoverloading.Methodoverriding;

public class Lab190_Methodoverrding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        FirefoxF f1 = new FirefoxF();
        f1.openBrowser();
    }

}

class CommanToAll{
    void openBrowser(){
        System.out.println("Starting IE Browser !!");
    }
}

class ChromeTC extends CommanToAll {

    @Override
    void openBrowser() {
        System.out.println("Starting Chrome Browser");
    }

}
class FirefoxF extends CommanToAll{

    static class Firefox extends CommanToAll {

        @Override
        void openBrowser() {
            System.out.println("Starting Firefox Browser");
        }

    }
}