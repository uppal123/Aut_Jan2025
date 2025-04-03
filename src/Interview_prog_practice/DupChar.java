package Interview_prog_practice;

import java.util.HashMap;
import java.util.Map;

public class DupChar {
    public static void main(String[] args) {
        String name = "PPoojaa";
        char[] ch = name.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if(map.containsKey(ch[i])) {
              int value = map.get(ch[i]);
              map.put(ch[i], value+1);
            }
            else{
                map.put(ch[i],1);
            }
        }
        for(Object o : map.keySet()){
            System.out.println(o +"=" +map.get(o));
        }
    }
}
