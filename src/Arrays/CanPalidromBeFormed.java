package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Given a string, Check if characters of the given string can be rearranged to form a palindrome.
 */
public class CanPalidromBeFormed {

    //Brute force, O(n*2)
    private static boolean canFormPalidromeBF(String input) {
        int numOfOddElements = 0;
        for (int i = 0; i < input.length(); i++) {
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == input.charAt(i)) {
                    count++;
                }
            }
            if (count % 2 != 0) numOfOddElements++;
            if (numOfOddElements > 1) return false;
        }

        return true;
    }

    //using countArray of size ASCII char count 256
    //time complexity O(1)
    public static int NO_OF_CHARS = 256;

    private static boolean canFormPalindromeOptimal(String input) {
        int[] countArray = new int[NO_OF_CHARS];
        int oddCount = 0;
        for (int i = 0; i < input.length(); i++) {
            countArray[(int) input.charAt(i)]++;
        }
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if (countArray[i] % 2 != 0) oddCount++;
            if (oddCount > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canFormPalidromeBF("malayalam")); // true
        System.out.println(canFormPalidromeBF("amotma")); // false
        System.out.println(canFormPalidromeBF("woow")); //true
        System.out.println("****");
        System.out.println(canFormPalindromeOptimal("malayalam")); // true
        System.out.println(canFormPalindromeOptimal("amotma")); // false
        System.out.println(canFormPalindromeOptimal("woow")); //true
    }

}
