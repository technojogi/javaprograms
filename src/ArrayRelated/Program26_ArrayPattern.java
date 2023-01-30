//

package ArrayRelated;
public class Program26_ArrayPattern {
        public static int getValue(int index) {
            int[] arr = {1, 2, 3, 6, 9, 18, 27};
            return arr[index];
        }

        public static void main(String[] args) {
            int index = 4;
            System.out.println("The value at index " + index + " is: " + getValue(index));
        }
    }
//The time complexity of the above program is O(n) because it is performing a single iteration
// through the entire array of size n and the value of n is constant.
// The space complexity is also O(1) because it's only using a few variables of constant size.
// The program only uses a constant amount of memory regardless of the size of the input array.