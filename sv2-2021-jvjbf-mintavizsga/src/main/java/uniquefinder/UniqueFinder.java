package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String words) {
        try {
            char[] input = words.toCharArray();
            List<Character> expected = new ArrayList<>();
            for (char actual : input) {
                if ( !expected.contains(actual)) {
                    expected.add(actual);
                }
            }
            return expected;
        } catch (NullPointerException npe) {
            throw new IllegalArgumentException("Text is null.", npe);
        }
    }
}
