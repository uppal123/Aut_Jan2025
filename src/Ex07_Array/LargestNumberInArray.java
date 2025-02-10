package Ex07_Array;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 1, 100, 3, 4, 32};
        int max=arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max number is: "+max);
    }

}
