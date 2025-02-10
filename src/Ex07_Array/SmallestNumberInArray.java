package Ex07_Array;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 1, 100, 3, 4, 32};

        int min= arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("Smallest number in array: "+min);
    }
}
