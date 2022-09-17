package Searching;
import java.util.*;
public class Linear_Search {

    static int linearSearch(int[] arr,int target)
    {

        // corner case
        if(arr == null || arr.length<= 0){
            return -1;
        }

        // searching the key element 
        for(int i =0;i<arr.length;i++)
        {
            int element = arr[i];
            if(element == target)
            {
                return i;
            }

        }
        return -1;
    }
    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
          int target = sc.nextInt();

        int index = linearSearch(arr,target);
        System.out.println(index);
    }
}
