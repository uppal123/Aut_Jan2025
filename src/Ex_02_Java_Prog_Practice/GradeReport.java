package Ex_02_Java_Prog_Practice;
import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int marks = sc.nextInt();
        //90 - 100 A+
        //80 - 89 A
        //70 - 79 B
        //60 - 69 C
        //50 - 59 D
        //40 - 49 E
        //Below 40 Fail
        if(marks>100  || marks == 0){
            System.out.println("Not in our criteria, enter a valid number");
        }

        else if(marks<=100 && marks>=90){
            System.out.println("Grade A+");
        }
        else if(marks<=89 && marks>=80){
            System.out.println("Grade A");
        }
        else if(marks<=79 && marks>=70){
            System.out.println("Grade B");
        }
        else if(marks<=69 && marks>=60){
            System.out.println("Grade C");
        }
        else if(marks<=59 && marks>=50){
            System.out.println("Grade D");
        }
        else if(marks<=49 && marks>=40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("FAIL");
        }
    }
}
