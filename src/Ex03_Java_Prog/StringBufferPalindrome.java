package Ex03_Java_Prog;

public class StringBufferPalindrome {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Pooja");
        //System.out.println(sb.reverse());
        StringBuffer reverse= sb;
        reverse = reverse.reverse();
        System.out.println(reverse);
        System.out.println(sb);

        if(sb.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
