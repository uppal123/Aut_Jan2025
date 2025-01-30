package Ex_02_Java_Prog_Practice;

import java.util.Scanner;

public class ATM_Withdraw {
    public static void main(String[] args) {
        double amount = 10000.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        int withdraw = sc.nextInt();

        if (withdraw <= 0) {
            System.out.println("Invalid amount, enter a value greater than zero");
        }
        else if(withdraw>amount){
            System.out.println("Insufficient balance, your balance is Rs" +amount);
            //System.out.println("Balance amount is " + (amount-withdraw));
        }
        else if (withdraw % 100 != 0) {
            System.out.println("Withdrawal amount must be a multiple of ₹100.");
        }
        else if (withdraw < amount) {
            System.out.println("Successful! Please collect the amount Rs" + withdraw);
            System.out.println("Your Balance amount is Rs" + (amount-withdraw));
        }
        else {
            System.out.println("Enter valid amount");
        }
    }
}
