package Ex07_Array;

public class StringToArray {
    public static void main(String[] args) {
        String str= "Hi this is Pooja";
        System.out.println(str);
        char[] ch= str.toCharArray();
        String reverse = "";
            for(int j = ch.length-1; j>=0; j--) {
                reverse= reverse+ ch[j];
            }
        System.out.println(reverse);
    }
}
