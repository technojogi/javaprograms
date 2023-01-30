//


//In this code, we first separate the positive and negative numbers by swapping them until all positive numbers
// are on the right side and negative numbers are on the left side. Then, we alternate the positive and negative
// numbers by swapping the positive numbers with negative numbers.

package ArrayRelated;

public class Program10_ArrayAlternatepositivenegative {
        public static void main(String[] args) {
            int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
            int n = arr.length;

            rearrangeArray(arr, n);
            System.out.println("Modified array is:");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }

        static void rearrangeArray(int[] arr, int n) {
            // First, separate positive and negative numbers
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    // swapping of elements
                    if (i != j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    j++;
                }
            }

            // Rearrange array in alternating positive and negative numbers
            int pos = j, neg = 0;
            while (pos < n && neg < pos && arr[neg] < 0) {
                int temp = arr[neg];
                arr[neg] = arr[pos];
                arr[pos] = temp;
                pos++;
                neg += 2;
            }
        }
    }

//Time complexity: O(n)
//Explanation: The time complexity of the above program is O(n) because the program iterates over the array only once,
// performing a constant amount of work for each element.

//Space complexity: O(1)
//Explanation: The space complexity of the above program is O(1) because the program does not use any extra memory,
// only variables for index and swapping elements.