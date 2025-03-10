package Ex11_Java_Prog_250;
import java.util.Arrays;

public class SecondLargestNumberwithSort {
    public static void main(String[] args) {
        int[] a = {23, 24, 10, 100, 45, 9, 99};
        Arrays.sort(a);
        int largest = a[a.length-1];
        int Secondlargest = a[0];
        for (int i = a.length-2; i >0 ; i--) {
            if(largest > a[i]){
                Secondlargest = a[i];
                break;
            }
        }
        System.out.println(Secondlargest);
    }
}
