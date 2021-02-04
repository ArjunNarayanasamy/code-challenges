package Arrays;

public class RearrangeMaxMin {

    public static int[] rearrangeMaxMin(int[] arr) {
        int i=0; int j = arr.length-1;
        int[] res = new int[arr.length];
        int count = 0;
        while(i<j) {
            res[count] = arr[j];
            j--;
            count++;
            res[count] = arr[i];
            i++;
            count++;
        }
        if(arr.length%2 != 0) {
            res[count] = arr[(arr.length/2)];
        }

        return res;
    }

    //Implement best soln

    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4, 5, 6};
        printArr(rearrangeMaxMin(arr));
    }

    public static void printArr(int[] arr) {
        for(int e: arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
