package Ex13_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Ex007_Arraylist_class_element {
    public static void main(String[] args) {
        Student s1= new Student("Rian", "1");
        Student s2 = new Student("Sourabh", "2");
        Student s3 = new Student("Pooja", "3");

//we can use list/vector/stack/arraylist any of them
        List<Student> newlist = new ArrayList();   //Student used as custom datatype
        newlist.add(s1);
        newlist.add(s2);
        newlist.add(s3);

        System.out.println(newlist);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
