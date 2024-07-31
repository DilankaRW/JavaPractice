// Shuffle an array

package PracticeFile1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P26 {
    public static void main(String[] args) {
        Integer[] array = {45,678,23,65,4};
        List<Integer> List = Arrays.asList(array);
        Collections.shuffle(List);
        List.toArray(array);
        System.out.println(Arrays.toString(array));
    }
}
