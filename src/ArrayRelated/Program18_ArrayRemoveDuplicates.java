//program to remove duplicates from sorted array in Java

package ArrayRelated;
import java.util.Arrays;

public class Program18_ArrayRemoveDuplicates {
        public static int[] removeDuplicates(int[] nums) {
            if (nums == null || nums.length == 0) return nums;
            int len = nums.length;
            int slow = 0;
            for (int fast = 0; fast < len; fast++) {
                if (nums[fast] != nums[slow]) {
                    nums[++slow] = nums[fast];
                }
            }
            return Arrays.copyOfRange(nums, 0, slow + 1);
        }
        public static void main(String[] args){
            int[] arr = {1,1,2,3,4,6,6,7,8,8};
            System.out.println(Arrays.toString(removeDuplicates(arr)));
        }

    }

//Time complexity: O(n) where n is the number of elements in the array.
// The loop runs once through the array, so the time complexity is linear with respect to the size of the array.

//Space complexity: O(1). The program uses two pointers, slow and fast, but they do not use additional memory space.
// The only memory used is the memory required to store the input array.