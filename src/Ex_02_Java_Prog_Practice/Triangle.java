package Ex_02_Java_Prog_Practice;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd side");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd side");
        int num3 = sc.nextInt();

        if(num1 == num2 && num1 == num3){
            System.out.println("Equilateral Triangle");
        }
        else if (num1 == num2 || num2 == num3 || num3 == num1){
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Acute Triangle");
        }
    }
}
