/* Using FileWriter class */

package File_Handling;

import java.io.FileWriter;

public class WriteFile1 {
    public static void main(String[] args) {
        String txt1 ="Hello";
        String txt2 =" World";
        String txt3 ="\nWelcome";
        try {
            FileWriter writter = new FileWriter("src/File_Handling/file1.txt", true);
            writter.write(txt1); // write - for write new words.
            writter.append(txt2); // append - for add more words.
            writter.append(txt3); // \n for new line.
            writter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
