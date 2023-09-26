package hashtable;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    private final String string;
    private final Map<Character, Integer> charFrequencyMap;

    CharFinder(String string) {
        this.string = string.toLowerCase();
        this.charFrequencyMap = calculateCharFrequencies();
    }

    private Map<Character, Integer> calculateCharFrequencies() {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    public char firstNonRepeatedChar() {
        for (char ch : string.toCharArray()) {
            if (charFrequencyMap.get(ch) == 1) {
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }

    public char firstRepeatedChar() {
        for (char ch : string.toCharArray()) {
            if (charFrequencyMap.get(ch) > 1) {
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
}
