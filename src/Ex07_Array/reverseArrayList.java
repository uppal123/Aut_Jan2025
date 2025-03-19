package Ex07_Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class reverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(45);
        arr.add(2);
        arr.add(4);

        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}