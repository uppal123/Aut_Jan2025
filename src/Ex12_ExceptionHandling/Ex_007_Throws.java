package Ex12_ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex_007_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("C://logs.txt");

    }
}
