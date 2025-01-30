package Java_Prog_Practice;
import java.math.BigInteger;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
       //num= 123, o/p= 321
        //c= 123/10= 3, 12/10= 2, 1

        int rem= 0;
        int newNumber = 0;
        while (number > 0) {
            rem = number % 10;
            number = number / 10;
            newNumber = newNumber * 10 + rem;
        }
        System.out.println(newNumber);
    }
}
