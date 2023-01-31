package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        List<String[]> arrayList = new ArrayList<>(Arrays.asList(image));
        return arrayList.stream()
                .map((row) -> {
                    List<String> stringList = new ArrayList<>(Arrays.asList(row));
                    return stringList.stream()
                            .map(item -> List.of(item, item))
                            .flatMap(Collection::stream)
                            .toArray(String[] :: new);
                })
                .map(row -> List.of(row, row))
                .flatMap(Collection::stream)
                .toArray(String[][] :: new);
    }
}
// END
