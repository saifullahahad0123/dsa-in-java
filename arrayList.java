

import java.util.*;

public class arrayList{

    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(10);
       arr.add(20);
       arr.add(3);
       System.out.println(arr);

       arr.set(2, 2);
       int n = arr.size();
       for(int ele : arr){
        System.out.println(ele);
       }
       
    }
}

