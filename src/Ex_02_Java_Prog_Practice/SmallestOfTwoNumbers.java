package Ex_02_Java_Prog_Practice;
import java.util.Scanner;

public class SmallestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("2nd Number is smallet");
        }
        else if(num1 == num2){
            System.out.println("Both numbers are equal");
        }
        else{
            System.out.println("1st number is smallest");
        }
    }
}
