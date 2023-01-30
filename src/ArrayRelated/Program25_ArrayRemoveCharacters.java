// remove characters from string present in another string

package ArrayRelated;

public class Program25_ArrayRemoveCharacters {
    public static String removeChars(String str, String remove) {
        int[] charSet = new int[128];
        for (int i = 0; i < remove.length(); i++) {
            charSet[remove.charAt(i)] = 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (charSet[str.charAt(i)] == 0) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "Actuality";
        String strtoremove = "Actually";
        System.out.println(removeChars(str, strtoremove));
    }
}

//The time complexity of this program is O(n) and
// space complexity is O(1) where n is the length of the first string.