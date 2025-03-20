package Interview_prog_practice;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int result = 1;
        while (num>0){
            result = result * num;
           num =  num-1;
        }
        System.out.println(result);
    }
}
