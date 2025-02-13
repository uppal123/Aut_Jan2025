package Ex07_Array;

public class StringToArray {
    public static void main(String[] args) {
        String str= "Hello world";
        char[] ch= str.toCharArray();
        String reverse = "";
            for(int j = ch.length-1; j>=0; j--) {
                reverse= reverse+ ch[j];
            }
        System.out.println(reverse);
    }
}
