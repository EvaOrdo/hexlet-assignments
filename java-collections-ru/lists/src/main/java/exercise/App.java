package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
class App {
    public static List<String> stringToList(String string) {
        String[] splitString = string.toLowerCase().split("");

        return new ArrayList<>(Arrays.asList(splitString));
    }

    public static Boolean scrabble(String symbols, String word) {
        if (symbols.length() < word.length()) {
            return false;
        }
        List<String> symbolsCollection = stringToList(symbols);
        List<String> lettersCollection = stringToList(word);
        for (String letter : lettersCollection) {
            if (!symbolsCollection.contains(letter)) {
                return false;
            } else {
                symbolsCollection.remove(letter);
            }
        }
        return true;
    }
}
//END
