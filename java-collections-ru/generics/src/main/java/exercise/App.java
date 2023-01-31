package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// BEGIN
class App {
    public static boolean isMatchedBook(Map<String, String> book, Map<String, String> params) {
        for (String param: params.keySet()) {
            if (!book.getOrDefault(param, "").equals(params.get(param))) {
                return false;
            }
        }
        return true;
    }
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> params) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book: books) {
            if (isMatchedBook(book, params)) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
