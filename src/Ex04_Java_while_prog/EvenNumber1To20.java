package Ex04_Java_while_prog;

public class EvenNumber1To20 {
    public static void main(String[] args) {
        System.out.println("Even number from 1 to 20 are: ");
        int n = 0;
        while (n <= 20) {
            if(n % 2 == 0)
            System.out.print(" " +n);
            n++;
        }
    }

}
