// Shuffle an array

package PracticeFile1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P28 {
    public static void main(String[] args) {
        Integer[] array = {546,678,234,178,544};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
        System.out.println(Arrays.toString(array));
    }
}
