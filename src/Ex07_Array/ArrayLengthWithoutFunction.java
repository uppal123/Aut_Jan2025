package Ex07_Array;

public class ArrayLengthWithoutFunction {
    public static void main(String[] args) {
        ArrayLengthWithoutFunction obj = new ArrayLengthWithoutFunction();
        System.out.println(obj.getLengthOfArrayWithoutUsingLibraryFunction());
    }

    public int getLengthOfArrayWithoutUsingLibraryFunction() {
        int[] arr = {23, 45, 56, 22, 100, 13};
        int i = 0;
        for (int it : arr)
            i++;
        return i;
    }
}
