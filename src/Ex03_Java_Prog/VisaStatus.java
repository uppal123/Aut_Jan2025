package Ex03_Java_Prog;

import java.util.Scanner;

public class VisaStatus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        if(age<0){
            System.out.println("Enter correct age");
            sc.close();
        }
        else if(age<18){
            System.out.println("Age is minor, the person can not travel.");
            sc.close();
        }

        System.out.print("Enter visa status (valid/invalid): ");
        String visaStatus = sc.next();
        boolean isVisaValid = visaStatus.equals("valid");

        if(age>=18 && isVisaValid){
            System.out.println("You are eligible to travel");
        }
        else {
            System.out.println("As your visa is invalid, you can not travel");
        }
    }
}
