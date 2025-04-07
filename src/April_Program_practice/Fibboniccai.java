package April_Program_practice;

public class Fibboniccai {
    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        System.out.print(n0 +" " +n1); //0 1 1 2 3
        int n2;
        for (int i = 0; i < 8; i++) {
            n2 = n0+n1; //1
            n0 = n1; //
            n1= n2;
            System.out.print(" " + n2);
        }

    }
}
