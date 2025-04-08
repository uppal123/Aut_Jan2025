package April_Program_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        String str= "Hello";
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if(map.containsKey(ch[i])){
                int value = map.get(ch[i]);
                map.put(ch[i], value+1);
            }
            else {
                map.put(ch[i], 1);
            }
        }
        for (Object o : map.keySet()){
            if(map.get(o)==1){
                System.out.println("first non repeating element: " +o);
                break;
            }
        }

    }
}
