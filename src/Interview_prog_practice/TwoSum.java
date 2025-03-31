package Interview_prog_practice;

import java.util.HashMap;
import java.util.Map;

///  [-2, 2,7,11,15] target = 9
/// output= (-2, 11) ,(2,7) | (0,3),(1,2)
public class TwoSum {
    int[] num = {-2,2,7,11,15};
    public void sumOfTwoNumberByLoop() {
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (num[i] + num[j] == 9) {
                    System.out.println(num[i] + "+" + num[j]);
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }

    public void sumOfTwoNumberByMap() {
        Map <Integer, Integer> map = new HashMap<>();
//        if((map[0] + map[1] = 9)){

        }



    }


    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        obj.sumOfTwoNumberByLoop();
        obj.sumOfTwoNumberByMap();


    }
}

