package Ex00_Java_Prog_Practice;

public class UserInput_CLI {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        String name = args[0];
        String age = args[1];
        String salary = args[2];
       // int n = Integer.parseInt(name);
       int a = Integer.parseInt(age);
       int s = Integer.parseInt(salary);
        System.out.println("Name, age, salary are :" +name +" " +a+ " " +s);
    }
}
