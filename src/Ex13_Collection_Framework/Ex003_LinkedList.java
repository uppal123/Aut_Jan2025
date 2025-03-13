package Ex13_Collection_Framework;

import java.util.LinkedList;
import java.util.List;

public class Ex003_LinkedList {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Pooja");
        list.add("Rian");
        list.add(null);
        list.add(true);
        list.add(1);
        list.add("Rian");
        System.out.println(list);
        System.out.println(list.size());
        list.remove("Pooja");
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Pooja"));
        System.out.println(list.indexOf("Rian"));
        System.out.println(list.lastIndexOf("Rian"));

    }
}
