package Arrays;

public class FIndNumsThatAdduptoN {

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l-1;
        for(int j=l; j<h; j++) {
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

    //sort using quick sort
    public static void sort(int[] arr, int l, int h) {
        if(l<h) {
            int pi = partition(arr, l, h);
            sort(arr, 0, pi-1);
            sort(arr, pi+1, h);
        }

    }

    // n log(n)
    public static int[] findSum(int[] arr, int n) {
        sort(arr, 0, arr.length-1);
        int i = 0, j=arr.length-1;
        while(i<j) {
            if(arr[i]+arr[j]>n)
                j--;
            else if(arr[i]+arr[j]<n)
                i++;
            else if(arr[i]+arr[j] == n)
                return new int[] {arr[i], arr[j]};
        }
        return new int[] {-1, -1};
    }

    //O(n2)
    public static int[] findSumBruteForce(int[] arr, int n)
    {
        int[] result = new int[2];
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]+arr[j]==n) {
                    return new int[] {arr[i], arr[j]};
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        printArr(findSumBruteForce(arr, 27));
        printArr(findSum(arr, 27));
    }

    public static void printArr(int[] arr) {
        for(int e:arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
