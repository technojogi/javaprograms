//Sum of Sub Array equal to zero in an Array
package ArrayRelated;

public class Program9_SubArrayEqualZero {
        public static void main(String[] args) {
            int[] arr = {4, 2, -3, 1, 6};
            int n = arr.length;
            findSubArray(arr, n);
        }

        static void findSubArray(int[] arr, int n) {
            for (int i = 0; i < n; i++) {
                int sum = arr[i];
                for (int j = i + 1; j <= n; j++) {
                    if (sum == 0) {
                        System.out.println("Subarray found from index " + i + " to " + (j - 1));
                        return;
                    }
                    if (j == n) {
                        break;
                    }
                    sum += arr[j];
                }
            }
            System.out.println("No subarray found with sum 0");
        }
    }



//Time complexity
//The time complexity of this program is O(n^2)
//The time complexity of this program is O(n^2) because for each element in the array,
// it checks if there's another element in the array that results in a sum equal to 0.
// This requires a nested loop, so the overall time complexity is O(n^2), where n is the number
// of elements in the array. The outer loop iterates through each element in the array, and the inner
// loop iterates through all elements that come after the current element.
// This results in a total of n * (n - 1) / 2 iterations, which is O(n^2) in terms of time complexity.

//Space Complexity
//The Space complexity is O(1), as it uses only a few variables.