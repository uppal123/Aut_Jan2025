package Interview_prog_practice;

public class ElementCount {
    public static void main(String[] args) {
        // aabbbccabcccccc = a2b3c2a1b1c6
        String str = "aabbbccabcccccc";
        char [] strArr = str.toCharArray();
        StringBuilder finalString = new StringBuilder();
        int count = 1;
        char ch = 0;
        for (int i = 0; i< strArr.length; i++) {
            if (i == 0) {
                finalString.append(strArr[i]);
                ch = strArr[i];
                continue;
            }
            if (ch == strArr[i]) {
                count += 1;
            } else {
                finalString.append(count);
                count = 1;
                ch = strArr[i];
                finalString.append(strArr[i]);
            }
            if (i == strArr.length -1) {
                finalString.append(count);
            }
        }
        System.out.println(finalString);

    }
}
