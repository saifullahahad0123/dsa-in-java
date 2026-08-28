import java.util.*;

public class union {
    public static void main(String[] args) {

        int[] arra = {1, 2, 3, 4, 6};
        int[] arrb = {1, 3, 6, 7};

        ArrayList<Integer> ans = new ArrayList<>();

        int na = arra.length;
        int nb = arrb.length;

        int i = 0;
        int j = 0;

        // Compare both arrays
        while (i < na && j < nb) {

            if (arra[i] == arrb[j]) {
                ans.add(arra[i]);
                i++;
                j++;
            }
            else if (arra[i] < arrb[j]) {
                ans.add(arra[i]);
                i++;
            }
            else {
                ans.add(arrb[j]);
                j++;
            }
        }

        // Remaining elements of arra
        while (i < na) {
            ans.add(arra[i]);
            i++;
        }

        // Remaining elements of arrb
        while (j < nb) {
            ans.add(arrb[j]);
            j++;
        }

        // Print union
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}