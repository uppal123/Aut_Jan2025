package April_Program_practice;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153; //1x1x1+5x5x5+3x3x3 = 153
        int oldnum = num;
        int length = String.valueOf(num).length();
        int result = 0;
        while(num > 0){
            int k = num%10; // 3
            result = (int) (result + Math.pow(k,length));
            num= num/10;
        }
        if(oldnum == result) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("not Armstrong");
        }
    }
}
