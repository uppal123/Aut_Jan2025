package EX05_if_else;

import java.util.Scanner;

public class Convert_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of days:");
        int days = sc.nextInt();
        //Assume 1 year = 365 days.
        //Assume 1 month = 30 days
        //Convert the Days into Years, Month and days and Print it.
        //if you input 1000 days, the output of the program would be:
        // 2 years, 9 months, and 0 day
        int year= 0;
        int month = 0;
        int leftdays=0;
       if(days>=365){
           year= days/365; //400/365= 1
           System.out.println("no. of years are: " +year);
           days= days%365; //400%30= 35
           month= days/30; //35/30=1
           System.out.println("no. of months are: " +month);
           leftdays= days%30;//35%30=5
           System.out.println("no. of days are: " +leftdays);
       }
       else if(days<365 && days>=30){
           month= days/30;
           System.out.println("no. of months are: " +month);
           leftdays= days%30;
           System.out.println("no. of days are: " +leftdays);
       }
       else if(days<=0){
           System.out.println("Invalid input or zero days.");
       }
       else{
           System.out.println("no. of days are: " +days);
       }

    }
}
