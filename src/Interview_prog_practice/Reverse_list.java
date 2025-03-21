package Interview_prog_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_list {
    public static void main(String[] args) {
        List list = new ArrayList(Arrays.asList(1,2,3,4,5));
//        int left = 0;
//        int right = list.size()-1;
//        while(left< right){
//
         System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);

        List reverselist = new ArrayList();

        for (int i = list.size()-1; i >=0 ; i--) {
            int value = (int) list.get(i);
            reverselist.add(value);
        }
        System.out.println(reverselist);
        }
    }

