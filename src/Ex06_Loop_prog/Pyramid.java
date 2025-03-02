package Ex06_Loop_prog;

public class Pyramid {
    public static void main(String[] args) {
        for(int i= 0; i<=5; i++) {
            for(int j= 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
//            for(int k= 1; k<5; k++){
//                System.out.print("*");
//            }
        }
    }
}
