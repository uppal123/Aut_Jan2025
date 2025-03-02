package Ex07_Array;

public class ReverseString {
    public static void main(String[] args) {
        String sentence= "Hi this is Pooja";
//        StringBuilder sb = new StringBuilder(sent);
//        System.out.println(sb.reverse().toString());
        String resultString = new String();
        String arr[]= sentence.split(" ");
        for(int i= 0; i<= arr.length-1; i++){
            String reverse= "";
            String indexStr = arr[i];
            for(int j= indexStr.length()-1; j >= 0; j-- ){
                 reverse = reverse + indexStr.charAt(j);
            }
            resultString += reverse;
            if (i != arr.length - 1) {
                resultString += " ";
            }
        }
        System.out.println(resultString);
    }
}
