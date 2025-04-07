package April_Program_practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "Helloo";
        char[] ch = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < ch.length; i++) {
            if (!set.contains(ch[i])) {
                set.add(ch[i]);
            }
        }
        System.out.println(set);

    }
}
