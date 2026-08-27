
import java.util.*;

public class addTwoArray {

    public static void main(String[] args) {

        int[] arra = {1, 3, 4};
        int[] arrb = {1, 2,9,4};

        ArrayList<Integer> ans = new ArrayList<>();

        int na = arra.length;
        int nb = arrb.length;

        int i = na - 1;
        int j = nb - 1;

        int carry = 0;

        
        while (i >= 0 && j >= 0) {

            int sum = arra[i] + arrb[j] + carry;

            ans.add(sum % 10);

            carry = sum / 10;

            i--;
            j--;
        }

        
        while (i >= 0) {

            int sum = arra[i] + carry;

            ans.add(sum % 10);

            carry = sum / 10;

            i--;
        }

        while (j >= 0) {

            int sum = arrb[j] + carry;

            ans.add(sum % 10);

            carry = sum / 10;

            j--;
        }


        if (carry > 0) {
            ans.add(carry);
        }
        Collections.reverse(ans);


        for (int ele : ans) {
            System.out.print(ele);
        }
    }
}

