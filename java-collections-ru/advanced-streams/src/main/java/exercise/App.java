package exercise;

import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static String getForwardedVariables(String config) {
        String[] content = config.split("\n");

        return Arrays.stream(content)
                .filter(string -> string.startsWith("environment"))
                .map(string -> string.replaceAll("environment=", "").replaceAll("\"", "").split(","))
                .flatMap(Arrays::stream)
                .filter(str -> str.startsWith("X_FORWARDED_"))
                .map(str -> str.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
