//A palindrome array is an array whose elements, when read from left to right and from right to left, are the same.
// It is a sequence of elements that is symmetrical about a central element.

package ArrayRelated;

public class Program8_Arraypalindrome {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 1};
            System.out.println(isPalindrome(arr));
        }

        private static boolean isPalindrome(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n/2; i++) {
                if (arr[i] != arr[n - i - 1]) {
                    return false;
                }
            }
            return true;
        }
    }

//Time complexity
//The time complexity of the above program is O(n/2), as it checks only half of the elements in the array.

//Space Complexity
//The space complexity is O(1), as the program uses a constant amount of space, regardless of the size of the array.