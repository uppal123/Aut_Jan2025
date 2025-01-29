package Java_Prog_Practice;
import java.util.Scanner;

public class Max2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int n = sc.nextInt();
        System.out.println("Enter 2nd number :");
        int n1= sc.nextInt();

        if(n==n1){
            System.out.println("Both numbers are equal");
        }
        else if (n>n1){
            System.out.println(+n +" is maximum");
        }
        else {
            System.out.println(+n1 + " is maximum");
        }
    }
}
