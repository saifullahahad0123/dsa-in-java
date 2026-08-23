import java.util.*;
public class minarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int[] arr =  {1,22, 3,4,6,7};
         int min =  arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
         System.out.println(min);
    }
}

