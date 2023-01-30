// 2nd max no in array // top 2 largest values

package ArrayRelated;

public class Program17_Array2ndmaximum {
    public static int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args){
        int[] arr={-1,-2,3,6,3,4,9,0};
        System.out.println("2'nd Maximum number in an array is : "+findSecondLargest(arr));
    }

}
// Time complexity: O(n), as the code iterates through the array once.
// Space complexity: O(1), as the code uses only a constant amount of extra memory.