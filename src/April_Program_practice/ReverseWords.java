package April_Program_practice;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] strarray = str.split(" ");
        String reverse = "";
        for (int i = 0; i < strarray.length; i++) { //2
            String element = strarray[i];  //hello, world
            for (int j = element.length()-1; j>=0; j--) { //hello
                reverse = reverse+ element.charAt(j);
            }
            reverse = reverse + " ";
        }
        System.out.println(reverse);
    }
}
