package Ex_02_Java_Prog_Practice;
import java.util.Scanner;

public class CharacterIsAnAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);
        if (ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("Character is an Alphabet");
            }
        else{
            System.out.println("Character is NOT an Alphabet");
        }
    }
}
