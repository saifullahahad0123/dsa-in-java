
import java.util.*;

public class wave {

    public static void main(String[] args) {

        int[] arr = {1, 2, 9, 8, 5};
         int i = 0 , j = i+1;
         while (i<j) {
            if(arr[i]<arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j ] = temp;
                i += 2;
                j += 2;
                
            }
            
            else if(arr[i] == arr[j] || arr[i] > arr[j]){
            i+=2;
            j+=2;
            }

            if(j>= arr.length || arr.length<=i){
                break;
            }
                
            
         }
         for (int ele : arr ){
            System.out.println(ele);
         }
       
    }
    }
