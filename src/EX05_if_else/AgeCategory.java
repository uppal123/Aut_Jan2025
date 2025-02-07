package EX05_if_else;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age:");
        int age = sc.nextInt();
        if(age>=0 && age<=12){
            System.out.println("You are in a child category");
        }
        else if(age>=13 && age<=19){
            System.out.println("You are in a Teenager category");
        }
        else if(age>=20 && age<=64){
            System.out.println("You are in a Adult category");
        }
        else if(age>=65){
            System.out.println("You are in a Senior Citizen category");
        }
        else{
            System.out.println("Invalid age!, enter correct input");
        }
    }
}
