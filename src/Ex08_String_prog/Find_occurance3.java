package Ex08_String_prog;

public class Find_occurance3 {
    public static void main(String[] args) {
        String str = "amazonaanazzz";
        char[] ch= str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='a'){
                System.out.println("index no. of 'a': " +i);
            }
        }
    }
}
