package Ex12_ExceptionHandling;

public class Ex_005_MultipleCatch_otherway {
    public static void main(String[] args) {
    int b = 0;
        try {
        String ip = args[0]; //.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); //.NumberFormatException
        b = 100/a; //.ArithmeticException
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
        System.out.println(b);
}
}
