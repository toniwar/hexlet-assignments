package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App{

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        var result = new ArrayList<Map<String, String>>();
        var booksCopy = new ArrayList<>(books);
        var whereEntrySet = where.entrySet();
        for (var book: booksCopy) {
            var isEqual = false;
            for (var entry: whereEntrySet) {
                isEqual = book.get(entry.getKey()).equals(entry.getValue());
                if (!isEqual) {
                    break;
                }
            }
            if (isEqual) {
                result.add(book);
            }
        }
        return result;
    }
}

//END
