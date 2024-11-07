// Program to check if a vowel is present in a string.

package PracticeFile3;

public class P12 {
    public static boolean stringContainsVowels(String intput) {return intput.toLowerCase().matches(".*[aeiou].*");}

    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Engineer")); // true
        System.out.println(stringContainsVowels("sky")); // false
    }
}
