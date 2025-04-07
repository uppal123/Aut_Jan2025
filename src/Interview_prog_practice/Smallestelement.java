package Interview_prog_practice;

public class Smallestelement {
    public static void main(String[] args) {
        //Pooja //P

        int[] num = {67,6,7,4,9,2};
        int smallest =num[0];
        int index = 0;
        for (int i = 1; i < num.length; i++) {
            if(smallest > num[i]){
                smallest = num[i];
                index = i;
            }
        }
        System.out.println(smallest);
        System.out.println(index);
    }
}
