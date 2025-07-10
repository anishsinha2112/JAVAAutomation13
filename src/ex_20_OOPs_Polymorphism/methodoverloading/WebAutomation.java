package ex_20_OOPs_Polymorphism.methodoverloading;

public class WebAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser("Chrome");

    }
}


class Browser {

    void startBrowser() {
        System.out.println("Starting a default Browser");
    }
    String startBrowser (String browser) {
        System.out.println("Starting Browser"+ browser);
        return browser;
    }
}
