package EX05_if_else;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Day number:");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Thank god its Friday!");
                break;
            case 6:
                System.out.println("Yee its Saturday!");
                break;
            case 7:
                System.out.println("Today is Sunday!");
                break;
            default:
                System.out.println("Enter number if looking for weekdays");
        }
    }
}
