import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(); // The array count can also be given. - ArrayList(10);
        /* ArrayList<Integer> arr = new ArrayList(); */
        arr.add(5);
        arr.add(30);

        arr.add(0,99);
        System.out.println(arr);

        /* for (int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        } */

        arr.forEach(x -> System.out.println(x));

        /*
        Output -
        [99, 5, 30]
        99
        5
        30
        */
    }
}
