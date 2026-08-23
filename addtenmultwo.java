
import java.util.*;

public class addtenmultwo{

    public static void main(String[] args) {

        int[] arr = {1, 22, 3, 4, 6, 7};

       

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                System.out.print(arr[i]+10+ " ");
            }
            else{
                System.out.print(arr[i]*2+" ");
            }
        }
    }
}
