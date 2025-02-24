package Ex07_Array;

public class SortArray2 {
    public static void main(String[] args) {
        int[] n = {12, 34, 10, 1, 100, 3, 4, 32};
        for (int i = 0; i <= n.length - 1; i++) {
            for (int j = 0; j <= n.length - 1; j++) {
                if (n[j] > n[i]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        for (int num : n) {
            System.out.print(num + " ");

        }
    }
}