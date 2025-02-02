package Ex03_Java_Prog;

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter consumed units: ");
        int unit= sc.nextInt();
        //First 100 units: 0.50Rs per unit
        // Next 100 units (101-200): 0.75Rs per unit
        //Next 100 units (201-300): 1.20Rs per unit
        //Above 300 units: 1.50Rs per unit
        if(unit>0 && unit<=100){
            double bill= unit* 0.50;
            System.out.println("Electricity bill is Rs." +bill);
        }
        else if(unit>100 && unit<=200){
            double bill= unit* 0.75;
            System.out.println("Electricity bill is Rs." +bill);
        }
        else if(unit>201 && unit<=300){
            double bill= unit* 1.20;
            System.out.println("Electricity bill is Rs." +bill);
        }
        else {
            double bill= unit* 1.50;
            System.out.println("Electricity bill is Rs." +bill);
        }
    }
}
