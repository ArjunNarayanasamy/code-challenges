package Arrays;

public class NumsWithEvenDigit {

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i=0; i< nums.length; i++) {
            if(countDigits(nums[i]) %2 == 0) {
                result++;
            }
        }
        return result;
    }

    public int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num/10;
            count++;
        }
        return count;
    }
}
