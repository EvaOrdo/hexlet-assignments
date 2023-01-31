package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted(Comparator.comparing(user -> user.get("birthday")))
                .flatMap(user -> Stream.of(user.get("name")))
                .toList();
    }
}
// END
