package sorting;

public class QuickSort {


    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j=l; j<h; j++) {
            if(arr[j]<pivot) {
                i++;
                //swap arr[i] arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap arr[i+1] arr[h]
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }

    public static void sort(int[] arr, int l , int h) {
        if(l<h) {
            int pi = partition(arr, l, h);
            sort(arr, l, pi-1);
            sort(arr, pi+1, h);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70, 33, 66, 11};
        sort(arr, 0, arr.length-1);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int e:arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
