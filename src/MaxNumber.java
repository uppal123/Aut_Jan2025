public class MaxNumber {

    public static void main(String[] args) {
        String num = args[0];
        String num1 = args[1];
        int n = Integer.parseInt(num);
        int n1 = Integer.parseInt(num1);
        int maxnumber= (n>n1)? n : n1;
        System.out.println("maximum number " +maxnumber);

    }
}
