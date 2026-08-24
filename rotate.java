
import java.util.*;

public class rotate {

    static void rotateArray(int[] arr, int d) {

        int n = arr.length;

        d = d % n;

        // Reverse first d elements
        reverse(arr, 0, d - 1);

        // Reverse remaining elements
        reverse(arr, d, n - 1);

        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int i, int j) {

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int d = 2;

        rotateArray(arr, d);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}


