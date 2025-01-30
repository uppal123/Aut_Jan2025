package Ex_02_Java_Prog_Practice;

import java.util.Scanner;

public class LargestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }
        else if(num1 == num2 && num1>num3 && num2>num3){
            System.out.println("First two numbers are equal and both are largest");
        }
        else if(num2 == num3 && num2>num1 && num3>num1){
            System.out.println("Second and Third numbers are equal and both are largest");
        }
        else if(num1 == num3 && num1>num2 && num3>num2){
            System.out.println("First and Third numbers are equal and both are largest");
        }
        else if(num1>=num2 && num1>=num3){
            System.out.println("1st number is Largest");
        }
        else if (num2>=num3){
            System.out.println("2nd number is Largest");
        }
        else{
            System.out.println("3rd number is Largest");
        }
    }
}
