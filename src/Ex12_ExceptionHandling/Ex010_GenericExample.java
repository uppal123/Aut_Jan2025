package Ex12_ExceptionHandling;

public class Ex010_GenericExample {
    public static void main(String[] args) {
        temp (23, 56); //temp is generic method, T can take any datatype.
        temp("Pooja", "Uppal");
        temp("Pooja", 123);
        temp(true, false);
    }

    public static <T>T temp (T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
