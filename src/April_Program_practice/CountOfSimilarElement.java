package April_Program_practice;

import java.util.HashMap;
import java.util.Map;

public class CountOfSimilarElement {
    public static void main(String[] args) {
        int[] num = {1,1,1,2,1,3,2,3,4,5,4,1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if(map.containsKey(num[i])){
                int value = map.get(num[i]);
                map.put(num[i], value+1);
            }
            else {
                map.put(num[i], 1);
            }
        }
        for (Integer i : map.keySet()){
            System.out.println("occurance of "+i +" is: " +map.get(i));
        }


    }
}
