package Ex04_Java_Prog;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println("sum of first 10 natural numbers: ");
        int sum= 0;
        for(int i= 1; i<=10; i++ ){
            sum+=i;
        }
        System.out.println(sum);
    }
}
