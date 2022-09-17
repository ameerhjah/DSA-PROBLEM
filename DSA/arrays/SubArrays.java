package arrays;

public class SubArrays {

    static void subarrays(int[] arr)
    {
        
        int total = 0;
        for(int i =0;i<arr.length;i++) // finding the starting element
        {
                int start = i;

                for(int j = i;j<arr.length;j++)
                {
                    int end = j;
                    for(int k = start ;k<= end;k++)
                    {
                        System.out.print(arr[k]+" ");
                    }
                    total++;
                    System.out.println();
                }
                System.out.println();
        }
        System.out.println();
        System.out.println("total sub arrays : "+total);
    }
   public static void main(String[] args) {
    
    int[] arr = {2,4,6,8,10};

     subarrays(arr);

   }
}
