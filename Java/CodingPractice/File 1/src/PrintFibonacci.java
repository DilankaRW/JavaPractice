// program to print a Fibonacci sequence using recursion.

public class PrintFibonacci {
    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.println("Fibonacci sequence up to " + terms + " terms:");

        for (int i = 0; i < terms; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}

// Output - Fibonacci sequence up to 10 terms:
// 0 1 1 2 3 5 8 13 21 34

// Recursive Method (fibonacci):
// This method takes an integer n and returns the n-th Fibonacci number.
// If n is 0 or 1, it returns n (base case).
// Otherwise, it recursively calls itself with n-1 and n-2 and returns their sum.

// Main Method:
// Defines the number of terms to print (terms).
// Uses a for loop to print each Fibonacci number from index 0 to terms-1.
// Calls the fibonacci method for each index and prints the result.