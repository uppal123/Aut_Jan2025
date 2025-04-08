package April_Program_practice;

public class SearchMissingElement {
    public static void main(String[] args) {
        int[] num = {1,2,3,5,6};

        int n = num[num.length - 1];
        int sum = (n * (n+1))/2;
        int calculatedSum = 0;
        for (int i = 0; i < num.length; i++) {
            calculatedSum = calculatedSum + num[i];
        }
        int missingNumber = sum - calculatedSum;
        System.out.println(missingNumber);
    }
}
