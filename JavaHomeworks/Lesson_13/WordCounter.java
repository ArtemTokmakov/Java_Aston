package Lesson_13;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        String[] words = {"пицца", "бургер", "картошка-фри", "яблочный фреш", "пицца", "салат цезарь",
                          "картошка-фри", "пицца", "бургер", "лонг-айленд", "луковые кольца", "паста болоньезе",
                          "картошка-фри", "пицца", "яблочный фреш", "луковые кольца", "маргарита", "фахитос",
                          "пицца", "салат цезарь"};

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        System.out.println("Список уникальных слов и их количество:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
