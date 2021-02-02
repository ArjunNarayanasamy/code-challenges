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
    public static int[] findProduct(int arr[])
    {
        int n = arr.length;
        int i, temp = 1;

        // Allocation of result array
        int result[] = new int[n];

        // Product of elements on left side excluding arr[i]
        for (i = 0; i < n; i++)
        {
            result[i] = temp;
            temp *= arr[i];
        }

        // Initializing temp to 1 for product on right side
        temp = 1;

        // Product of elements on right side excluding arr[i]
        for (i = n - 1; i >= 0; i--)
        {
            result[i] *= temp;
            temp *= arr[i];
        }

        return result;
    }
    public static String arrayToString(int arr[]){
        if (arr.length > 0){
            String result = "";
            for(int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        }
        else {
            return "Empty Array!";
        }
    }


    public static void main(String[] args) {

/*        int[] arr = {1, 2, 3, 4, 0};
        printArr(prodArray(arr));*/
        int[] arr =  {1, 2, 3, 4};

        System.out.println("Array before product: " + arrayToString(arr));

        int[] prodArray = findProduct(arr);

        System.out.println("Array after product: " + arrayToString(prodArray));
    }

    public static void printArr(int[] arr) {
        for(int e:arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
