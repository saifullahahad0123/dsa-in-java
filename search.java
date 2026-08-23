
import java.util.*;

public class search{

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("whisch element do you want search");
      int x =sc.nextInt();

        int[] arr = {1, 22, 3, 4, 6, 7};

        for (int i = 0; i < arr.length; i++) {
         if(x==arr[i])
            System.out.print("yes your element is prasent in this array " + x);
        
        }
        System.out.println("not prasent ");
        }
    }


 
