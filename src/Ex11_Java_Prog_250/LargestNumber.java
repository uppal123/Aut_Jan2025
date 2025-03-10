package Ex11_Java_Prog_250;

public class LargestNumber {
    public static void main(String[] args) {
        int[] a = {23, 24, 10, 100, 45};
        int max = a[0];
        for(int i= 1; i<a.length; i++){
            if(max<a[i]){
                max = a[i];
            }
//            else if(secondmax >a[i] && a[i]!= max){
//                secondmax = a[i];
//            }
        }
        System.out.println("largest number: " +max);
    }
}
