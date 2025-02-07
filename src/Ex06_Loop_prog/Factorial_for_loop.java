package Ex06_Loop_prog;

import java.util.Scanner;

public class Factorial_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int result = 1;
        int oldnum= num;
        for(int i= 1; i<=oldnum; i++){
            result= result*num;
            num--;
        }
        System.out.println("Factorial of number is: " +result);
    }
}
