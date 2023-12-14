package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.isBlank()) {
            return Map.of();
        }
        var words = sentence.split(" ");
        var result = new HashMap<String, Integer>();
        for (var word : words) {
            result.compute(word, (k, v) -> v == null ? 1 : v + 1);
        }
        return result;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        var result = new StringBuilder("{\n");
        for (var entry : map.entrySet()) {
            result.append(String.format("  %s: %d\n", entry.getKey(), entry.getValue()));
        }
        result.append("}");
        return result.toString();
    }
}
//END
