package Ex06_Loop_prog;

public class SumOfNumber {
    public static void main(String[] args) {
        int sum= 0;
        for(int i=1; i<=100; i++){
            sum= sum+i;
        }
        System.out.println("sum of 1 to 100 number: "+sum);
    }
}
