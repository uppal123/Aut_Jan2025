package April_Program_practice;

public class SearchLastAndFirstElement {
    public static void main(String[] args) {
        int[] num = {2,4,6,7,10}; //10
        for (int i = num.length-1; i >0 ; i--) {
            System.out.println(num[i]);
            break;
        }
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
            break;
        }

    }
}
