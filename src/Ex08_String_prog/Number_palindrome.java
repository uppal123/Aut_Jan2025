package Ex08_String_prog;

public class Number_palindrome {
    public static void main(String[] args) {
        int num = 123241;
        int rev = 0;
        int oldnum= num;
        while(num>0){
            int k = num%10;
            rev= rev*10 +k;
            num= num/10;
        }
        if(rev== oldnum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
