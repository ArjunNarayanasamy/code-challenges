package Arrays;

public class FindSmallest {

    public static int smallest(int[] arr) {
        int low = arr[0];
        for (int i=1;i<arr.length; i++) {
            if(arr[i]<low) {
                low = arr[i];
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {9, -23, 55, 1, 0, 3};
        System.out.println(smallest(arr));
    }
}
