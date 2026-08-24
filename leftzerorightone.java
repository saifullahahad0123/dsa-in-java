
import java.util.*;

public class leftzerorightone {

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 0};

        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {

            // Move i forward while it is already 0
            while (i < j && arr[i] == 0) {
                i++;
            }

            // Move j backward while it is already 1
            while (i < j && arr[j] == 1) {
                j--;
            }

            // Swap 1 on left with 0 on right
            if (i < j) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        // Print complete array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}

