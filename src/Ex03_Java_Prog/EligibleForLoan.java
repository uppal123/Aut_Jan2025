package Ex03_Java_Prog;

import java.util.Scanner;

public class EligibleForLoan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();

        System.out.println("Enter your Salary: ");
        double salary= sc.nextDouble();

        System.out.println("Enter your credit score: ");
        int cs = sc.nextInt();

        if(age<18 || salary<=0 || cs<=0){
            System.out.println("Not eligible for loan");
        }
        else if(age>18 && age<=80 && salary>= 30000 && salary>=200000 && cs>=600 && cs<= 850){
            System.out.println("Congrats! you are eligible for Loan.");
        }
        else{
            System.out.println("Not eligible for loan");
        }
    }
}
