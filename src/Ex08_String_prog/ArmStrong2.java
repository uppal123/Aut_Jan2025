package Ex08_String_prog;

public class ArmStrong2 {
    public static void main(String[] args) {
        int num= 1923;
        int oldnum= num;
        int sum= 0;
        int length= String.valueOf(num).length();
        while(num>0){
            int k= num%10;
            sum= (int) (sum+Math.pow(k,length));
            num=num/10;
        }
        if(sum==oldnum){
            System.out.println("Armstrong!");
        }
        else{
            System.out.println("Not Armstrong!");
        }
    }
}
