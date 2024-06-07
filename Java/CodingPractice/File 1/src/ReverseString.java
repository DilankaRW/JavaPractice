// Reverse a string using the StringBuilder class

public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

//This code uses StringBuilder's built-in reverse() method to reverse the string and convert it back to a string using toString(). This approach is both straightforward and efficient.