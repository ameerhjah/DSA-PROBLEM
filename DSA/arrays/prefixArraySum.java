package arrays;

import java.time.Period;

public class prefixArraySum {

    static int maxSumArray(int[] arr )
    {

        int[] prefix = new int[arr.length];

         prefix[0] = arr[0];
         //compute the prefix array
         for(int i =1;i<prefix.length;i++)
         {
                prefix[i] = prefix[i-1] + arr[i];
         }

         int maxSum = Integer.MIN_VALUE;
         int currentSum =0;
         for(int i =0;i<arr.length;i++)
         {
            int start = i;
            for(int j =i;j<arr.length;j++)
            {
                    int end = j;

                    // if start == 0,current sum = prefix[end],otherwise prfix[end] - prefix[start-1];
                currentSum = start == 0 ? prefix[end] :prefix[end] - prefix[start-1];

                if(currentSum>maxSum)
                {
                    maxSum = currentSum;
                }
         }

     }
     return maxSum;
 }
    
    public static void main(String[] args) {
        
        int[] arr = {1,-2,6,-1,3};

        System.out.println(maxSumArray(arr));
    }
}
