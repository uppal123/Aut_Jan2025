package Ex04_Java_For_Prog;

public class MultiplicationTableOf5 {
    public static void main(String[] args) {
        System.out.println("multiplication table of 5: ");
        int n= 5;
        int m= n;
        for(int i=1;i<=10; i++){
            m= n*i;
            System.out.println("5 X " +i +" = " +m);
        }
    }
}
