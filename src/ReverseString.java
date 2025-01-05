import java.sql.SQLOutput;
import java.util.HashMap;

public class ReverseString {
    String str = "Pooja";
    String reverse = "";

    public void reverse(){
        for(int i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }

    public void eliminateDuplicate(){
        char[] ch = str.toCharArray();
        String withoutDuplicates = "";
        HashMap<Character, Integer> charactersName = new HashMap<Character, Integer>();
        for(int i= 0; i < str.length(); i++) {
            if (charactersName.containsKey(ch[i])) {
//                int value = charactersName.get(ch[i]);
//                value += 1;
                charactersName.put(ch[i], charactersName.get(ch[i]) + 1);
            } else {
                withoutDuplicates += ch[i];
                charactersName.put(ch[i], 1);
            }
        }

        System.out.println(charactersName);
        System.out.println(withoutDuplicates);
    }

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
       // r.reverse();
        r.eliminateDuplicate();
        //r.testStrings();
    }

    public void testStrings() {
        String name1 = "Pooja";
        String name2 = "Pooja";

        System.out.println(name1 == name2);
    }
}
