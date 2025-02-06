package EX05_if_else;

import java.util.Scanner;

public class Convert_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of days: ");
        int day = sc.nextInt();
        //Assume 1 year = 365 days.
        //Assume 1 month = 30 days
        //Convert the Days into Years, Month and days and Print it.
        //if you input 1000 days, the output of the program would be:
        // 2 years, 9 months, and 0 day
        int year= 0;
        int month = 0;
        int leftdays=0;
       if(day>=365){
           year= day/365; //400/365= 1
           System.out.println("no. of years are: " +year);
           day= day%365; //400%30= 35
           month= day/30; //35/30=1
           System.out.println("no. of months are: " +month);
           leftdays= day%30;//35%30=5
           System.out.println("no. of days are: " +leftdays);
       }
       else if(day<365 && day>=30){
           month= day/30;
           System.out.println("no. of months are: " +month);
           leftdays= day%30;
           System.out.println("no. of days are: " +leftdays);
       }
       else if(day<30){
           System.out.println("no. of days are: " +day);
       }

    }
}
