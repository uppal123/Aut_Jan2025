public class Grade_Calculator {
    public static void main(String[] args) {
        //Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F) based on
        // the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        int n= 60;
//        String grade = args[0];
//        int num= Integer.parseInt(grade);
        String g = (n>=90)?"grade A" : (n>=80)? "grade B" : (n>=70)? "grade C" : (n<60)? "grade F": "grade D";
        //System.out.println(num);
        System.out.println(g);
    }
}
