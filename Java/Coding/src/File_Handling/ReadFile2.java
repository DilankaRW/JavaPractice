/* Using FileReader class */

package File_Handling;

import java.io.FileReader;

public class ReadFile2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/File_Handling/file.txt");

            int i;
            while ((i = reader.read()) != -1){
                System.out.print((char)i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
