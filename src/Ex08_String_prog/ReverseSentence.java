package Ex08_String_prog;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Hi this is Pooja";
        System.out.println(str);
        String[] str1 = str.split(" ");
        String reverse = "";
        for (int i = 0; i < str1.length; i++) {
            String ch = str1[i];
            for (int j = ch.length()-1; j >=0 ; j--) {
                reverse+= ch.charAt(j);
            }
            reverse += " ";
        }
        System.out.println(reverse);
    }
}
