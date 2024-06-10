// Write a Java program that illustrates merge sort.

// Merge sort is one of the most efficient sorting algorithms. It works on the principle of “divide and conquer”. It is based on the idea of breaking down a list into several sub-lists until each sub-list consists of a single element, and then merging those sub-lists in a manner that results in a sorted list.
public class MergeSort {

    // Main method to test the merge sort algorithm
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }

    // Method to sort the array using merge sort algorithm
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Recursively sort the left half
            mergeSort(array, left, middle);

            // Recursively sort the right half
            mergeSort(array, middle + 1, right);

            // Merge the two halves
            merge(array, left, middle, right);
        }
    }

    // Method to merge two halves of the array
    public static void merge(int[] array, int left, int middle, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Temporary arrays to hold the data
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[middle + 1 + j];

        // Initial indices of the subarrays
        int i = 0, j = 0;

        // Initial index of the merged array
        int k = left;

        // Merge the temporary arrays back into the original array
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of leftArray
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements of rightArray
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
