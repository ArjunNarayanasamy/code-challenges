package Arrays;

public class MergeTwoSortedArrays {

    public static int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length+a2.length];
        int p1 = 0;
        int p2 = 0;
        int counter = 0;
        while(p1 < a1.length && p2 < a2.length) {
            if(a1[p1]<a2[p2]) {
                result[counter] = a1[p1];
                counter++;
                p1++;
            } else {
                result[counter] = a2[p2];
                counter++;
                p2++;
            }
        }
        if(p1 >= a1.length) {
            for(int i=p2; i<a2.length; i++) {
                result[counter] = a2[i];
                counter++;
            }
        } else if (p2 >= a2.length) {
            for(int i=p1; i<a1.length; i++) {
                result[counter] = a1[i];
                counter++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1,3,5,7,9};
        int[] a2 = {2,4,6,8,10, 12, 14, 16, 18};
        int[] result = merge(a1, a2);
        for (int e:result) {
            System.out.print(e+"|");
        }
    }
}
