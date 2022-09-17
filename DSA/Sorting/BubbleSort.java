// "static void main" must be defined in a public class.
package Sorting;
import java.util.Scanner;
public class BubbleSort {
    
    static void bubbleSort(int arr[])
    {
        if(arr == null || arr.length<=1)
        {
            return;
        }
        
        int n = arr.length;
        
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
        
        //print the array;
        static void printArray(int[] arr)
        {
            for(int i =0;i<arr.length-1;i++)
            { 
                System.out.print(arr[i]+" ");
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        bubbleSort(arr);
        printArray(arr);
    }
}