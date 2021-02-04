package Arrays;

public class RearrangePositiveNegative {

    public static int[] rearrange(int[] arr) {
        int p1 = 0;
        int p2 = arr.length-1;

        while(p1<p2) {
            if (arr[p1] < 0)
                p1++;
            if (arr[p2] > 0)
                p2--;
            if (arr[p1] > 0 && arr[p2] < 0)
                swap(arr, p1, p2);
        }
        return arr;
    }

    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        printArr(rearrange(arr));
    }

    public static void printArr(int[] arr) {
        for(int e: arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
