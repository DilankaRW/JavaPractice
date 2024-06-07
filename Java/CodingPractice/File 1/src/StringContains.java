// Program to check if a vowel is present in a string.
public class StringContains {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello"));
        System.out.println(stringContainsVowels("TV"));
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}

// The stringContainsVowels method converts the input string to lowercase.
// It uses a regular expression .*[aeiou].* to check if there is any vowel in the string.
