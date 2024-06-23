// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array

package PracticeFile1;

import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        String S = "Hello World";
        String RS = new StringBuilder(S).reverse().toString();
        System.out.println(RS); // dlroW olleH

        String S1 = "Gohhhhhogle";
        S1 = S1.replaceAll("h","");
        System.out.println(S1); // Google

        String S2 = "    World   ";
        String TS2 = S2.trim();
        System.out.println(TS2); // 'World'

        String S3 = "    Good  ";
        S3 = S3.replaceAll("^\\s+","");
        System.out.println(S3); // 'Good  '

        String S4 = "     Good   ";
        S4 = S4.replaceAll("\\s+$", "");
        System.out.println(S4); // '     Good'

        String[] names = {"Sarath", "Dulan", "Kosala", "Aruna"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); // [Aruna, Dulan, Kosala, Sarath]

        int[] numbers = {23,45,76,795,45,323,2,4,5,22,332};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [2, 4, 5, 22, 23, 45, 45, 76, 323, 332, 795]
    }
}
