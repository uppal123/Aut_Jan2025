package Ex08_String_prog;

public class WordCountwithoutSpace {
    public static void main(String[] args) {
        String str= " Hi, this is        Pooja";
        int count=0;

        for(int i= 0; i<= str.length()-1; i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
                count += 1;
                //continue;
            }
        }
        System.out.println(count);

        //split method
        String[] arr= str.trim().split("\\s+");
        System.out.println("word count: "+arr.length);
    }
}
