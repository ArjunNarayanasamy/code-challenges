package Arrays;

/**
 * In this problem, you have to implement the int[] findProduct(int[] arr) method which will modify arr in such a way
 * that in the output, each index i will contain the product of all numbers present in arr except the number
 * that was stored on that index i.
 *
 * i/p {1,2,3,4} ; o/p {24,12,8,6}
 */
public class ProductArray {

    //O(n2)
    public static int[] prodArray(int[] arr) {
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int prod = 0;
            for(int j =0; j<arr.length; j++) {
                if (i == j)
                    continue;
                else {
                    if(prod==0)
                        prod += arr[j];
                    else
                        prod = prod * arr[j];
                }
            }
            result[i]=prod;
        }
        return result;
    }

    //O(n)
    /*
    The algorithm for this solution is to first create a new array with products of all elements
    to the left of each element, as done on lines 43-46. Then multiply each element in that array to the product of
    all the elements to the right of the array by traversing it in reverse as done on lines 50-53.
     */
    public static int[] prodArr(int[] arr) {
        int size = arr.length;
        int temp = 1;
        int[] res = new int[size];

        for (int i=0; i<size; i++) {
            res[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        for (int i=size-1; i>=0; i--) {
            res[i] *= temp;
            temp *= arr[i];
        }

        return res;
    }


    public static void main(String[] args) {

/*        int[] arr = {1, 2, 3, 4, 0};
        printArr(prodArray(arr));*/
        int[] arr =  {2, 2, 3, 4};
        printArr(arr);
        int[] prodArray = prodArr(arr);
        printArr(prodArray);
    }

    public static void printArr(int[] arr) {
        for(int e:arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
