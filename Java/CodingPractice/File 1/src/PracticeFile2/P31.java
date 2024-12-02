// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array
// Shuffle an array
// Create a pyramid of characters.
// Break and Continue
// Final Keyword

package PracticeFile2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P31 {
    public static void main(String[] args) {
        String S1 = "saro";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "saro";
        S2 = S2.replaceAll("s","");
        System.out.println(S2);

        String S3 = "    saro    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   saro";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "saro    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"s","a","r","o"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {23,56,22,6,5,12,54};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,6,4,23};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {34,56,31,45,12,53};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {34,42,123};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));

        Scanner S = new Scanner(System.in);
        System.out.print("Rows Count : ");
        int row = S.nextInt();
        S.close();
        for (int i=1; i<=row; i++){
            for (int x=row-i; x>0; x--){
                System.out.print(" ");
            }
            for (int x=1; x<=(2*i-1); x++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Break and Continue

        for (int i=1; 1<=10; i++){
            if (i==5)
                break;
            System.out.println(i);
            // Output - 1,2,3,4
        }

        for (int i=1; i<=10; i++){
            if (i==5)
                continue;
            System.out.println(i);
            // Output - 1,2,3,4,6,7,8,9,10
            // Number 5 does not print
        }

        // Final Keyword

        // Final for Variable
        final double x = 5.20;
        // x = 25; // Cannot assign a value to final variable 'x'
        System.out.println(x);

        // Final for Class
//        final class Parent{
//        }
//        class child extends Parent{
//            // Cannot inherit from final 'Parent'
//        }

        // Final for Method
//        class Parent{
//            final public void say(){
//                System.out.println("hi");
//            }
//        }
//        class Child extends Parent{
//            public void say(){ // 'say()' cannot override 'say()' in 'Parent'; overridden method is final
//                System.out.println("Ceylon");
//            }
//        }
//        public class P31{
//            public static void main(String[] args){
//                Child obj = new Child();
//                obj.say();
//            }
//        }
    }
}
