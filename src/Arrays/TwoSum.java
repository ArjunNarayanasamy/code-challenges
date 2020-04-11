package Arrays;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Brute force O(n^2)
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length;i++) {
            for(int j=i+1; j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // Using HashMap two pass O(n) with 2 traversal
    // Trade off space for time
    public int[] twoSumTwoPassHashMap(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap();
        for (int i=0; i<nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(hm.containsKey(complement) && hm.get(complement)!=i) {
                return new int[] {i, hm.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // Using HashMap one pass O(n) with 1 traversal
    public int[] twoSumOnePassHashMap(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap();
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (hm.containsKey(complement)) {
                return new int[] {hm.get(complement), i};
            }
            hm.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] a = {2, 11, 15, 7};
        TwoSum s = new TwoSum();
        int[] b = s.twoSumOnePassHashMap(a, 9);
        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }
    }
}
