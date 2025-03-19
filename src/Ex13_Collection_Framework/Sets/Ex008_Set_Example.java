package Ex13_Collection_Framework.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex008_Set_Example {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
//hashset-> no order, no duplicate
        hs.add("dapple");
        hs.add("apple");
        hs.add("orange");
        hs.add("orange");
        hs.add(null);
       // hs.add(123);
        System.out.println(hs);

        System.out.println("-------------");
        Set lhs = new LinkedHashSet(); // order is maintained, no duplicate
        lhs.add("dapple");
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("orange");
        lhs.add(null);
        // lhs.add(123);
        System.out.println(lhs);

        System.out.println("---------------");
        Set ts = new TreeSet(); //order will maintained, sorting is doneby default
        ts.add("dapple");
        ts.add("apple");
        ts.add("orange");
        ts.add("orange");
        //ts.add(null); //no null value
        // ts.add(123);
        System.out.println(ts);

        System.out.println("------for each -----");
        for( Object o : ts){
            System.out.println(o);
        }
    }
}
//in selenium-> linkedlist
//in api-> arraylist
//need to remeber-> arraylist, hashmap, hashset, linkedlist
//their function- add, remove, get, put, replace, contains, ….iterator