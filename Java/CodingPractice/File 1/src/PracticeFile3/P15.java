// Sort Array

package PracticeFile3;

import java.util.Arrays;

public class P15 {
    public static void main(String[] args) {
        int[] numbers = {34,6,23,12,244,57};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [6, 12, 23, 34, 57, 244]

        String[] names = {"Sarath","Aruna","Bharatha","Gunapala"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); // [Aruna, Baratha, Gunapala, Sarath]

        // Sorting Multidimensional Arrays
        int[][] sma = {{2,4},{23,1},{7,4},{1,9}};
        Arrays.sort(sma, (a,b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(sma));

    }
}
