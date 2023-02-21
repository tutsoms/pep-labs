
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        int i = 0;
        int j = str.length() - 1;
    
        // Check characters at the beginning and end of the String
        // and move towards the middle until a mismatch is found
        while (j > i) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
    
        // If I've checked the entire String without finding a mismatch,
        // then it must be a palindrome
        return true;
    }
}