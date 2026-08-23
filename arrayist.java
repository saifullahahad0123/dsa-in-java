import java.util.*;
public class arrayist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     int[] arr = new int[10];

     for(int i = 0 ; i<=9 ; i++){
        arr[i] = sc.nextInt();
     }

       for(int i = 0 ; i<=9; i++){
        System.out.print(arr[i]);
     }

     System.out.println(arr[9]);

    }
}
