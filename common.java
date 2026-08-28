import java.util.*;

public class common {
    public static void main(String[] args) {

        int[] arra = {1, 3, 2, 3, 5};
        int[] arrb = {3, 5, 1, 3};

        Arrays.sort(arra);
        Arrays.sort(arrb);

        ArrayList<Integer> ans = new ArrayList<>();

        int na = arra.length;
        int nb = arrb.length;

        int i = 0;
        int j = 0;

        while (i < na && j < nb) {

            if (arra[i] == arrb[j]) {
                ans.add(arra[i]);

                i++;
                j++;
            }
            else if (arra[i] < arrb[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}