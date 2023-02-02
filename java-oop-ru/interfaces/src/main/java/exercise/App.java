package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.stream.Stream;


// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        return apartments.stream()
                .limit(n)
                .sorted(Comparator.comparing(apt -> apt.getArea()))
                .map(apt -> apt.toString())
                .collect(Collectors.toList());
    }
}
// END
