package Ex09_OOPs.AccessModifier2;
import Ex09_OOPs.AccessModifier.ParentClass;

public class ChildClass extends ParentClass {
    public void ParentMethodAccess () {
        System.out.println(Publicvar);
//        System.out.println(Privatevar); // not accessible outside class
        System.out.println(Protectedvar);
//        System.out.println(Defaultvar); //not accessible in different package

        Public();
        Protected();
//        Private(); // not accessible outside class
//        Default(); //not accessible in different package
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        System.out.println("----- child class----");
        obj.ParentMethodAccess();
        System.out.println("----- Parent class -----");
        obj.testAccess();
    }
}
