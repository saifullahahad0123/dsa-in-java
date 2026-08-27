
import java.util.*;

public class bubble {

    public static void main(String[] args) {

        int[] arr = {1, 2,3,4,56};

        int n = arr.length-1;
      
        for(int i = 0; i< n ; i++){
              boolean isSorted = true;
        for(int j = 0 ; j <n; j++ ){
            if(arr[j]>arr[j+1]){
                isSorted = false;
                break;
            }

        }
        if(isSorted == true){
            break;
        }
            for(int j = 0; j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                 }
            }
        }
     
       for(int ele : arr){
         System.out.print(ele + " ");
       } 

    }
}



