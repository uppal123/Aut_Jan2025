package Ex08_String_prog;

public class StringOperation {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "World";
        String str3 = "Hello" + "World";
        String str4= "Hello";
        System.out.println(str+str2);
        System.out.println(str3);
        System.out.println(str.equals(str4));
        System.out.println(str.concat(str2));
        System.out.println(str==str4);;
    }
}
