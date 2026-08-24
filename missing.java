
import java.util.*;
public class missing{
    public static void main(String[] args){
       
        int[] arr =  {1,2,6,3,4,5};
        int sum = 0;
        int n = arr.length + 1;
         int y = (n * (n+1))/2;
        for(int i = 0 ; i<arr.length; i++){
            sum += arr[i];

        }
        
        int x = y- sum;
        
         System.out.println(x);
    }
}

