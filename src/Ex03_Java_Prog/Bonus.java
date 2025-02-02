package Ex03_Java_Prog;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter years of experience: ");
        int year= sc.nextInt();
        System.out.println("Enter your salary: ");
        int salary= sc.nextInt();

        // If years of experience is less than 1 year: No bonus.
        //If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
        //If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
        //If years of experience is greater than 6 years: Bonus is 15% of the salary.
        if(year<0 || salary<0 ){
            System.out.println("Invalid input!, year and salary must be positive");
        }
        else if(year<1){
            System.out.println("No bonus");
        }
        else if(year>=1 && year<=3){
            double bonus= (salary*5)/100.0;
            System.out.println("You will get bonus Rs."+bonus);
        }
        else if(year>=4 && year<=6){
            double bonus= (salary*10)/100.0;
            System.out.println("You will get bonus Rs."+bonus);
        }
        else {
            double bonus= (salary*15)/100.0;
            System.out.println("You will get bonus Rs."+bonus);
        }
    }
}
