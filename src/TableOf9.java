public class TableOf9 {
    int number = 9;
    int n;
    public void calculation(){
        System.out.println("Table of 9: ");
        for(int i=1; i<=10; i++){
            n= number*i;
            System.out.println("9 x " +i + " = " + n);
        }
    }
    public static void main(String[] args) {
        TableOf9 obj = new TableOf9();
        obj.calculation();
    }

}
