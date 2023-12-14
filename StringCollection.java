import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class StringCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create ArrayList, HashSet, and HashMap
        ArrayList<String> stringList = new ArrayList<>();
        HashSet<String> stringSet = new HashSet<>();
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        // Take 10 strings as input
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            String input = sc.nextLine();
            stringList.add(input);
            stringSet.add(input);

            // Populate word frequency map
            wordFrequencyMap.put(input, wordFrequencyMap.getOrDefault(input, 0) + 1);
        }

        // Print the content of the ArrayList
        System.out.println("\nList Contains:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Print the content of the HashSet
        System.out.println("\nSet Contains:");
        for (String str : stringSet) {
            System.out.println(str);
        }

        // Print the content of the word frequency map
        System.out.println("\nFrequency of the words:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println("Word = " + entry.getKey() + ", Frequency = " + entry.getValue());
        }

        sc.close();
    }
}