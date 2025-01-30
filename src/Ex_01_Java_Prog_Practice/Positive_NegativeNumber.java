package Ex_01_Java_Prog_Practice;

import java.util.Scanner;

public class Positive_NegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        //input= int, o/p= string
        if(n>= 0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
