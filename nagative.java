import java.util.*;
public class nagative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr =  {-1, 3,-4, 7, -8};

        for(int i = 0 ; i<=arr.length; i++){
            if(arr[i] <0) {
                System.err.println(arr[i]);
            }
        }
  
    }
}

