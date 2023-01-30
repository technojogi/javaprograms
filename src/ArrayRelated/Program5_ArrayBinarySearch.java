//Binary Search: This is an efficient search method for
//sorted arrays where the array is divided into two halves and the
// search continues in the half that contains the desired element.

package ArrayRelated;
import java.util.Arrays;

public class Program5_ArrayBinarySearch {
        //Creating main method
        public static void main(String[] args){

            //Creating new Array
            int[] arr = {1,2,3,4,5};

            //calling function to reverse integer
            if(binarySearch(arr,4)==-1){
                System.out.println("Searched element does not exist");
            }else{
                System.out.println("Searched element exist");
            }

        }
        public static int binarySearch(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }
/*
Time Complexity
The time complexity of binary search is O(log n) because it operates by dividing the number of elements in the array in half
with each iteration of the loop. At each iteration, the size of the portion of the array being searched is reduced by half,
so the total number of iterations is logarithmic with respect to the size of the array.
The logarithmic relationship between the size of the array and the number of iterations of the loop ensures
that the time complexity of binary search remains the same even if the size of the array grows.
This is why binary search is an efficient way to search large arrays, and why it is often used as a common optimization technique in many algorithms.

*/

/*
Space Complexity
The space complexity of the binary search algorithm is O(1) because it
only requires a few variables to store intermediate values (left, right, mid) during the search, and the size of these
variables does not depend on the size of the input array. The algorithm does not create any additional data structures or arrays,
so its memory usage remains constant as the size of the input array increases.
*/