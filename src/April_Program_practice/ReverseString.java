package April_Program_practice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] ch = str.toCharArray();
        String reverse = "";
        for (int i =ch.length-1 ; i >=0 ; i--) {
            reverse = reverse + ch[i];
        }
        System.out.println(reverse);
    }
}
