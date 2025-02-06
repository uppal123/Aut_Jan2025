package Ex04_Java_while_prog;

public class multiplicationTableOf7 {
    public static void main(String[] args) {
        System.out.println("multiplication table of 7: ");
        int n=7;
        int m=n;
        int i= 1;
        while(i<=10){
            m=n*i;
            System.out.println("7 X " +i +" = " +m);
            i++;
        }

    }
}
