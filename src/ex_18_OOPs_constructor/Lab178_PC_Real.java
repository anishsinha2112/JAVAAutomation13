package ex_18_OOPs_constructor;

public class Lab178_PC_Real {

    public static void main(String[] args) {
        Person p1 = new Person("Amit",98989898,"abc");
    }


}


class Person {

    String name;
    long phone;
    String address;

    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
        this.address = address_user;
        this.phone = phone_user;



    }

}


