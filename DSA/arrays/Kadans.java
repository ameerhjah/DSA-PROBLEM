package arrays;

public class Kadans {

    static boolean allNegative(int[] arr)
    {
            for(int i =0;i<arr.length;i++)
            {
                if(arr[i] >=0)
                {
                    return  false;
                }
            }
            return true;
    }

    static int kadan_algorithm(int[] arr)
    {
            int max = Integer.MIN_VALUE;
            int currentSum =0;
        if(allNegative(arr))
        {
            for(int i =0;i<arr.length;i++)
            {
                max = Math.max(max, arr[i]);
            }

            return max;
        }


        //if atleast one element is +ve;
        for(int i =0;i<arr.length;i++)
        {
           currentSum += arr[i];
           if(currentSum<0)
           {
                 currentSum =0;
           }

           max =  Math.max(currentSum, max); 

         }
         return max;
    }


    
    public static void main(String[] args) {
        int[] arr = { -2,-3,4,-1,-2,1,5,-3};

        System.out.println(kadan_algorithm(arr));
    }
}
