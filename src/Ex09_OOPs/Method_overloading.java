package Ex09_OOPs;

public class Method_overloading {
    public static void main(String[] args) {
        Operations o = new Operations();
        int r = o.sum(2, 3);
        System.out.println(r);

        double s = o.sum(3.4, 7.8);
        System.out.println(s);

        int t = o.sum(4, 5, 6);
        System.out.println(t);
    }
}
class Operations {
    int sum (int a, int b) {
        return a+b;
    }

    double sum (double a, double b) {
        return a+b;
    }

    int sum (int a, int b, int c){
        return a+b+c;
    }
}
