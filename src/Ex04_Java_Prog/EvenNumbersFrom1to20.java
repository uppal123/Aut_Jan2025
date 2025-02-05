package Ex04_Java_Prog;

public class EvenNumbersFrom1to20 {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 20: ");
        for(int i=0; i<=20; i++){
            if(i%2==0){
                System.out.print(i +" ");
            }
        }
    }
}
