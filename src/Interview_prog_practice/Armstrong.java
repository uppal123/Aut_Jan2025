package Interview_prog_practice;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int result = 0;
        int originalnum = num;
        int length = String.valueOf(num).length();
        while(num>0){
            int k = num%10;
            result = (int) (result+Math.pow(k,length));
            num = num/10;
        }
        if (result==originalnum){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
