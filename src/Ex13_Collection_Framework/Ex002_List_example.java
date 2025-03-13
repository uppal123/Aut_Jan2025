package Ex13_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Ex002_List_example {
    public static void main(String[] args) {
        List l = new ArrayList<>(); //dynamic dispatch
        l.add("1");
        l.add(2);
        l.add(true);
        l.add("3");
        l.add("4");
        l.add("3");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("3"));
        System.out.println(l.indexOf("4")); //returns the 1st occurance
        System.out.println(l.lastIndexOf("3"));

        System.out.println("-------");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));

        }
    }
}
