import java.util.*;
public class deepcopy{
    public static void main(String[] args){
        
            int[] arr =  {1,22, 3,4,6,7};
            int[] y = Arrays.copyOf(arr, 10);
            y[2] = 20;
            System.out.println(y[2]);
    }
}

