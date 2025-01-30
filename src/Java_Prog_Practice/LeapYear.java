package Java_Prog_Practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check if its leap year or not : ");
        int year = sc.nextInt();
        if(year % 400==0 ){
            System.out.println("Its a Leap Year!");
        }
        else if (year % 100 == 0){
            System.out.println("Its not a Leap Year!");
        }
        else if (year % 4 == 0){
            System.out.println("Its a Leap Year!");
        }
        else{
            System.out.println("Its not a Leap Year!");
        }
    }
}
