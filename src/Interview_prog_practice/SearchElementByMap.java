package Interview_prog_practice;

import java.util.HashMap;
import java.util.Map;

public class SearchElementByMap {
    public static void main(String[] args) {
        int[] num = {1,2,3,1,4,4,1};
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i : num){
          if(map.containsKey(i)){
              int value = map.get(i);
              map.put(i, value+1);
          }
          else {
              map.put(i, 1);
          }
        }
        for(Integer i : map.keySet()){
            if(map.get(i)>1) {
                System.out.println("element :" + i + " occurance: " + map.get(i));
            }
        }
    }
}
