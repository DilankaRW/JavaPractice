// Sort HashMap By Value

import java.util.*;
public class SortHashMapByValue {
    public static void main(String[] args) {
        // Create a HashMap and add some values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 50);
        map.put("banana", 30);
        map.put("cherry", 20);
        map.put("date", 40);

        // Display the original map
        System.out.println("Original map: " + map);

        // Sort the map by value
        LinkedHashMap<String, Integer> sortedMap = sortByValue(map);

        // Display the sorted map
        System.out.println("Sorted map: " + sortedMap);
    }

    public static LinkedHashMap<String, Integer> sortByValue(HashMap<String, Integer> map) {
        // Create a list from the map's entry set
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        // Sort the list using a comparator that compares the values
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Create a new LinkedHashMap to maintain the insertion order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}


// Create the HashMap and Populate It:
// We create a HashMap and add some entries with keys as fruits and values as integers.

// Sort the HashMap by Value:
// Convert the HashMap entries to a List of Map.Entry.
//Sort the list using Collections.sort with a custom Comparator that compares the values of the entries.

// Create a Sorted LinkedHashMap:
// After sorting, we create a LinkedHashMap to preserve the order of the entries as they appear in the sorted list.
// Iterate through the sorted list and populate the LinkedHashMap.

// Display the Results:
// Print the original and sorted maps to the console.
// This program effectively sorts the HashMap by its values and maintains the order using LinkedHashMap.