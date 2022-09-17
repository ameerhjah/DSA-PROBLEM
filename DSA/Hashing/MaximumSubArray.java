package Hashing;

public class MaximumSubArray {
    
    // static int findSum(int[] arr,int i,int j)
    // {
    //     int sum =0;
    //     for(int k = i;k<=j;k++)
    //     {
    //         sum += arr[k];
    //     }
    //     return sum;
    // }

    static int findLongestSubarray(int[] arr,int k)
    {
        int n = arr.length;

        int max  =0;
        for(int i =0;i<n;i++)
        {
          //  int start = arr[i];
            int sum =0;
            for( int j = i;j<n;j++)
            {
               // int end = arr[j];
                sum +=arr[j]; // int sum =  compute(arr,i,j);
                if(sum == k)
                {
                    max = Math.max(max,j-i+1);
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = { 10,5,2,7,1,9} ;

        int k = 15;

        System.out.println(findLongestSubarray(arr,k));
    }
}
