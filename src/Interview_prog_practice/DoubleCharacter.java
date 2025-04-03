package Interview_prog_practice;

public class DoubleCharacter {
    public static void main(String[] args) {
        String str = "abcd"; //aabbccdd //0= 0+0 = aa
      StringBuilder sb = new StringBuilder();
      char[] ch = str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            sb.append(ch[i]).append(ch[i]);
        }
       System.out.println(sb);

    }
}
