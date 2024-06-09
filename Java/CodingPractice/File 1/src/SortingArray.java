// Sort Array

import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args) {
        int[] numbers = {5,3,8,1,2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 5, 8]

        String[] names = {"John", "Alice", "BOb"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); // [Alice, BOb, John]

        // Sorting Using Lambda Expressions
        String[] names1 = {"John", "Alice", "BOb"};
        Arrays.sort(names1, (s1,s2) -> s2.compareTo(s1));
        System.out.println(Arrays.toString(names1)); // [John, BOb, Alice]

        // Sorting Multidimensional Arrays
        int[][] sma = {{5,2}, {3,4}, {1,6}};
        Arrays.sort(sma, (a,b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(sma)); // [[1, 6], [3, 4], [5, 2]]
    }
}