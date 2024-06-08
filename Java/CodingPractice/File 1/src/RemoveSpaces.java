// Remove spaces from a string
public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Hello World";
        str = str.replaceAll(" ", "");
        System.out.println(str);
        // Output - HelloWorld
    }
}