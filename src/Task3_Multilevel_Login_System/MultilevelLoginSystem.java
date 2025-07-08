package Task3_Multilevel_Login_System;

public class MultilevelLoginSystem {
    public static void main(String[] args) {
        SuperAdmin sa = new SuperAdmin(); // object of most derived class
        sa.login();             // method from user
        sa.accessAdminPanel();  // method from Adminuser
        sa.shutdownSystem();    // method from superAdmin


    }
}

// Base class
class User {
    void login() {
        System.out.println("User logged in.");
    }
}

// Intermediate class
class AdminUser extends User {
    void accessAdminPanel() {
        System.out.println("Admin panel accessed.");
    }
}

// Derived class (Multilevel Inheritance)
class SuperAdmin extends AdminUser {
    void shutdownSystem() {
        System.out.println("System shutdown initiated by Super Admin.");
    }
}

