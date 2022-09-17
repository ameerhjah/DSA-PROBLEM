import java.util.*;
public class QuickSort {

    public static int partition(int[] arr,int low,int high)
    {
        int pivot = arr[high];
        int i = low -1;

        for(int j =low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }

    static void quickSort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pivotIndx = partition(arr,low,high);

            quickSort(arr, low, pivotIndx-1);
            quickSort(arr, pivotIndx+1, high);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        quickSort(arr,0,n-1);

        for(int num : arr)
        {
            System.out.print(num+" ");
        }
    }
}
