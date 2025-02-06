package EX05_if_else;

import java.util.Scanner;

public class NumberIsDivisibleBy5and11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

            if(n%5==0 && n%11==0){
                System.out.println("Number is divisible by 5 and 11 both");
            }
            else {
                System.out.println("Enter a multiple of 5 and 11");
            }
        }
    }

