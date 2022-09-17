
import java.util.*;
public class SelectionSort {

    static void swap(int[] arr,int smallest,int i)
    {
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }

    static void selectionSort(int[] arr)
    {

        //corner case
        if(arr == null || arr.length<=0)
        {
            return;
        }

        int n = arr.length;

        for(int i =0;i<n;i++)
        {
            int smallest = i;
            for(int j = i+1;j<n;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest = j;
                }
            }
            if( smallest != i)
            {
                swap(arr,smallest,i);
            }
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        selectionSort(arr);
        for(int num : arr)
        {
            System.out.print(num+" ");
        }
    }
    
}
