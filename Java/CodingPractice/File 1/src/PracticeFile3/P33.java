// Create a pyramid of characters.
// Distinct characters and their count in a string.
// Date in specific format
// Merge Lists
// Shuffle an array
// Sort Array
// Sum Array
// Descending order Array
// Text blocks in Java

package PracticeFile3;

import java.text.SimpleDateFormat;
import java.util.*;

public class P33 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Rows Count : ");
        int row = S.nextInt();
        S.close();
        for (int i=1; i<=row; i++){
            for (int x=row-i; x>0; x--){
                System.out.print(" ");
            }
            for (int x=1; x<=(2*i-1); x++){
                System.out.print("*");
            }
            System.out.println();
        }

        ////////////////////

        String str1 = "sdfjhSmnDdssDfsDdasaAsaASd";
        char[] chars = str1.toCharArray();
        Map<Character, Integer> charsCount = new HashMap<>();
        for (char c : chars){
            if (charsCount.containsKey(c)){
                charsCount.put(c, charsCount.get(c) + 1);
            }else{
                charsCount.put(c, 1);
            }
        }
        System.out.println(charsCount);

        ///////////////

        String pattern = "yyyy MMMM dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String date = sdf.format(new Date());
        System.out.println(date);

        //////////// Merge Lists

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        List<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("D");

        list1.addAll(list2);
        System.out.println(list1);

        // Shuffle an array

        Integer[] array = {34,67,23};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
        System.out.println(Arrays.toString(array));

        // Sort Array

        int[] numbers = {34,76,23,12,56,1,4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Sum Array

        int[] S8 = {45,674,12};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        // Descending order Array

        Integer[] S9 = {45,68,24,73,2341,34,324};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        // Text blocks in Java.

        String TextBlock = """
                This is a
                Text blocks in
                Java.
                """;
        System.out.println(TextBlock);

    }
}
