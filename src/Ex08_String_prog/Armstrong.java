package Ex08_String_prog;

public class Armstrong {
    public static void main(String[] args) {
        int num= 372;
        int result=0;
        int oldnum= num;
        int length= String.valueOf(num).length();
        while(num>0){
            //3^3+7^3+0= 370
            int k= num%10;
            result= (int) (result+Math.pow(k,length));
            num= num/10;
        }
        if(result== oldnum){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
