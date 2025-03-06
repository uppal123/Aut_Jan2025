package Ex08_String_prog;

public class Stringbuffer_to_string {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        //sb.append(" World");
        System.out.println(sb);
        System.out.println(sb.length());
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" Java");
        System.out.println(sb1);
        String str = sb.toString();
        System.out.println(str);

    }
}
