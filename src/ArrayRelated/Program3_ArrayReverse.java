package ArrayRelated;
import java.util.Arrays;

public class Program3_ArrayReverse {
        //Creating main method
        public static void main(String[] args){

            //Creating new Array
            int[] arr = {1,2,3,4,5};

            //calling function to reverse integer
            System.out.println(Arrays.toString(reverse(arr)));

        }
        public static int[] reverse(int[] arr){

            //Length of an array
            int n =arr.length;
            System.out.println("Length of an Array is : "+n);

            //Temporary variable to store value for starting position
            int temp = 0;
                for(int i=0; i<=Math.floor(n/2); i++) {
                    temp = arr[i];
                    arr[i] = arr[n-(i+1)];
                    arr[n-(i+1)] = temp;
                }
        return(arr);
        }
    }

/*
The time complexity of the program is O(n/2), where n is the length of the array.
The program uses a for loop to reverse the elements of the array. The for loop iterates from 0 to Math.floor(n/2),
so it takes O(n/2) time to complete.Since the for loop is the only operation in the reverse method, the time complexity
of the entire program is O(n/2).*/

/*
The space complexity of the program is O(1), since it uses only a constant amount of additional memory
regardless of the size of the input array.The only additional memory used in the program is a single integer temp
to store the value of an element while swapping the elements.
Since this memory usage does not depend on the size of the input array, the space complexity is O(1).
*/









