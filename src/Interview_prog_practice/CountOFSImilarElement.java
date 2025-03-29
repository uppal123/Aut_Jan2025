package Interview_prog_practice;

import java.util.HashMap;
import java.util.Map;

public class CountOFSImilarElement {
    public static void main(String[] args) {
        int[] num = {1,1,1,2,1,3,2,3,4,5,4,1};
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0; i< num.length ; i++){
            if(hash.containsKey(num[i])){
                int value = hash.get(num[i]);
                hash.put(num[i],value+1);
            } else {
                hash.put(num[i],1);
            }
        }
        for(Object o : hash.keySet()) {
            System.out.println("number of "+o+ "=" +hash.get(o));
        }
    }
}

