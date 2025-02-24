package Ex10_Java_Concepts;

public class Constructor_concept {
    public static void main(String[] args) {
        Student s2 = new Student();
        Student s1 = new Student(23);
        Student s = new Student(50,"Raj");
    }
}

class Student{
    int age;
    String name;

    Student(){
    this.age= 0;
    this.name= "unknown";
        System.out.println("Default Constructor" +age +", " + name);
    }
    Student(int age){
        this.age= age;
        this.name= "Rian";
        System.out.println("Parameterized constructor " +age +", " +name);
    }
    Student(int age, String name){
        this.age= age;
        this.name= name;
        System.out.println("Constructor overloading " +age +", " +name);
    }
}
