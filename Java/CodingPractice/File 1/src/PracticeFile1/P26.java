// Array Sum
package PracticeFile1;

import java.util.Arrays;

public class P26 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 6};
        int sum = 0;
        for ( int i : num) sum += i;
        System.out.println(sum);
    }
}
