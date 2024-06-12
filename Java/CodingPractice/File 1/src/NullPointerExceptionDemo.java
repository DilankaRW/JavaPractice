// Program to show a NullPointerException.

// If you are calling a function on null, it will throw a NullPointerException.
// Certainly! A NullPointerException in Java occurs when you attempt to use an object reference that has not been initialized (i.e., it is null).
public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        String str = null;  // str is not initialized, it is null

        try {
            // Attempt to call a method on the null object
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Catch the NullPointerException and print a message
            System.out.println("A NullPointerException was caught!");
            e.printStackTrace();
        }

        System.out.println("Program continues...");
    }
}

// Output
// A NullPointerException was caught!
// Program continues...
// java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null at NullPointerExceptionDemo.main(NullPointerExceptionDemo.java:11)

// The program declares a String variable str and initializes it to null.
// It then attempts to call the length() method on str. Since str is null, this will throw a NullPointerException.
// The NullPointerException is caught in a try-catch block, and an appropriate message is printed.
// The program continues execution after the exception is handled.



