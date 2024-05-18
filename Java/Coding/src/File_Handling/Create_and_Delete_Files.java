package File_Handling;

import java.io.File;

public class Create_and_Delete_Files {
    public static void main(String[] args) {
        File obj = new File("src/File_Handling/file.txt");

        try {
//            System.out.println(obj.createNewFile());
            /* Output - true (true and Create new file) */
//            System.out.println(obj.getName());
            /* Output - file.txt (Generated file name) */
//            System.out.println(obj.exists());
            /* Output - true (If file is created) */
//            System.out.println(obj.canWrite());
            /* Output - true (If file is Writable) */
//            System.out.println(obj.canRead());
            /* Output - true (If file is Readable) */
//            System.out.println(obj.getAbsoluteFile());
            /* Output - E:\JavaPractice\Java\Coding\src\File_Handling\file.txt (Full file path) */
//            System.out.println(obj.length());
            /* Output - 0 (Count of characters in the file) */
//            System.out.println(obj.delete());
            /* Output - true (If file is deleted) */

            if (obj.delete()){ // This can be deleted even inside the if.
                System.out.println("File deleted");
                /* Output - File deleted (If file is deleted) */
            }else{
                System.out.println("No any file");
                /* Output - No any file (If no file here) */
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
