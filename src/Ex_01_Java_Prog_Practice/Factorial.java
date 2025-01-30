package Ex_01_Java_Prog_Practice;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int oldNumber = num;
        int result = 1;

        while(num > 0){
            result= result * num;
            num = num - 1;
        }
        System.out.println("Factorial of " +oldNumber + " is : " +result);
    }
}
