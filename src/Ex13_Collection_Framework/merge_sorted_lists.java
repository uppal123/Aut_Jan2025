package Ex13_Collection_Framework;

import java.util.*;

public class merge_sorted_lists {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);

        List list2 = new ArrayList();
        list2.add(5);
        list2.add(6);
        System.out.println(list2);

        List mergelist = new ArrayList();
        mergelist.add(list1);
        mergelist.add(list2);
        System.out.println("merge list: " +mergelist);

       }
    }

