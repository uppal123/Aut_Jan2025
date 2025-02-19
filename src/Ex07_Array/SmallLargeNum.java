package Ex07_Array;

public class SmallLargeNum {
    public static void main(String[] args) {
        int[] arr = {23, 45, 56, 22, 100, 13};
        int smallno = arr[0];
        int largeno = arr[0];
        for(int i= 1; i< arr.length; i++){
            if(smallno > arr[i]){
                smallno = arr[i];
            }
            else if (largeno < arr[i]){
                largeno = arr[i];
            }
        }
        System.out.println(smallno);
        System.out.println(largeno);
    }
}

