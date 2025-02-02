package Ex00_Java_Prog_Practice;

public class Duplicate_char {
    String str = "poojja";
    char[] ch = str.toCharArray();

    public void search(){
        for(int i= 0; i< str.length(); i++){
            for(int j= i+1; j<str.length(); j++){
                if(ch[i]== ch[j]){
                    System.out.println("Duplicate char is " + ch[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Duplicate_char dc = new Duplicate_char();
        dc.search();
    }
}
