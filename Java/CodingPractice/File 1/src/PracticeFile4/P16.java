// Program to check if a vowel is present in a string.

package PracticeFile4;

public class P16 {
    public  static boolean stringContainsVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("TV")); // false
    }
}
