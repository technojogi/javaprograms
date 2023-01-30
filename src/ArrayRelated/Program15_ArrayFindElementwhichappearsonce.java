// There is an array with every element repeated twice except one
//Find that element

package ArrayRelated;
import java.util.HashMap;
public class Program15_ArrayFindElementwhichappearsonce {
        public static int findSingle(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int num : nums) {
                if (map.get(num) == 1) {
                    return num;
                }
            }
            return -1;
        }
        public static void main(String[] args){
            int[] arr = {1,1,2,2,3,4,4,5,5,6,6};
            System.out.println("Element which is unique in an array is : "+findSingle(arr));
        }
    }
//The reason for the time complexity being O(n) is that in the worst-case scenario,
// the program needs to traverse the entire array once to find the solution. The loop that iterates through the array takes O(n) time.

//The space complexity of the program is O(1) because it only uses a single integer variable to store the result,
// and it doesn't use any extra data structures to store the values of the array.
// The program only uses a constant amount of memory space, so its space complexity is O(1).