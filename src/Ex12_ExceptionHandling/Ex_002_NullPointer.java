package Ex12_ExceptionHandling;

public class Ex_002_NullPointer {
    public static void main(String[] args) {
        System.out.println("Start!");
        String c = null; //NullPointerException: Cannot invoke "String.trim()"
        try {
            c.trim();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End!");
    }
}
