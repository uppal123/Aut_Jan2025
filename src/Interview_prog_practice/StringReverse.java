package Interview_prog_practice;
//reverse and eleminate space
public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello world";
        String[] arr = str.split(" ");
        String reverse = "";
        for (int i = 0; i < arr.length; i++) {
            String element = arr[i];
            for (int j = element.length()-1; j >=0 ; j--) {
                reverse = reverse + element.charAt(j);
            }
        }
        System.out.println(reverse);
    }
}
