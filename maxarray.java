import java.util.*;
public class maxarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int[] arr =  {1,22, 3,4,6,7};
         int max =  arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
         System.out.println(max);
    }
}

