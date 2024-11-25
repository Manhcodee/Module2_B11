import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập văn bản: ");
        String text = scanner.nextLine();

        text = text.toLowerCase();

        TreeMap<String, Integer> wordMap = new TreeMap<>();

        String[] words = text.split("\\W+");

        for (String word : words) {
            if (word.isEmpty()) continue;

            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.println("\nSố lần xuất hiện của các từ:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}