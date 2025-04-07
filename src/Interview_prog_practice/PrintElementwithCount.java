package Interview_prog_practice;

public class PrintElementwithCount {
    public static void main(String[] args) {
        String str = "aabbcccaa";
        StringBuilder finalStr = new StringBuilder();
        char[] charArray = str.toCharArray();
        char ch = 0;
        int count = 1;
        for (int i = 0; i < charArray.length; i++) {
            if(i==0){
                finalStr.append(charArray[i]);
                ch =charArray[i];
                continue;
            }
            if(charArray[i]==ch){
                count++;
            }
            else{
                finalStr.append(count);
                count = 1;
                ch = charArray[i];
                finalStr.append(charArray[i]);
            }
            if(i== charArray.length-1){
                finalStr.append(count);
            }
        }
        System.out.println(finalStr);
    }
}
