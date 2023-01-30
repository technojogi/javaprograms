//Find subsets with sum value as given as an input
package ArrayRelated;

public class Program12_ArrayFindSubsetwithspecificsum {
        static int count = 0;

        static void subset_sum(int set[], int subset[], int subset_size, int sum, int target_sum, int node_count) {
            if (target_sum == sum) {
                System.out.print("Subset" + (++count) + ": [ ");
                for (int i = 0; i < subset_size; i++) {
                    System.out.print(subset[i] + " ");
                }
                System.out.println("]");
                return;
            }

            if (node_count == set.length) {
                return;
            }

            // Generate nodes (subsets) including the next element
            subset[subset_size] = set[node_count];
            subset_sum(set, subset, subset_size + 1, sum + set[node_count], target_sum, node_count + 1);

            // Generate nodes (subsets) excluding the next element
            subset_sum(set, subset, subset_size, sum, target_sum, node_count + 1);
        }

        public static void main(String args[]) {
            int set[] = { 3, 34, 4, 12, 5, 2 };
            int target_sum = 9;
            int n = set.length;
            int subset[] = new int[n];

            subset_sum(set, subset, 0, 0, target_sum, 0);
        }
    }
/*
The time complexity of the above program is O(2^n) as we are generating all subsets of the given array.
The space complexity is O(n) as we are using an array of size n to store the subset.
 */