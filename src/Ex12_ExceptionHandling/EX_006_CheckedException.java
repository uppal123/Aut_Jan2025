package Ex12_ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EX_006_CheckedException {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C://logs.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
