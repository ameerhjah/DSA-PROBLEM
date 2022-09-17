//package arrays;

public class maxSum {

    static void subArraySum(int[] arr)
   {
       int max = Integer.MIN_VALUE;
       for(int i =0;i<arr.length;i++)
       {
               int start = i;
                 int curSum =0;
               for(int j = i;j<arr.length;j++)
               {
                   int end = j;
                    curSum  = 0;
                   for(int k = start ;k<= end;k++)
                   {
                      curSum +=arr[k];
                   }
                   System.out.println(curSum);
               }
               System.out.println();
               if(curSum>max)
               {
                   max = curSum;
               }

       }
       System.out.println(max);
   }
   
   public static void main(String[] args) {
       
       int[] arr = {1,-2,6,-1,3};

       subArraySum(arr);
  
     }
   }
