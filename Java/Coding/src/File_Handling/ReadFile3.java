/* Using BufferedReader class */

package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile3 {
    public static void main(String[] args) {
        File file = new File("src/File_Handling/file.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String str;
            while ((str = reader.readLine()) != null ){
                System.out.println(str);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
