package April_Program_practice;

import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(2,4,6,1,8,3));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size()-2));
    }
}
