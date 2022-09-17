package DSA_Math;

//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GCDFrequency {

    static int gcdSum(int i,int j)
    {
        if(i == j)
        {
            return i;
        }
        if(i == 0)
        {
            return j;
        }
        if(j == 0)
        {
            return i;
        }

        if(i>j)
        {
            return gcdSum(i-j,j);
        }

        return gcdSum(i,j-i);
    }
     static void gcdffrequency(int[] arr)
    {
        int n = arr.length;
        int[] gcd = new int[n];
        for(int i =0;i<n;i++)
        {
            int count = 0;
            for(int j = 0;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            gcd[i] = count;
        }
        //finding the gcd
        int i = 0;
        int j =0;
        int sum =0;
        while(i<arr.length && j<gcd.length)
        {
            sum = sum + gcdSum(arr[i],gcd[j]);
            i++;
            j++;
        }
        System.out.println(sum);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }


        gcdffrequency(arr);
    }
}