//find missing no in an array

package ArrayRelated;
import java.util.Arrays;
public class Program24_ArrayFindMissingNumber {
        public static int getMissingNumber(int[] arr) {
            int n = arr.length + 1;
            int sum = n * (n + 1) / 2;
            int actualSum = 0;
            for (int i = 0; i < arr.length; i++) {
                actualSum += arr[i];
            }
            return sum - actualSum;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 5, 6};
            int missing = getMissingNumber(arr);
            System.out.println("Missing number: " + missing);
        }
    }

//The time complexity of this program is O(n)
// and the space complexity is O(1)