package Arrays.palindrome;

/**
 * Minimum removals required such that a string can be rearranged to form a palindrome
 * string will be lower case english alphabets
 */
public class MinimumRemovalToMakePalindrome {

    public static int NO_OF_CHARS = 26; //since only lowercase letters
    public static int noOfRemoval(final String input) {
        int[] freqArray = new int[NO_OF_CHARS];

        // store frequency of chars
        for(int i=0; i<input.length(); i++) {
            freqArray[(int)input.charAt(i) - 'a']++; //**key** storing a at index[0] amd so on
        }

        int oddCount = 0;
        for (int i=0; i<NO_OF_CHARS; i++) {
            if (freqArray[i]%2 != 0) oddCount++;
        }
        // If odd frequency letters 0, 1 then no removal needed, else return count-1
        if (oddCount < 2)
            return 0;
        else
            return oddCount-1;
    }

    public static void main(String[] args) {
        System.out.println(noOfRemoval("ababccca")); //1
        System.out.println(noOfRemoval("abcde")); //4
    }
}
