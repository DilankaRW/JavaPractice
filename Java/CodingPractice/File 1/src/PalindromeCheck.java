// Check whether a string is a palindrome
public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        // Remove any non-alphanumeric characters and convert to lower case
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Compare the cleaned string with the reversed string
        return cleanedStr.equals(reversedStr);
    }
    public static void main(String[] args) {
        String testStr = "A man, a plan, a canal, Panama";
        if (isPalindrome(testStr)) {
            System.out.println("\"" + testStr + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testStr + "\" is not a palindrome.");
        }
    }
}