// Shuffle an array

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Using Collections.shuffle() method:
public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array); // Convert back to array
        System.out.println(Arrays.toString(array));
    }

    // The following example code shows how to use the Random class to generate random index numbers and shuffle the elements:
//    public static void main(String[] args) {
//        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
//        Random rand = new Random();
//        for (int i = 0; i < array.length; i++) {
//            int randomIndexToSwap = rand.nextInt(array.length);
//            int temp = array[randomIndexToSwap];
//            array[randomIndexToSwap] = array[i];
//            array[i] = temp;
//        }
//        System.out.println(Arrays.toString(array));
//    }
    // You can run the shuffling code inside another for loop to shuffle multiple rounds.

}
