package April_Program_practice;

public class SecondLargest {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 1, 8, 3};
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length - 1; j++) {
                if (num[i] < num[j]) {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
        System.out.println("second largest number: " +num[1]);
    }
}