// Shuffle an array

package PracticeFile1;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P27 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array); // Convert back to array
        System.out.println(Arrays.toString(array));
    }
}
