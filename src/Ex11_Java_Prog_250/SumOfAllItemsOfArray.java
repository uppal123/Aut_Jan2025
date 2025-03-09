package Ex11_Java_Prog_250;

public class SumOfAllItemsOfArray {
    public static void main(String[] args) {
    int[] a = {23, 34, 19, 89, 2};
    int sum = 0;
    for(int i= 0; i< a.length; i++){
        sum = sum + a[i];
    }
        System.out.println(sum);
    }
}
