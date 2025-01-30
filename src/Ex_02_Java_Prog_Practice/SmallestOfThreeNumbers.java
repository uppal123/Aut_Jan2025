package Ex_02_Java_Prog_Practice;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
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
        else if(num1 == num2 && num1<num3 && num2<num3){
            System.out.println("First two numbers are equal and both are smallest");
        }
        else if(num2 == num3 && num2<num1 && num3<num1){
            System.out.println("Second and Third numbers are equal and both are smallest");
        }
        else if(num1 == num3 && num1<num2 && num3<num2){
            System.out.println("First and Third numbers are equal and both are smallest");
        }
        else if(num1<num2 && num1<num3){
            System.out.println("First number is smallest");
        }
        else if(num2<num3 && num2<num1){
            System.out.println("Second number is smallest");
        }
        else {
            System.out.println("Third number is smallest");
        }
    }
}
