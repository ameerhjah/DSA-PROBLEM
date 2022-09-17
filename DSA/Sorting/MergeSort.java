import java.util.*;
public class MergeSort {

    public static void merge(int[] arr,int low,int mid,int high)
    {
        int[] merged = new int[high -low+1];

        int pointer1 = low;
        int pointer2 = mid+1;
        int x =0;

        while(pointer1<= mid && pointer2<=high)
        {
            if(arr[pointer1]<=arr[pointer2])
            {
                merged[x++] = arr[pointer1++];
            }
            else{
                merged[x++] = arr[pointer2++];
            }
        }

        while(pointer1 <= mid)
        {
            merged[x++] = arr[pointer1++];
        }
        while(pointer2<=high)
        {
            merged[x++] = arr[pointer2++];
        }

        for(int i =0,j = low;i<merged.length;i++,j++)
        {
            arr[j] = merged[i];
        }
    }

    public static void mergeSort(int[] arr,int low,int high)
    {
        if(low>= high)
        return;

        int mid = low + (high -low)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);

    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr,0,n-1);

        for(int num : arr)
        {
            System.out.print(num+" ");
        }
    }
}
