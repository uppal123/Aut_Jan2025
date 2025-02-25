package Ex08_String_prog;

public class Find_occurance2 {
    public static void main(String[] args) {
        String str = "amazonaanazzz";
        char[] ch= str.toCharArray();
        int first = 0;
        int last = 0;
        for(int i= 0; i< ch.length; i++){
            if(ch[i] == 'a'){
                first = i;
                break;
            }
        }
        for(int i= ch.length-1; i>0; i--){
            if(ch[i]=='a'){
                last = i;
                break;
            }
        }
        System.out.println("first index- " +first +" last index- " +last);
    }
}
