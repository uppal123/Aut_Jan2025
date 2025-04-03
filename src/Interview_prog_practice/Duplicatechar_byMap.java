package Interview_prog_practice;

import java.util.HashMap;
import java.util.Map;

public class Duplicatechar_byMap {

    public void searchCharactor(String name) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = name.toCharArray();

        for(int i = 0; i<= ch.length-1; i++) {
            if(map.containsKey(ch[i])){
                int value = map.get(ch[i]);
                map.put(ch[i], value + 1);
            } else {
                map.put(ch[i], 1);
            }
        }
        for (Object s: map.keySet()) {
            System.out.println("Number of " + s + "= " + map.get(s));
        }
    }

    public static void main(String[] args) {
        Duplicatechar_byMap obj = new Duplicatechar_byMap();
        obj.searchCharactor("Poojaaaa");
       // obj.searchCharactor("ssssouuuurrrrrrrrabbbbbbbbbbbhhhhhhhhhhhhhh");
    }
}
