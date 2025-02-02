package Ex03_Java_Prog;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum=0;
        int digit=0;
        //153= 1x1x1 + 5x5x5 + 3x3x3 = 153
        char[] ch = Integer.toString(num).toCharArray();

        int n= ch.length;
        for(int i =0; i<ch.length; i++){
            int k = Character.getNumericValue(ch[i]); //converts character into integer

            digit= (int) Math.pow(k, n);
            sum = sum + digit;
        }
        if (sum == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    }

