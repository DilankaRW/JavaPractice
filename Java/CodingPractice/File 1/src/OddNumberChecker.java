// Check if a list of integers contains only odd numbers

import java.util.List;
public class OddNumberChecker {
    public static boolean areAllOdd(List<Integer> numbers){
        for(int number : numbers){
            if (number % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9);
        boolean result = areAllOdd(numbers);
        System.out.println("All numbers are odd: " + result);
    }
}

// areAllOdd Method:
// Accepts a List<Integer> as input.
// Iterates through the list.
// Checks if each number is even (number % 2 == 0).
// Returns false immediately if an even number is found.
// Returns true if all numbers are odd.

// main Method:
// Creates an example list of integers.
// Calls the areAllOdd method with this list.
// Prints whether all numbers in the list are odd.