// Odd Number Checker

package PracticeFile4;

import java.util.List;

public class P12 {
    public static boolean areAllOdd(List<Integer> numbers) {
        for (int number : numbers){
            if (number % 2 == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,5,7,8);
        boolean result = areAllOdd(numbers);
        System.out.println("All numbers are odd: " + result); // false
    }
}
