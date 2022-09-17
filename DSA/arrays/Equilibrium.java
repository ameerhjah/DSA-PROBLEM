package arrays;

public class Equilibrium {

    static int equilibrium(int[] arr)
    {
        int n = arr.length;

        if(arr == null || n <=0)
    {
        return -1;
    }

    int[] leftPrefixSum = new int[n];
    int[] rightPrefixSum = new int[n];

    //creating leftPrefixSum
    leftPrefixSum[0] = arr[0];
    for(int i = 1;i<n;i++)
    {
            leftPrefixSum[i] = leftPrefixSum[i-1] + arr[i];
        //System.out.println(leftPrefixSum[i]);
    }

    //creating right PrefixSum
    rightPrefixSum[n-1] = arr[n-1];
    for(int i = n-2;i>=0;i--)
    {
        rightPrefixSum[i] = rightPrefixSum[i+1] + arr[i];
    }


    //finding the equilibrium index;

    for(int i =0;i<n;i++)
    {
        if(leftPrefixSum[i] == rightPrefixSum[i])
        {
            return i ;
        }
    }

    return -1;



    }
    
    public static void main(String[] args) {
        
        int[] arr = {-7,1,5,2,4,-5};

        int equiIndex = equilibrium(arr);
        System.out.println(equiIndex);

    }
}
