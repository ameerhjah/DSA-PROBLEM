package Searching;
import java.util.*;

public class Search_In_Range {

    static int search_Range(int[] arr,int target,int start,int end)
    {

        // corner case
        if(arr == null || arr.length<= 0){
            return -1;
        }

        // searching the key element 
        for(int i =start;i<=end;i++)
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
        int start = sc.nextInt();
        int end = sc.nextInt();

        int index = search_Range(arr,target,start,end);
        System.out.println(index);

    }
}
