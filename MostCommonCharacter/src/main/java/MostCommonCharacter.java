import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();
        char mostCommonChar = ' ';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = charCounts.getOrDefault(c, 0) + 1;
            charCounts.put(c, count);

            if (count > maxCount) {
                maxCount = count;
                mostCommonChar = c;
            }
        }

        return mostCommonChar;
    }
}


