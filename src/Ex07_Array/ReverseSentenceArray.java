package Ex07_Array;

public class ReverseSentenceArray {
    public static void main(String[] args) {
        String str= "Pooja Uppal";
        String reverse="";
        String arr[]= str.split(" ");
        for(int i=0; i<= arr.length-1; i++){
            String ch= arr[i];
            for(int j= ch.length()-1; j>=0; j--){
                reverse= reverse+ ch.charAt(j);
            }
            reverse += " ";
        }
        System.out.println(reverse);
    }
}
