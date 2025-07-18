package ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {

    public static void main(String[] args) {

        VWOLogin vwoLogin = new VWOLogin("admin","Pass1234");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "3456";
        System.out.println(vwoLogin.password);

    }
}

class VWOLogin{
    public String Username;
    public String password;

    public VWOLogin(String username,String password) {
        this.password = password;
        Username = username;

        GoodVWLogin vwLogin = new GoodVWLogin("admin","pwd1234");
//        System.out.println(vwLogin.Password);
        String pass = vwLogin.getPassword();
        System.out.println(pass);


    }
}
class GoodVWLogin{
    private String username;
    private String password;

    public GoodVWLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        }else {
            System.out.println("Can't change the password");
        }
        this.password = password;
    }
}