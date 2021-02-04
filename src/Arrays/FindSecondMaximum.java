package Arrays;

public class FindSecondMaximum {

    //O(n)
    public static int findSecondMaxi(int[] arr) {
        int max = arr[0] > arr[1] ? arr[0] : arr[1];
        int sMax = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            } else if (arr[i]>sMax && arr[i] != max) {
                sMax = arr[i];
            }
        }
        return sMax;
    }

    public static void main(String[] args) {
        int[] arr = {9,2,3,6, 1, 2, 3, 8, 2};
        System.out.println(findSecondMaxi(arr));
    }
}
