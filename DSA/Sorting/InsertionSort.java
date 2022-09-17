
import java.util.*;
class InsertionSort{
    
    static void insertionSort(int[] arr)
    {
        // logic for insertion sort
        int n = arr.length;
        if(arr == null || n <=0)
            return ;
        for(int i =1;i<n;i++)
        {
            int key = arr[i];
            int j = i-1;
            while( j>0 && arr[j+1]<arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    // printing the sorted array elements
    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
    //Main function...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
       insertionSort(arr);
        printArray(arr);
    }
}