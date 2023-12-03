package exercise;


import java.util.HashMap;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        var symbolsArray = symbols.toLowerCase().toCharArray();
        var wordSymbolsArray = word.toLowerCase().toCharArray();
        var symbolsMap = new HashMap<Character, Integer>();
        var wordSymbolsMmp = new HashMap<Character, Integer>();
        for (var symbol: symbolsArray) {
            symbolsMap.compute(symbol, (key, count) -> count == null? 1 : count + 1);
        }
        for (var symbol: wordSymbolsArray) {
            wordSymbolsMmp.compute(symbol, (key, count) -> count == null? 1 : count + 1);
        }
        for (var entry: wordSymbolsMmp.entrySet()) {
            var key = entry.getKey();
            var value = entry.getValue();
            if (!symbolsMap.containsKey(key)) {
                return  false;
            }
            if (symbolsMap.get(key) < value) {
                return false;
            }
        }
        return true;
    }
}
//END
