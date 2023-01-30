// kth smallest/largest element in unsorted array

package ArrayRelated;
import java.util.Arrays;

public class Program14_ArrayKthSmallestLargest{
    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;
        System.out.println("Kth smallest element is: " + findKthSmallest(arr, k));
        System.out.println("Kth largest element is: " + findKthLargest(arr, k));
    }
}

//Time Complexity
//The time complexity of the program is O(nlogn),
// because it uses the QuickSort algorithm which has a time complexity of O(nlogn) in average case.

//Space Complexity
// The space complexity is O(n), because the QuickSort algorithm requires extra space for the recursive calls and temporary variables.
// The use of an auxiliary array for storing the sorted elements also contributes to the space complexity.