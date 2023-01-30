// Repeated numbers in an array if it contains multiple duplicates

package ArrayRelated;
import java.util.*;
public class Program19_RepeatedElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 9, 9};
        findDuplicates(arr);
    }

    static void findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                System.out.print(i + " ");
            } else {
                set.add(i);
            }
        }
    }
}

//This program has a time complexity of O(n) and space complexity of O(n) where n is the length of the array.
// It uses a HashSet to store unique elements and check if an element is already present in the set.
// If it is, it means that the element is a duplicate and it is printed.