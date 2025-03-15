package Ex13_Collection_Framework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex012_Map_within_Arraylist {
    public static void main(String[] args) {
        HashMap<String, String> student1= new HashMap<>();
        student1.put("name","Rian");
        student1.put("rollno", "1");
        student1.put("phone", "456789789");
        System.out.println(student1);

        HashMap<String, String> student2= new HashMap<>();
        student2.put("name","Pooja");
        student2.put("rollno", "2");
        student2.put("phone", "9876543456");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
