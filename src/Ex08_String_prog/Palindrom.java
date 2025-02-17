package Ex08_String_prog;

public class Palindrom {
    public static void main(String[] args) {
       String str= "kalak";
       String reverse = "";
       for(int i= str.length()-1; i>=0; i--){
       reverse= reverse + str.charAt(i);
           System.out.println(reverse);
       }
        if(reverse.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
