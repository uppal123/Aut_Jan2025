package Ex08_String_prog;

import java.util.HashMap;

public class HashMapprog {
    public static void main(String[] args) {
        String str= "Hello java world Hello";
        String[] word = str.split(" ");
        HashMap <String, Integer> hash = new HashMap<>();

        for (String tempStr: word) {
            if (hash.containsKey(tempStr)) {
                int value = hash.get(tempStr);
                hash.put(tempStr, value + 1);
            } else {
                hash.put(tempStr, 1);
            }
        }

        for(String tempStr: hash.keySet()) {
            int value = hash.get(tempStr);
            if (value > 1) {
                System.out.println("String = "+ tempStr + " and value = " + value);
            }
        }

    }
}
