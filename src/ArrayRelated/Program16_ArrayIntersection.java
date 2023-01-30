//find intersection of two non repeated sorted arrays
//Intersection means elements which are common in both the arrays

package ArrayRelated;

public class Program16_ArrayIntersection {
    public static void findIntersection(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[]args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7};
        findIntersection(arr1,arr2);
    }

}

//The time complexity of the above program is O(m + n), where m and n are the lengths of the two arrays.
// This is because in the worst case scenario, the while loop runs m + n times, once for each element in the two arrays.
//
// The space complexity of the above program is O(1),
// as the solution only uses a few extra variables to store intermediate values, and does not create any new data structures.