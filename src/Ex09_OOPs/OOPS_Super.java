package Ex09_OOPs;

public class OOPS_Super {
    public static void main(String[] args) {
//        Father f =new Father();
//        f.Car();
        Son s = new Son();
        s.property();
        s.Car();
    }
}
//single inheritance and super
class Father{
    int money= 1000;
    String house= "2BHK";

    void Car(){
        System.out.println("Father's car and money " +money);
    }

}
class Son extends Father{
    void Car(){
        int money= 200;
        super.Car(); //calling parent class method
        System.out.println("Son's car and money " + super.money);
    }
    void property(){
        System.out.println(super.house); //assessing parent class variable
    }

}
