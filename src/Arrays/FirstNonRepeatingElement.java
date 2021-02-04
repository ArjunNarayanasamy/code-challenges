package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

    public static int firstUniqueElement(int[] arr) {
        int size = arr.length;
        int counter = 0;
        Map<Integer, Boolean> tracker = new HashMap<>();
        for (int i=0; i<size; i++) {
            for (int j=i+1; j<size; j++) {
               if (!tracker.containsKey(arr[i])) {
                   if (arr[i] == arr[j]) {
                       counter++;
                       tracker.put(arr[i], true);
                       break;
                   }
               } else {
                   counter =1;
               }
            }
            if (counter==0)
                return arr[i];
            counter = 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 9, 3, 2,  6, 6, 9, 3, 1};
        System.out.println(firstUniqueElement(arr));
    }
}
