package Ex12_ExceptionHandling;

public class Ex_001_ArithmaticException {
    public static void main(String[] args) {
        int b = 0;
        int c = 0; //ArithmeticException: / by zero
        try {
            c = 10/b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
