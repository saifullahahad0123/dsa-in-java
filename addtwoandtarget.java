
import java.util.*;

public class addtwoandtarget {

    public static void main(String[] args) {

        int[] arr = {1, 22, 3, 4, 6, 7};

        int n = arr.length;

        int target = 9;

        // Array must be sorted for two-pointer approach
        Arrays.sort(arr);

        int i = 0;
        int j = n - 1;

        while (i < j) {

            int sum = arr[i] + arr[j];

            if (sum == target) {

                System.out.println(
                    arr[i] + " + " + arr[j] + " = " + target
                );

                break;
            }

            else if (sum > target) {
                j--;
            }

            else {
                i++;
            }
        }
    }
}

