import java.util.Scanner;

public class Armstring2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int oldnum = num;
        int sum = 0;
        int length= String.valueOf(num).length();
        while(num>0){
            int k = num%10;
            sum= (int) (sum+Math.pow(k,length));
           num=  num/10;
        }
        if(sum==oldnum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
