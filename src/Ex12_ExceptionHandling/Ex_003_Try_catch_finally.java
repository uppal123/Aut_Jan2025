package Ex12_ExceptionHandling;

public class Ex_003_Try_catch_finally {
    public static void main(String[] args) {
        int a =0;
        int c = 0;
        try {
            c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always executed");
        }
        System.out.println(c);
    }
}
