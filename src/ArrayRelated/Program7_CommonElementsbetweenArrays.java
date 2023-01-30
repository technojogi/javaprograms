//Common Elements between Arrays

package ArrayRelated;

public class Program7_CommonElementsbetweenArrays {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {3, 4, 5, 6, 7};

            System.out.println("Common elements in both arrays: ");
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.print(arr1[i] + " ");
                    }
                }
            }
        }
    }


//Time complexity
//The time complexity of this solution is O(n^2), as for each element of the first array,
// the program checks all the elements of the second array.

//Space Complexity
//The space complexity of the above program is O(n), where n is the maximum of the length of two arrays.
// The reason for this is that the program creates two arrays of size n, and it uses a hash set to store the elements of one array.
// The size of the hash set would be equal to the number of unique elements in the array,
//which can be at most n. Hence, the space complexity of the program is O(n)