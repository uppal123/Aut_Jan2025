package Ex_01_Java_Prog_Practice;

import java.util.Scanner;

public class Vowel_consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = sc.next();
        int vowelcount = 0;
        int consonentcount = 0;

        for(int i=0; i< name.length(); i++){
            char ch = name.charAt(i);
            if(ch == 'a'|| ch== 'e' || ch== 'i' || ch== 'o'|| ch== 'u'){
                vowelcount++;
            }
            else{
                consonentcount++;
            }
        }
        System.out.println("number of vowel are " +vowelcount);
        System.out.println("number of consonant are " +consonentcount);

    }
}
