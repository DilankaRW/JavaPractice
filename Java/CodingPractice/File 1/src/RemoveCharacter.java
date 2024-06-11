// Remove all occurrences of a given character from an input string.
public class RemoveCharacter {
    public static void main(String[] args) {
        String str1 = "adkjhasaauhasf";
        str1 = str1.replace("a","");
        System.out.println(str1); // dkjhsuhsf
    }
}
