package Interview_prog_practice;

public class BinarySearch {
    public static void main(String[] args) {
        // first condition is that it must be sorted.
        int[] arrayList = { 3, 4, 5, 6, 7, 8, 9, 14, 17, 19, 23, 28, 29 };
        BinarySearch newObj = new BinarySearch();
        int tofind = 3;
        int result = newObj.binarySearch(arrayList, tofind);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element " + tofind + " found at = " + result);
        }
    }

    public int binarySearch(int numArr[], int numToFind) {
        int low = 0;
        int high = numArr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (numArr[mid] == numToFind) {
                return mid;
            }

            if (numToFind > numArr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }
}
