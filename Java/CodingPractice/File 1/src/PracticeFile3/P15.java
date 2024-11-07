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
    }
}
