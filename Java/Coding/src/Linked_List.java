import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList(List.of(1,2,3));
        arr.add(12);
        System.out.println(arr);
        /* Output - [1, 2, 3, 12] */
        System.out.println(arr.contains(12));
        /* Output - true */
        System.out.println(arr.get(2));
        /* Output - 3 */
        System.out.println(arr.indexOf(1));
        /* Output - 0 */
    }
}