package File_Handling;

import java.io.File;
import java.util.Scanner;

public class ReadFile1 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            Scanner reader = new Scanner(file);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
