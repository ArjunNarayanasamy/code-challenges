package sorting;

public class SelectionSort {

    /**
     * swaps elements in index i, j
     * @param arr
     * @param i
     * @param j
     */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Takes an int array and returns the lowest element index
     * from given start index
     * @param arr
     * @param start
     * @return
     */
    private int findLowElementIndex(int[] arr, int start) {
        int low = start;
        for (int i=start; i<arr.length; i++) {
            if (arr[i] < arr[low]) {
                low = i;
            }
        }
        return low;
    }

    public void selectionSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int low = findLowElementIndex(arr, i);
            swap(arr, i, low);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 15, 4, 1, 66, 9, 3, 7, 5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);

        for(int e:arr) {
            System.out.print(e+",");
        }
    }
}
