//For example, in the case of the bubble sort algorithm, each element is compared with every
// other element in the array, leading to a time complexity of O(n^2).

package ArrayRelated;

public class Program6_ArrayBubbleSort {
    // Creating main method
    public static void main(String[] args) {

        // Creating new Array
        int[] arr = {7, 5, 8, 3, 9, 4};

        // calling function to sort the array
        sortArray(arr);

        // printing sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // function to sort the array
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

//Time complexity

// This program uses a bubble sort algorithm which has a time complexity of O(n^2).
// The time complexity of O(n^2) means that the time taken by the algorithm to complete its execution is proportional
// to the square of the size of the input data. In other words, as the size of the input data increases, the time taken by the algorithm to complete its execution increases exponentially.
// This is because, in a sorting algorithm with O(n^2) time complexity, the number of operations performed by the algorithm increases quadratically with the size of the input data.
// For example, in the case of the bubble sort algorithm, each element is compared with every other element in the array, leading to a time complexity of O(n^2).

//Space Complexity
// The space complexity of this program is O(1), as it only uses a few variables to sort the array.