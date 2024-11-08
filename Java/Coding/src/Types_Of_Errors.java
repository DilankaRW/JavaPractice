/* Syntax Errors */
/* Logical Errors */
/* Runtime Errors */

/********** Syntax Errors **********/
//public class Types_Of_Errors {
//    public static void main(String[] args) {
//        // int a = 10 // Syntax Error (int a = 10;)
//        // b = 5; // // Syntax Error (int b = 5;)
//    }
//}


/********** Logical Errors **********/
public class Types_Of_Errors {
   public static void main(String[] args) {
       int length = 10;
       int width = 5;
       // int perimeter = length + width * 2; // Logical Error ( (length + width) * 2; )
       /* Output - 20 */
       int perimeter = (length + width) * 2;
       System.out.println(perimeter);
       /* Output - 30 */
   }
}


/********** Runtime Errors **********/
// import java.util.Scanner;

// public class Types_Of_Errors {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a,b,c;
//         System.out.print("Enter first Number");
//         a = sc.nextInt();
//         System.out.print("Enter second number");
//         b = sc.nextInt();
//         c = a/b;
//         System.out.println("Answer is " + c);

//         /* Input -
//         Enter first Number 10
//         Enter first Number 0 */
//         /* Output Runtime Error */

//         /* Input -
//         Enter first Number 4.5 */
//         /* Output Runtime Error */
//     }
// }