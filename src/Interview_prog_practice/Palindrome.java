package Interview_prog_practice;

public class Palindrome {
    public static void main(String[] args) {
        String str = "kalak";
        String reverse = "";
        for (int i = str.length() - 1; i >=0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (reverse.equals(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
