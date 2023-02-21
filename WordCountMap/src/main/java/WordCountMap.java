
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
 // Instantiate a new HashMap to hold the word counts
 Map<String, Integer> wordMap = new HashMap<>();

 // Split the input string into an array of words
 String[] wordArray = words.split(" ");

 // Iterate through the array of words and update the map with the word counts
 for (String word : wordArray) {
     if (wordMap.containsKey(word)) {
         // If the word is already a key in the map, increment its count value
         int count = wordMap.get(word);
         wordMap.put(word, count + 1);
     } else {
         // If the word is not already a key in the map, add a new key with a count of 1
         wordMap.put(word, 1);
     }
 }

 // Return the map with the word counts
 return wordMap;
}
}