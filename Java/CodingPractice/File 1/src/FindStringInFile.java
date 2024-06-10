// Find a string in a text file
import java.io.*;
import java.util.Scanner;

// Find a string in a text file
public class FindStringInFile {

    public static void main(String[] args) {
        // Specify the file path and the string to search for
        String filePath = "path/to/your/file.txt";
        String searchString = "your search string";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            boolean found = false;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                lineNumber++;
                // Check if the line contains the search string
                if (line.contains(searchString)) {
                    System.out.println("String found at line " + lineNumber + ": " + line);
                    found = true;
                    // Optionally, break if you only want the first occurrence
                    // break;
                }
            }

            if (!found) {
                System.out.println("String not found in the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // The following example code shows how to use the Scanner class to read the file contents line by line and then use the String contains() method to check if the string is present in the file:
//    boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
//        File file = new File(filePath);
//
//        Scanner scanner = new Scanner(file);
//
//        // read the file line by line
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            if (line.contains(str)) {
//                scanner.close();
//                return true;
//            }
//        }
//        scanner.close();
//        return false;
//    }
}
