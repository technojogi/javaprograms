//Quick sort is a divide and conquer algorithm for sorting elements of an array.
// It selects a pivot element from the array and partition the other elements around it such that elements less than the
// pivot are to its left and elements greater than pivot are to its right. The pivot element is then placed at its final position
// in the sorted array. Then, quick sort is recursively applied on the left and right sub-arrays to sort them.
// Quick sort has an average case time complexity of O(n*log n), making it a popular choice for sorting large data sets.

//Below program details:
//The given program implements the QuickSort algorithm to sort an array of integers in ascending order.
// The basic idea behind QuickSort is to choose a pivot element from the array and partition the other elements into two sub-arrays,
// according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively by the same algorithm.

//The QuickSort algorithm starts by calling the "quickSort" method and passing
// it the array to be sorted and the start and end indices of the array.
// The method then selects a pivot element and partitions the array around it.
// This is done by calling the "partition" method and passing it the array, start and end indices, and the pivot.

//The "partition" method uses two pointers, "i" and "j", to traverse the array.
// The pointer "i" starts at the start index and moves towards the end index, while the pointer "j" starts at the end index
// and moves towards the start index. If the element at "i" is less than or equal to the pivot, "i" is incremented.
// If the element at "j" is greater than the pivot, "j" is decremented. If "i" is less than or equal to "j", the elements at "i" and "j"
// are swapped. This continues until "i" and "j" cross each other.

//Once the partition is complete, the elements to the left of the pivot are less than or equal to the pivot,
// and the elements to the right of the pivot are greater than the pivot. The "quickSort" method is then called
// recursively on the two partitions, until the partitions have a length of 0 or 1.

//The time complexity of the QuickSort algorithm is O(n log n) on average, and O(n^2) in the worst case.
// The space complexity is O(log n) in the best and average case, and O(n) in the worst case.



package ArrayRelated;
import java.util.Arrays;
public class Program6_ArrayQuickSort {
        public static void main(String[] args) {
            int[] arr = {10, 7, 8, 9, 1, 5};
            int len = arr.length;

            quickSort(arr, 0, len - 1);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }

        private static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pivot = partition(arr, low, high);
                quickSort(arr, low, pivot - 1);
                quickSort(arr, pivot + 1, high);
            }
        }

        private static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }
    }


//Time complexity
//The time complexity of the QuickSort algorithm is O(n log n) on average, and O(n^2) in the worst case.

//Space Complexity
//The space complexity is O(log n) in the best and average case, and O(n) in the worst case.
