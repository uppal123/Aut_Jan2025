package Interview_prog_practice;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "PoojaakP";

        int temp;
        for (int i = 0; i < str.length(); i++) {
            temp = 0;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    temp += 1;
                    //System.out.println(str.charAt(i));
                    continue;
                }
            }
            if (temp == 0) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
