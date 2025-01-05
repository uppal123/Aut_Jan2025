import java.sql.SQLOutput;

public class Swap_number {

    int a= 10;
    int b= 20;
    int c;

    // return if k is greater than l without using if
    public boolean checkGreaterNumber(int k, int l) {
        ///  condition is k + l should be greater than 50
        return (k+l) > 50 ? true: false;
    }

    public void swap(){
        System.out.println("number before swap: " +a +" " +b);
        c = b; //20
        b = a; //10
        a = c;
        System.out.println("number after swap: " +a +" " +b);
    }

    public void swapWithoutThirdVariable() {
        a = a * b; // 200
        b = a / b; // 10
        a = a / b;
        System.out.println("number after swap without 3rd variable: " +a +" " +b);

    }

    public static void main(String[] args) {
        Swap_number s = new Swap_number();
        //s.swap();
        //s.swapWithoutThirdVariable();
        boolean result = s.checkGreaterNumber(s.a, s.b);
        System.out.println(result);
    }
}
