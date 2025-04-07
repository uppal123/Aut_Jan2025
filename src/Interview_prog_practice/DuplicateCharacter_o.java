package Interview_prog_practice;

public class DuplicateCharacter_o {
    public static void main(String[] args) {
        String str = "Pooja";  //output-2
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='o'){
               count++;
            }
        }
        System.out.println("count of 'o'-> " +count);

    }
}
