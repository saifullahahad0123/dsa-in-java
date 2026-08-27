
public class zeroatlast {

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 3, 0, 5, 0};

        int i = 0;

        for (int j = 0; j < arr.length; j++) {

        
            if (arr[j] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}

