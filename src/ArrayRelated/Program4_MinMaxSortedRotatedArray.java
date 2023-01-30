// All the steps are same as in previous Program4_ArrayRotation
// Additional step will be as we shifted the sorted rotated array therefore
// minimum will be at position arr[k] & maximum will be at position arr[k-1]

package ArrayRelated;

import java.util.Arrays;

public class Program4_MinMaxSortedRotatedArray {

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

        //Additional steps from that of the previous program
        //Minimum Value in Sorted Rotated Array will be at  arr[k]
        System.out.println("Minimum Value in Sorted Rotated Array is : " + arr[2]);

        // Maximum Value in Sorted Rotated Array will be at arr[k-1]
        System.out.println("Minimum Value in Sorted Rotated Array is : " + arr[1]);
    }
}
/*
 The time complexity of this program is O(n) and the space complexity is O(1).

//TIme complexity
 The three reverse operations take O(n) time, so the overall time complexity is O(n).

 //Space Complexity
 The program is rotating the elements of the array in place, which means that it is only using a constant amount of extra memory.

 */
