public class LargestNumber {
    public static void main(String[] args) {
        int a=10;
        int b = 250;
        int c= 67;
                //a>b= 10>25= false
                //a>c= 10>67= false
                //b>c= 25>67= false
        String largestnumber =   ( a > b && a > c) ? "a is largest" : (b>c) ? "b is largest" : "c is largest";
        System.out.println(largestnumber);

    }
}
