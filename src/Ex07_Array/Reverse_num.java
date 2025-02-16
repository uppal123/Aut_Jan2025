package Ex07_Array;

public class Reverse_num {
    public static void main(String[] args) {
        int num= 153;
        int rem = 0;
        int newnum=0;
        while(num>0){
            rem= num%10; //153%10= 3
            num= num/10; //15
            newnum= newnum*10+rem; //0*10+3
        }
        System.out.println(newnum);
    }
}