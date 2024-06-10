// Find the second-largest number in an array
public class FindSecondHighestNum {
    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest && i < highest) {
                secondHighest = i;
            }
        }

        return secondHighest;
    }
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 7};
        int secondHighest = findSecondHighest(array);
        System.out.println("The second highest number in the array is: " + secondHighest);
    }
}

// Initialization:
// highest and secondHighest are initialized to Integer.MIN_VALUE to ensure they can be updated by any number in the array.

// Finding the Highest and Second Highest:
// The loop iterates through each number in the array.
// If the current number is greater than highest, it updates secondHighest to highest and then updates highest to the current number.
// If the current number is greater than secondHighest but less than highest, it updates secondHighest.

// Main Method:
// The main method demonstrates how to use the findSecondHighest method. It creates an array, calls the method, and prints the result.