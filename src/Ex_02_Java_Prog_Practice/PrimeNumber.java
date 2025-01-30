package Ex_02_Java_Prog_Practice;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }
        if (count < 2) {
            System.out.println("number is Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}

