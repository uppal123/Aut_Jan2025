package ABC;

public class B {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        System.out.println(a.i +" " +b.i);
        a.i = 10;
        System.out.println(a.i + " " +b.i);
        b.i = 20;
        System.out.println(a.i + " " +b.i);

    }
}
