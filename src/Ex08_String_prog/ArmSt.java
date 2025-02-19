package Ex08_String_prog;

public class ArmSt {
    public static void main(String[] args) {
        int num= 153;
        int oldnum= num;
        int length = String.valueOf(num).length();
                int result= 0;
                while(num>0){
                    int k = num%10;
                    result= (int) (result+ Math.pow(k,length));
                    num= num/10;
                }
        if(result==oldnum){
            System.out.println("Armstrong!");
        }
        else {
            System.out.println("Not Armstrong!");
        }
    }
}
