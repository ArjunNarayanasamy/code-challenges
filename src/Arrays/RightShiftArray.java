package Arrays;

public class RightShiftArray {

    public static int[] rightShift(int[] arr) {
        int size = arr.length;
        if (size==1)
            return arr;
        int rightMostElement = arr[size-1];
        for(int i=size-2; i>=0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = rightMostElement;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArr(rightShift(arr));
    }

    public static void printArr(int[] arr) {
        for(int e:arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
