package Ex08_String_prog;

public class countSpecificWordInASentence {
    public static void main(String[] args) {
        String str = "Hello Java world hello";
        String lowercase = str.toLowerCase();
        String[] word = lowercase.split(" ");
//        for(String w : word)
//        System.out.println(w);
        int count = 0;
        for(int i = 0; i< word.length; i++){
            for(int j = i+1; j< word.length; j++){
                if(word[i].equals(word[j])){
                    count++;
                }
            }
        }
        for(String w : word)
            System.out.println("The word " + word + " appears " + count + " time(s) in the sentence.");
    }
}
