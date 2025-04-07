package Interview_prog_practice;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Pooja";
        char[] ch = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < ch.length; i++) {
            if (!set.contains(ch[i])) {
            set.add(ch[i]);
            }
        }
        System.out.println(set);
//        for (Character c : map.keySet()) {
//            if (map.get(c) == 1) {
//                System.out.print(c );
//            }
//        }
    }
}