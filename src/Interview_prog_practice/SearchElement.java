package Interview_prog_practice;

public class SearchElement {
    public static void main(String[] args) {
        int[] num = {1, 3, 4, 2, 1, 4}; //search duplicate element
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.print(num[i]+" ");
                }
            }
        }
    }
}
