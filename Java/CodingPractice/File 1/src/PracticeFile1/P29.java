// Shuffle an array

package PracticeFile1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P29 {
    public static void main(String[] args) {
        Integer[] S10 = {34,45,87};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));
    }
}
