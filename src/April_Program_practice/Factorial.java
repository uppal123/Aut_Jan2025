package April_Program_practice;

public class Factorial {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        fact.test_Factorial(5);
    }

    public void test_Factorial (int num){
        int result = 1;
        while(num>0){
            result = result * num;
            num = num-1;
        }
        System.out.println(result);
    }
}
