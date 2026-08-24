
import java.util.*;

public class reverse{

    public static void main(String[] args) {

        int[] arr = {1, 22, 3, 4, 6, 7};
       int n = arr.length;
       int i = 0;
       int j = n - 1;

       while (i<j) {
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j]  = temp;
        i++;
        j--;

       }

for ( int ele : arr) System.out.print(ele+ " ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}

