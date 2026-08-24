
import java.util.*;

public class addtwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int[] arr = {1, 3, 4, 2, 4, 2};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println(
                        "Indices: " + i + " and " + j
                    );

                    System.out.println(
                        "Values: " + arr[i] + " + " + arr[j]
                    );
                }
            }
        }

        sc.close();
    }
}
