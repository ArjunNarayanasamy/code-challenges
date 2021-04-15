package Arrays.string;

import java.util.Hashtable;

/**
 * Implement an algorithm to determine if a string has all unique characters
 */
public class IsUniqueCharacters_1_1 {

    // brute force O(n^2); space O(1)
    public static boolean isUnique(String input) {
        String ip = input.toLowerCase();
        int length = input.length();
        for(int i=0; i<length; i++) {
            for (int j=i+1; j<length; j++) {
                if (ip.charAt(i) == ip.charAt(j))
                    return false;
            }
        }
        return true;
    }

    // using hash table O(n), space O(1)
    public static boolean isUnique1(String input) {
        int length = input.length();
        String ip = input.toLowerCase();
        Hashtable<Character, Integer> occurance = new Hashtable<>();
        for (int i=0; i<length; i++) {
            Character c = ip.charAt(i);
            if (occurance.containsKey(c) && occurance.get(c) == 1)
                return false;
            else
                occurance.put(c, 1);
        }
        return true;
    }

    // use bit vector O(n)
    public static boolean isUniqueUsingBitVector(String input) {
        int[] bitVector = new int[26];
        String ip = input.toLowerCase();
        for (int i=0; i<ip.length(); i++) {
            int index = ip.charAt(i) - 'a';
            if (bitVector[index] == 1)
                return false;
            else
                bitVector[index] = 1;
        }
        return true;
    }

    public static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChars("Arjuna"));
    }
}
