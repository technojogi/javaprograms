// find given element present in array

package ArrayRelated;

public class Program22_ArrayFindElement {
    public static boolean isElementPresent(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 3;
        if (isElementPresent(arr, element)) {
            System.out.println(element + " is present in the array.");
        } else {
            System.out.println(element + " is not present in the array.");
        }
    }
}

//The time complexity of this program is O(n) as we are looping through the array only once.
// The space complexity is O(1) as we are not using any extra space except the loop variable and a boolean flag