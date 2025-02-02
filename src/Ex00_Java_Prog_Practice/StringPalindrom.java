package Ex00_Java_Prog_Practice;

import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.next();

        String reverse = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            reverse = ch+reverse;
        }
       System.out.println("reverse string " +reverse);
            if (reverse.equals(str)) {
                System.out.println("String is Palindrome ");
            } else {
                System.out.println("String is not Palindrome ");
            }
        }
    }

