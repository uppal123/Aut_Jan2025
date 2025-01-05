public class Loops {

    public void loopWhile() {
        int[] number = {99, 50, 7, 67, 44};
        int index = 0;

        while (index < 5) {
            System.out.print(" the value in index are: " + number[index]);
            index++;
            System.out.print("\n");
        }
    }

    public void loopDoWhile(){
        int x = 10;
        do {
            x++;
            System.out.print(x);
            System.out.print("\n");
        } while (x>20);

    }

    public static void main(String[] args) {
        Loops l = new Loops();
        //l.loopWhile();
        l.loopDoWhile();
    }
}

