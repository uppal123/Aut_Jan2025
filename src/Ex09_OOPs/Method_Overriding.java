package Ex09_OOPs;

public class Method_Overriding {
    public static void main(String[] args) {
    Vehicle v = new Car();
    v.start("Kushaq");
    }
}

class Vehicle {
    String name = "Skoda";
    void start(String name){
        System.out.println("Vehicle's name is " +this.name);
    }
}

class Car extends Vehicle {
    @Override
    void start(String name) {
       super.start(name);
        System.out.println("Car's model is " +name);
    }
}
