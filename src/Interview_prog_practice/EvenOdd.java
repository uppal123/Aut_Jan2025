package Interview_prog_practice;

public class EvenOdd {
    public void verify (int n){
        System.out.println((n%2==0)? "even" : "odd");
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.verify(3);
    }
}
