// Find first non-repeating element in array of integers

package ArrayRelated;

import java.util.HashMap;

public class Program13_ArrayFirstNonRepetingInteger {
        public static int firstNonRepeating(int[] arr) {

            // Create a HashMap to store the frequency of each element
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            // Traverse the array and store the frequency of each element
            for (int i = 0; i < arr.length; i++) {
                if (frequencyMap.containsKey(arr[i])) {
                    frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
                } else {
                    frequencyMap.put(arr[i], 1);
                }
            }

            // Traverse the array again and return the first non-repeating element
            for (int i = 0; i < arr.length; i++) {
                if (frequencyMap.get(arr[i]) == 1) {
                    return arr[i];
                }
            }

            // Return -1 if there is no non-repeating element
            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {9, 4, 9, 6, 7, 4};
            int firstNonRepeating = firstNonRepeating(arr);
            System.out.println("First non-repeating element: " + firstNonRepeating);
        }
    }
//Time complexity: O(n) because we traverse the array twice, once to store the frequency of each element,
// and once to find the first non-repeating element.
//Space complexity: O(n) because we use a HashMap to store the frequency of each element.