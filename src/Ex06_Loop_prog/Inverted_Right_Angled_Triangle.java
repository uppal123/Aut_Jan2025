package Ex06_Loop_prog;

public class Inverted_Right_Angled_Triangle {
    public static void main(String[] args) {
        for(int i= 0; i<=5; i++){
            for(int j= 5; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
