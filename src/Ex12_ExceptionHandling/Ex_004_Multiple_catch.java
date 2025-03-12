package Ex12_ExceptionHandling;

public class Ex_004_Multiple_catch {
    public static void main(String[] args) {
        int b = 0;
        try {
            String ip = args[0]; //.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); //.NumberFormatException
            b = 100/a;  //.ArithmeticException
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
