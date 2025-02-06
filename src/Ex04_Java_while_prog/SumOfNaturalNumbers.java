package Ex04_Java_while_prog;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of first 10 natural numbers are: ");
        int n= 0;
        int sum=0;
        while(n<=10){
            sum= sum+n;
            n++;
        }
        System.out.println(sum);
    }
}
