package Interview_prog_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacterByMap {
    public static void main(String[] args) {
        String str = "PkoojaakzP";
        Map <Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                int value = map.get(str.charAt(i));
                map.put(str.charAt(i), value+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        for(Character c : map.keySet()){
            if (map.get(c) == 1) {
                System.out.println(c +" - " + map.get(c));
                break;
            }
        }
    }
}
