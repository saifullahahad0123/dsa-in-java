import java.util.*;
public class sumarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int[] arr =  {1, 3,4};
         int sum = 0;
        for(int i = 0 ; i<arr.length; i++){
            sum += arr[i];
        }
         System.out.println(sum);
    }
}

