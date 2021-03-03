package Arrays;

/**
 * Given 2 strings, can second string can be made palindrome like first, which already is
 */
public class CanSecondBePalindromeLikeFirst {

    // using count arrays
    public static int NO_OF_CHARS = 256;

    public static boolean canSecondBePalindrome(final String input1, final String input2) {
        int[] countArray1 = new int[NO_OF_CHARS];
        int[] countArray2 = new int[NO_OF_CHARS];

        for (int i = 0; i < input1.length(); i++) {
            countArray1[(int) input1.charAt(i)]++;
        }

        for (int i = 0; i < input2.length(); i++) {
            countArray2[(int) input2.charAt(i)]++;
        }

        for (int i = 0; i < NO_OF_CHARS; i++) {
            if (countArray1[i] != countArray2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canSecondBePalindrome("malayalam", "amllmaaay")); // true
        System.out.println(canSecondBePalindrome("malayalam", "amllmaaayr")); // false
        System.out.println(canSecondBePalindrome("amma", "maam")); // true
    }
}
