/* Using Scanner class */

package File_Handling;

import java.io.File;
import java.util.Scanner;

public class ReadFile1 {
    public static void main(String[] args) {
        File file = new File("src/File_Handling/file.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            reader.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
