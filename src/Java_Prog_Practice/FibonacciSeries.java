package Java_Prog_Practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n0 +" " + n1);

        for(int i = 2; i< num; i++){
            n2 = n0 + n1; //0 1 1 2 3
            n0= n1;
            n1= n2;
            System.out.print(" " + n2);
        }
    }
}
