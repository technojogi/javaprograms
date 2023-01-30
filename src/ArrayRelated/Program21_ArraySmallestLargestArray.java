// largest and smallest number in unsorted array

package ArrayRelated;

public class Program21_ArraySmallestLargestArray {
    public static void main(String[] args) {
        int[] arr = {45, 67, -23, 90, 0, 123, 8, 34};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}

//The time complexity of this program is O(n), where n is the number of elements in the array.
// The space complexity is O(1), as we only need a few variables to store the max and min values.
