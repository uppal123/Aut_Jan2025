package Ex06_Loop_prog;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int oldnum= num;
        int i=1;
        while(i<=10){
            oldnum= num*i;
            System.out.println(num +"x" +i +" = " +oldnum);
            i++;
        }
    }
}
