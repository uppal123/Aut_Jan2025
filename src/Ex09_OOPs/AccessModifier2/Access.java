package Ex09_OOPs.AccessModifier2;

import Ex09_OOPs.AccessModifier.ParentClass;

public class Access {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        System.out.println("------ Access class ----");
        obj.Public();

//        obj.Privatevar(); // Private method, not accessible
//        obj.Protectedvar(); // not accessible in different package
//        obj.Defaultvar(); // not accessible in different package

        System.out.println(obj.Publicvar);
        System.out.println("---- parent class ----");
//        System.out.println(obj.Privatevar); //can not access outside class
//        System.out.println(obj.Protectedvar); // not accessible in different package
//        System.out.println(obj.Defaultvar); // not accessible in different package

        obj.testAccess();
    }
}
