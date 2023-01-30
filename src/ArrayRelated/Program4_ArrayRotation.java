// Rotate an array by 'k' elements
/*
Rotating an array by k elements means shifting the elements of the array to the right by k positions.
For example, given an array [1, 2, 3, 4, 5] and k=2, rotating the array by k elements would result in the new array [4, 5, 1, 2, 3].
Here, the first two elements of the original array [1, 2] have been shifted to the end of the array, and the remaining elements [3, 4, 5] have been moved forward by k positions.
This operation is commonly used to rotate the elements of an array to the right, but it can also be used to rotate the elements to the left by rotating the array in the opposite direction.
*/
package ArrayRelated;

import java.util.Arrays;

public class Program4_ArrayRotation {

    public static void rotateArray(int[] arr, int k) {

        //Calculate the length od an Array
        int n = arr.length;
        System.out.println("Length of an array is : "+n);

        //if the length of the array is 5 and k is 7, then k % n would be 2.
        // This means that rotating the array by 7 elements is the same as rotating it by 2 elements,
        // As both operations result in shifting the elements of the array 2 positions to the right.
        //By using k = k % n;, the program ensures that k is always less than n, so that the rotation can be performed correctly,
        // regardless of the value of k.

        //Calculating the remainder value due to above reason
        k = k % n;
        System.out.println("Array to be shifted by "+k+" positions");

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start =start+1;
            end=end-1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateArray(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
/*

 The time complexity of this program is O(n) and the space complexity is O(1).

//TIme complexity
 The three reverse operations take O(n) time, so the overall time complexity is O(n).

 //Space Complexity
 The program is rotating the elements of the array in place, which means that it is only using a constant amount of extra memory.

 */
