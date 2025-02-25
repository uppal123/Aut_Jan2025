package Ex10_Java_Concepts;

public class Inheritance {
    public static void main(String[] args) {
        Father S = new Son();
        S.House();
        Father D = new Daughter();
        D.House();
        Son C = new Child();
        C.Car();

    }
}

//Single inheritance
class Father{
    int money= 1000;
    String bike = "Honda";
    void House(){
        System.out.println("Father's house");
    }
}
class Son extends Father {
    @Override
    void House() {
        super.House();
        System.out.println("Son's inherited house and bike " +super.bike);
    }
    void Car(){
        String car = "Innova";
        System.out.println("Dad's car " +car);
    }
}

//Hierarchical inheritance
class Daughter extends Father {
    @Override
    void House() {
        //super.House();
        System.out.println("Daughter's inherited house and money " +super.money);
    }
}

//Multilevel inheritance
class Child extends Son {
    @Override
    void Car() {
        super.Car();
    }
}
