// find all pairs on integer array whose sum is equal to given number

package ArrayRelated;
import java.util.*;
public class Program20_ArrayAllpairsSumEqualsNumber {
    public static void pairSum(Integer[] arr,int sum) {

        Map<Integer, Integer> map = new HashMap();
        ArrayList<Integer> asList = new ArrayList<Integer>(Arrays.asList(arr));
        for (Integer i : asList) {
            if (i < sum && (asList.contains(sum - i) && asList.contains(i))) {
                if (!(map.containsKey(i) || map.containsValue(i)) && (sum - i != i))
                    map.put(i, sum - i);

                else if ((sum - i == i) && (Collections.frequency(asList, i) > 1)) {
                    map.put(i, sum - i);
                }
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            System.out.println("(" + next.getKey() + "," + next.getValue() + ")");
        }
    }
    public static void main(String[] args){
        Integer[] arr = {0, 6, 2, 9, 7, 2, 3, 1, 8, 4};
        int sum = 8;
        pairSum(arr,8);
    }
}

//The time complexity of the above program is O(n^2) and the space complexity is O(n).
// The time complexity is O(n^2) because of the nested loop which uses the contains method of the ArrayList class.
// The space complexity is O(n) because of the use of a HashMap to store the pairs of numbers that add up to the given sum.


