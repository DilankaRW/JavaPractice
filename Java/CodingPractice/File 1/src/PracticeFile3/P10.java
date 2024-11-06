// Merge Lists

// Using the addAll Method
// The addAll method of the List interface can be used to add all elements of one list to another.
package PracticeFile3;

import java.util.ArrayList;
import java.util.List;

public class P10 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        List<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("D");

        list1.addAll(list2);

        System.out.println(list1); // [A, B, C, D]
    }
}
