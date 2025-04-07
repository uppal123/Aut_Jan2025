package April_Program_practice;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "hello World";
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(ch[i]== ' ') {
                continue;
            }
            System.out.print(ch[i]);
        }
    }
}
