// Merge Lists

package PracticeFile4;

import java.util.ArrayList;
import java.util.List;

public class P11 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        List<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("D");
        list1.addAll(list2);

        System.out.println(list1);
    }
}
