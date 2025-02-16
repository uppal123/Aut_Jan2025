package Ex07_Array;

public class Dup_String {
    public static void main(String[] args) {
        String str= "Poojja";
        char[] ch= str.toCharArray();
        for(int i= 0; i<=str.length()-1; i++){
            for(int j= i+1; j<=str.length()-1; j++){
                if(ch[i]==ch[j]){
                    System.out.println("duplicate char is: "+ ch[j]);
                }
            }
        }
        }
    }

