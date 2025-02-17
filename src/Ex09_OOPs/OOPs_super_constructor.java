package Ex09_OOPs;

public class OOPs_super_constructor {
    public static void main(String[] args) {
    Child c = new Child();
    }
}

class Parent{
    //int a= 10;
    Parent(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    Child(){
        super(); //calling parent class constructor
        System.out.println("Child method");
    }

}