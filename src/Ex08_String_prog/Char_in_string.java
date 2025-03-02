package Ex08_String_prog;

public class Char_in_string {
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
