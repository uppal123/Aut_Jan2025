package Ex06_Loop_prog;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int count=0;
        int n=2;
        while(n<=num){
            if(num%n==0){
                count++;
            }
            n++;
        }
        if(count<2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("not Prime");
        }
    }
}
