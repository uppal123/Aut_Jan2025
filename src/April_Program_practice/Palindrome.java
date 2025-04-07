package April_Program_practice;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reverse = "";
        char[] ch = str.toCharArray();
        for (int i = ch.length-1; i >= 0 ; i--) {
            reverse = reverse + ch[i];
        }
        //System.out.println(reverse);
        if(reverse.equals(str)){
            System.out.println("p");
        }
        else {
            System.out.println("NP");
        }
    }
}
