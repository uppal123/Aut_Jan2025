package Ex00_Java_Prog_Practice;

import java.util.Scanner;

public class EvenOddCheck {
    public String evenOrOdd(int number){
//       if (number % 2 == 0) {
//           return "even";
//       } else {
//           return "odd";
//       }
        return (number % 2 == 0) ? "even": "odd";

    }

    /*
    condition ? true case : false case
     */

    public static void main(String[] args) {
        EvenOddCheck e = new EvenOddCheck();
        String result = e.evenOrOdd(98);
        System.out.println(result);
    }

    public static class Grade_Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter score: ");
            int n= sc.nextInt();
           // int n= 60;
    //        String grade = args[0];
    //        int num= Integer.parseInt(grade);
            String g = (n>=90)?"grade A" : (n>=80)? "grade B" : (n>=70)? "grade C" : (n>=60)? "grade D": "grade F";
            System.out.println(g);
        }
    }
}
