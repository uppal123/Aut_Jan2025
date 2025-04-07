package April_Program_practice;

public class DoubleChar {
    public static void main(String[] args) {
        String str = "abcd";
        StringBuilder sb = new StringBuilder();
        char[] ch  = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]).append(ch[i]);
        }
        System.out.println(sb);
    }
}
