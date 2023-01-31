package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordCountCollection = new HashMap<>();
        if (sentence.length() == 0) {
            return wordCountCollection;
        }
        String[] words = sentence.toLowerCase().trim().split(" ");
        for (String word : words) {
            int count = wordCountCollection.getOrDefault(word, 0);
            wordCountCollection.put(word, count + 1);
        }
        return wordCountCollection;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }
        StringBuilder result = new StringBuilder("{\n");
        for (String word: wordsCount.keySet()) {
            result.append("  ").append(word).append(": ").append(wordsCount.get(word)).append("\n");
        }
        return result.append("}").toString();
    }
}
//END
