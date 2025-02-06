package Ex03_Java_Prog;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String word = sc.next();
        String reverse= "";
        for(int i= 0; i<word.length(); i++){
            reverse = word.charAt(i) + reverse;
        }
        if(reverse.equals(word)){
            System.out.println(reverse + " word is palindrome");
        }
        else{
            System.out.println(reverse + " is not palindrome");
        }
    }
}
