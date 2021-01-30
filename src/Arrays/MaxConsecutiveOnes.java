package Arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int p1 = -1;
        int size = nums.length;
        if (size == 1) {
            if (nums[0]==1)
                return 1;
            else
                return 0;
        }
        for (int i=0; i<size; i++) {
            if (nums[i]==1 && p1 == -1) {
                p1 = i;
            } else if ( nums[i]==0 && p1 != -1) {
                if ((i - p1)>max) {
                    max = i - p1;
                }
                p1 = -1;
            }
            if (i == size-1) {
                if (p1!=-1 && (i - p1)>=max) {
                    max = (i+1) - p1;
                }
            }
        }
        return max;
    }

    public int findMaxConsecutiveOnes2(int[] nums) {
        int result = 0;
        int count = 0;

        for (int i=0; i < nums.length; i++) {

            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
                result = Math.max(result, count);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes2(arr));
    }
}
