package Ex13_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex005_examples {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add("24");
        marks.add("98");
        marks.add("46");
        marks.add("67");
        marks.add("80");
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        //Collections-> class, it contains complete method which list, set, queue may require
        //Collection-> is interface
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
