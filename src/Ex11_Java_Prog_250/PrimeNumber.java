package Ex11_Java_Prog_250;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
        for(int i= 2; i<= num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count<2){
            System.out.println("Its a Prime number");
        }
        else {
            System.out.println("Its not a Prime number");
        }
    }
}
