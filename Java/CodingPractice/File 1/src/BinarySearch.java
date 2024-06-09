// Implement a binary search

// The array elements must be sorted to implement binary search. The binary search algorithm is based on the following conditions:
// If the key is less than the middle element, then you now need to search only in the first half of the array.
// If the key is greater than the middle element, then you need to search only in the second half of the array.
// If the key is equal to the middle element in the array, then the search ends.
// Finally, if the key is not found in the whole array, then it should return -1. This indicates that the element is not present.

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target was not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
