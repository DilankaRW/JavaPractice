// Errors

package PracticeFile3;

// Syntax Error
//public class P18 {
//    public static void main(String[] args) {
//        int a = 10 // Syntax Error (int a = 10;)
//        b = 5; // Syntax Error (int b = 5;)
//    }
//}


// Logical Errors
public class P18 {
    public static void main(String[] args) {
        int length = 10;
        int width = 5;
        // int perimeter = length + width * 2; // Logical Error ( (length + width) * 2; )
        // Output - 20
        int perimeter = (length + width) * 2;
        System.out.println(perimeter);
//        Output - 30
    }
}