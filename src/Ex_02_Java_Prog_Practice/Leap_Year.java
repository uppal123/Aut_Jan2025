package Ex_02_Java_Prog_Practice;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();

        if(year%400==0 && year%4==0){
            System.out.println("Leap Year!");
        }
        else if(year%100 == 0){
            System.out.println("Not a Leap year");
        }
        else if(year%4==0){
            System.out.println("Leap Year!");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
