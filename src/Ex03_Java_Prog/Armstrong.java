package Ex03_Java_Prog;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int initialInput = number;
        int result= 0;
        int numlength = String.valueOf(number).length();

        while(number>0){
            int n= number%10;
            result = (int) (result + Math.pow(n,numlength));
            number=number/10;
        }
        if(result == initialInput){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}


