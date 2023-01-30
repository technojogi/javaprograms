// find duplicate number in an array

package ArrayRelated;

import java.util.HashSet;
import java.util.Set;

public class Program23_ArrayFindDuplicate {
    public static void findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.println("Duplicate value is : " + arr[i]);
            }
        }
    }
        public static void main(String[] args){
            int[] arr = {1, 2, 3, 3, 5};
            findDuplicates(arr);
        }
    }
//  Time complexity: O(n)
//  Space complexity: O(n)