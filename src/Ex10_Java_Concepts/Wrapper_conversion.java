package Ex10_Java_Concepts;

import org.w3c.dom.ls.LSOutput;

public class Wrapper_conversion {
    public static void main(String[] args) {
        String a = "10";
        int b = 2;
        // String -> Wrapper conversion
        Integer a1 = Integer.parseInt(a);
        // String to Primitive
       int b1 = Integer.parseInt(a);
        System.out.println(Integer.max(b, b1));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer aa = Integer.valueOf("10");
        System.out.println(aa);
    }
}


