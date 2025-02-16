package Ex08_String_prog;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str= "Hello world! Welcome to Java";
        for(int i= 0; i<str.length(); i++){
            if(str.charAt(i)== ' '){
                continue;
            }
            System.out.print(str.charAt(i));
        }
//        str= str.replaceAll("\\s", "");
//        System.out.println(str);
    }
}
