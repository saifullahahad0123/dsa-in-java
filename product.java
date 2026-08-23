import java.util.*;
public class product{
    public static void main(String[] args){
        
            int[] arr =  {1, 3,4};
         int mul = 1;
        for(int i = 0 ; i<arr.length; i++){
            mul *= arr[i];
        }
         System.out.println(mul);
    }
}

