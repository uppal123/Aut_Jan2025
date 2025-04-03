package Ex08_String_prog;

public class ReverseChar {
    public static void main(String[] args) {
    char[] ch= {'a','b','c','d'};
    int left= 0;
    char temp;
    int right= ch.length-1;
    while(left<right){
        temp = ch[right];
        ch[right] = ch[left];
        ch[left]= temp;
        left++;
        right--;

    }
        System.out.println(new String(ch));
}
    }