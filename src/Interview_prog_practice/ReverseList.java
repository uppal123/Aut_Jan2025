package Interview_prog_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> blank = new ArrayList<>();
        for (int i = num.size()-1; i >= 0; i--) {
            blank.add(num.get(i));
        }
        System.out.println(blank);
    }
}
