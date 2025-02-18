package Ex08_String_prog;

public class SmallandLargestString {

    public static void main(String[] args) {
        String str= "vision without action is day dream";
        String[] wordArr= str.split(" ");
        String small = wordArr[0];
        String large = wordArr[0];
        for(int i=1; i< wordArr.length; i++) {
            if (wordArr[i].length() > large.length()) {
                large = wordArr[i];
            } else if (wordArr[i].length() < small.length()) {
                small = wordArr[i];
            }
        }
        System.out.println("the smallest = " + small);
        System.out.println("the largest = " + large);
    }
//    public static void main(String[] args) {
//        String str= "vision without action is day dream";
//        String[] wordArr= str.split(" ");
//        for(int i=0; i< wordArr.length; i++) {
//            for (int j = i + 1; j < wordArr.length; j++) {
//                if (wordArr[i].length() > wordArr[j].length()) {
//                    String tempStr;
//                    tempStr = wordArr[i];
//                    wordArr[i] = wordArr[j];
//                    wordArr[j] = tempStr;
//                }
//            }
//        }
//        for(int i = 0; i< wordArr.length;i++) {
//            System.out.println(wordArr[i]);
//        }
//        System.out.println("the smallest = " + wordArr[0]);
//        System.out.println("the largest = " + wordArr[wordArr.length - 1]);
//    }
}


