package April_Program_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> emptyList = new ArrayList<>();
//        Collections.reverse(list);
//        System.out.println(list);
        for (int i = list.size()-1; i >=0 ; i--) {
            emptyList.add(list.get(i));
        }
        System.out.println(emptyList);
    }
}
