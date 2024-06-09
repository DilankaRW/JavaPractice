import java.util.LinkedList;

// Reverse a linked list
// LinkedList descendingIterator() returns an iterator that iterates over the element in reverse order. The following example code shows how to use this iterator to create a new Linked List with elements listed in the reverse order:
public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList and add elements to it
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        // Print the original LinkedList
        System.out.println(ll); // [1, 2, 3]

        // Create another LinkedList to store the reversed elements
        LinkedList<Integer> ll1 = new LinkedList<>();

        // Use descendingIterator to add elements to ll1 in reverse order
        ll.descendingIterator().forEachRemaining(ll1::add);

        // Print the reversed LinkedList
        System.out.println(ll1); // [3, 2, 1]
    }
}
