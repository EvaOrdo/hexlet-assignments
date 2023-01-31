package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Map<String, String> result = new LinkedHashMap<>();
        Set<String> keys = new TreeSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());
        for (var key : keys) {
            if (!map1.containsKey(key)) {
                result.put(key, "added");
            } else if (!map2.containsKey(key)) {
                result.put(key, "deleted");
            } else {
                result.put(key, map1.get(key).equals(map2.get(key))
                        ? "unchanged"
                        : "changed");
            }
        }
        return result;
    }
}
//END
