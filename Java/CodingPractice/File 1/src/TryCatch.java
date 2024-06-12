// Illustrate a try catch example.
public class TryCatch {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // This block will be executed if the above code throws an ArrayIndexOutOfBoundsException
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // This block will always be executed whether an exception is thrown or not
            System.out.println("The try-catch block is finished.");
        }
    }
}

// try Block:
// The try block contains code that might throw an exception. In this case, accessing an index that doesn't exist in the numbers array will throw an ArrayIndexOutOfBoundsException.

// catch Block:
// The catch block is used to handle the exception. If an exception occurs in the try block, the catch block will be executed. Here, it catches ArrayIndexOutOfBoundsException and prints an error message.

// finally Block:
// The finally block contains code that will always be executed, regardless of whether an exception is thrown or not. It's typically used for cleanup code, like closing files or releasing resources.