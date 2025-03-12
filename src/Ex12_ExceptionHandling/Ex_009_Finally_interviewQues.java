package Ex12_ExceptionHandling;

public class Ex_009_Finally_interviewQues {
    public static void main(String[] args) {
        int a= 0;
        try {
            a = 10/10;
            System.out.println(a);
            //System.exit(0); //can only stop execution of finally block
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("hello last");
        }

    }
}
