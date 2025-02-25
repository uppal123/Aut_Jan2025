package Ex08_String_prog;

//amazonaanazzz -first and last occurrance of letter a in string with index number.
public class FindOccurance {
    public static void main(String[] args) {
        int first = -1;
        int last = 0;
        String txtStr = "amazonaanazzz"; //"agggggdysy";//
        char chArr[] = txtStr.toCharArray();

        for (int i = 0; i< chArr.length; i++) {
            if (first == -1) {
                if (chArr[i] == 'a') {
                    first = i;
                }
            }
            if (chArr[i] == 'a') {
                last = i;
            }
        }
        System.out.println("first index = " + first + " last index = "+ last);
    }
}
