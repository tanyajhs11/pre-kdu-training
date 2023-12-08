import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopRepeatedWords {
    public static void main(String[] args) {
        String csvFile = "/Users/tanyaagarwal/Desktop/KDU/frequency.csv"; // Specify the path to your CSV file
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",\\s*");

                for (String word : words) {
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        printTopRepeatedWords(wordFrequencyMap, 3);
    }

    private static void printTopRepeatedWords(Map<String, Integer> wordFrequencyMap, int topN) {
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
                (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())
        );

        maxHeap.addAll(wordFrequencyMap.entrySet());

        System.out.println("Top " + topN + " repeated words:");

        for (int i = 0; i < topN; i++) {
            if (!maxHeap.isEmpty()) {
                Map.Entry<String, Integer> entry = maxHeap.poll();
                System.out.println(entry.getKey());
            }
        }
    }
}