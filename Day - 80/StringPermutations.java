import java.util.*;

public class StringPermutations {

    // Function to generate all permutations
    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        permute(str.toCharArray(), 0, result);
        return result;
    }

    // Recursive helper function
    private static void permute(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);             // swap current with i
            permute(chars, index + 1, result); // recurse
            swap(chars, index, i);             // backtrack
        }
    }

    // Swap function
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    // Main driver
    public static void main(String[] args) {
        // Test Case 01
        String str1 = "XY";
        System.out.println("Input: " + str1);
        System.out.println("Output: " + generatePermutations(str1));

        // Test Case 02
        String str2 = "";
        System.out.println("Input: \"" + str2 + "\"");
        System.out.println("Output: " + generatePermutations(str2));

        // Test Case 03
        String str3 = "P";
        System.out.println("Input: " + str3);
        System.out.println("Output: " + generatePermutations(str3));
    }
}
