import java.util.ArrayList;

/// [1,3,0,0,88,90,78, 0, 0]
public class ArraySum {

    //int[] a = new int[10];
//
  // ArrayList<Integer> arr = new ArrayList<Integer>();

    public int numberOfZeros(int [] numberArr) {
        int count = 0;
        for (int i= 0; i< numberArr.length; i++){
            System.out.println(numberArr[i]);
            if (numberArr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    private int[] plusOneArrayElements(int[] arr){
        for(int i = 0; i< arr.length; i++){
           arr[i] = arr[i] + 1;
            //System.out.print(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArraySum sumObj = new ArraySum();
        int[] number = {1,3,0,0,88,90,78, 0, 0, 0};
        //int result = sumObj.numberOfZeros(number);
//        System.out.println("count of zeroes = " + result);
        int[] result2 = sumObj.plusOneArrayElements(number);
        for (int k: result2) {
            System.out.println("plus One Array Elements " + k);
        }
    }
}


//int[] arr1566 = {7,56,8,0,98};
//int[] wwww = arr1566;
//
//int[] attttt = new int[10];
//attttt[]