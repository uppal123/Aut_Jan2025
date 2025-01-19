import org.w3c.dom.ls.LSOutput;

public class Palindrome {

    String str = "noon";

    public void stringPalindrome() {
        String reverseStr = "";

        char ch;
        for (int i = 0;  i< str.length(); i++) {
            ch = str.charAt(i);
            reverseStr = ch + reverseStr;
        }

        System.out.println(reverseStr);
        if (reverseStr.equals(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public void checkStrings() {
        //String newStr = "poop";

        System.out.println("poop" == str);
    }

    public void numberPalindrome(int number) {
        int initialNumber = number;
        int reversenumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversenumber = reversenumber * 10 + digit;
            number = number / 10;
        }

        if (initialNumber == reversenumber) {
            System.out.println(initialNumber + " is palindrome");
        } else {
            System.out.println(initialNumber + " is not palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
       // p.checkStrings();
       //p.stringPalindrome();
        p.numberPalindrome(149);
    }

}
