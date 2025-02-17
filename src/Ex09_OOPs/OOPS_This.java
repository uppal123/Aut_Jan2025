package Ex09_OOPs;

public class OOPS_This {
    public static void main(String[] args) {
        Student st = new Student();
        st.study();
        st.study("Eng");
    }
}

class Student {
    String name = "Pooja";
    String sub;

    void study() {
        // sub= "Science";
        this.sub = sub;
        System.out.println(name + " is Studying " + sub);
    }

    void study(String sub) {
        //this.sub= sub;
        System.out.println("parameterized method. " + sub);
    }

    //default const [this() Calling Another Constructor in the Same Class]
    Student() {
        this("hindi");
        System.out.println("I am default constructor");
    }

    //parameterized cont
    Student(String sub) {
        System.out.println("I am parameterized constructor." + sub);
    }
}