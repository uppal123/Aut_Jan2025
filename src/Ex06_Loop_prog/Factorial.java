package Ex06_Loop_prog;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int result= 1;
        while(num>0){
            result= result*num; //5
             num= num-1;//4
        }
        System.out.println("Factorial of number is: "+result);
    }
}
