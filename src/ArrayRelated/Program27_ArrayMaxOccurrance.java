//max occurrance of character in an array of string

package ArrayRelated;
import java.util.*;
public class Program27_ArrayMaxOccurrance {
        public static char findMaxOccurrence(String[] arr) {
            Map<Character, Integer> charCount = new HashMap<>();
            for (String s : arr) {
                for (char c : s.toCharArray()) {
                    charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                }
            }
            char maxChar = ' ';
            int maxCount = Integer.MIN_VALUE;
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxChar = entry.getKey();
                }
            }
            return maxChar;
        }

        public static void main(String[] args) {
            String[] arr = {"abwwwbc", "deeeeef", "ghrrrri", "jkkkl"};
            System.out.println("Character with maximum occurrence: " + findMaxOccurrence(arr));
        }
    }