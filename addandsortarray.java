

import java.util.*;

public class addandsortarray{
public static void arrsaif(int[] arr)
    public static void main(String[] args) {


        int[] arra = {1,2,9,7};
        int[] arrb = {4,3,6,8,0,5};
        ArrayList<Integer> ans = new ArrayList<>();
        int na = arra.length;
        int nb = arrb.length;

        int i = 0 , j = 0;
        while(i<=na-1 && j<=nb-1){
        ans.add(arra[i]);
        ans.add(arrb[j]);
        i++;
        j++;
        }
for(int ele : ans){
    System.out.print(ele + " ");
}
    }
}

