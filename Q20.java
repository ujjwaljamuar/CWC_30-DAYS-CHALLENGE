package challenge;

import java.io.IOException;
import java.io.OutputStreamWriter;

// Program to print a statement without using the print statement.

public class Q20 {
    public static void main(String[] args) throws IOException {
        //Creating a OutputStreamWriter object
      OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
      streamWriter.write("Hey My name is Ujjwal Jamuar.");
      streamWriter.flush();
    }
}
