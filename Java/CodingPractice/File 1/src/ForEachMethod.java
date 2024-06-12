// forEach() method in Java.
// he forEach() method in Java is used to iterate over elements in a collection, such as a list, set, or map. This method is particularly useful for performing operations on each element of the collection.

import java.util.Arrays;
import java.util.List;
public class ForEachMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        // Using forEach() method with lambda expression
        list.forEach(item -> System.out.println(item));

        // Using forEach() method with method reference
        list.forEach(System.out::println);
    }
}
