/* Using BufferedWriter class */

package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile2 {
    public static void main(String[] args) {
        try {
            BufferedWriter writter = new BufferedWriter(new FileWriter("src/File_Handling/file2.txt"));
            writter.write("Hello");
            writter.newLine();
            writter.write("Welcome");
            writter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
