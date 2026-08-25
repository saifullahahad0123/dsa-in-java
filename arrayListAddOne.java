
import java.util.*;

public class arrayListAddOne{

    public static void main(String[] args) {

        int[] arr = {9,9,9,9};
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length-1;
        int carry = 1;
        for(int i=n;i>=0;i--){
            if(arr[i]+carry <= 9){
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
            
            
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        for(int ele : ans ){
            System.out.print(ele);
        }


    }
}

