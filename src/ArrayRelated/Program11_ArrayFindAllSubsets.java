//

package ArrayRelated;

public class Program11_ArrayFindAllSubsets {
        // Function to find all subsets of a given array
        public static void findSubsets(int[] arr) {
            int n = arr.length;

            // Run a loop for printing all 2^n
            // subsets one by one
            for (int i = 0; i < (1 << n); i++) {
                System.out.print("{ ");

                // Print current subset
                for (int j = 0; j < n; j++) {

                    // (1<<j) is a number with jth bit 1
                    // so when we 'and' them with the
                    // subset number we get which numbers
                    // are present in the subset and which
                    // are not
                    if ((i & (1 << j)) > 0) {
                        System.out.print(arr[j] + " ");
                    }
                }

                System.out.println("}");
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};
            findSubsets(arr);
        }
    }
//where n is the length of the given array

//Time Complexity: O(2^n),
// as for each element there are two possibilities, either to include it or exclude it,
// for n elements there will be 2^n possible subsets.

//Space Complexity: O(n), as an array of size n is used to store the subset elements.