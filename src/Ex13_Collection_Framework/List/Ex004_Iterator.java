package Ex13_Collection_Framework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex004_Iterator {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Bread");
        list.add("Milk");
        list.add(123);
        list.add("Milk");
        System.out.println(list);

        for(Object o : list) { //for each loop, works for list and map only
            System.out.println(o);

//iterator works with everything (list, map, queue, set)
//go one by one forward
//hasNext()- true, if we have next element
//Next()-
        }
            Iterator iterator = list.iterator();// print element one by one
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

