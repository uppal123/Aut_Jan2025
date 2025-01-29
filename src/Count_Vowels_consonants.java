import java.sql.SQLOutput;
import java.util.Scanner;

public class Count_Vowels_consonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String name = sc.next();
        int vowelcount= 0;
        int consonantcount = 0;

        for(int i= 0; i<name.length(); i++){
           char ch = name.charAt(i);
           if(ch=='a' || ch=='i' || ch=='o' || ch=='e' || ch=='u')
            {
                vowelcount++;
           }
           else
           {
               consonantcount++;
           }
        }
        System.out.println("count of vowel is " +vowelcount);
        System.out.println("count of consonant is " +consonantcount);
    }
}
