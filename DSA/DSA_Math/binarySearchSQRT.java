package DSA_Math;

public class binarySearchSQRT {

    //time complexity : O(logn)

    static double sqrt(int n ,int p)
    {
        int low = 0;
        int high = n;
        double root = 0.0;
        while(low<=high)
        {
            int m = low + (high- low)/2;

            if(m * m == n)
            return m;
            else if(m * m >n)
            {
                high = m-1;
            }
            else
            {
                low = m+1;
            }
        }

        double incr = 0.1;
        for(int i =0;i<p;i++)
        {
            while( root * root <= n)
            {
                    root += incr;
            }
            root -= incr;

            incr /= 10;
        }

        return root;
    }

    public static void main(String[] args) {
        
        int n =40;
        int p = 3;
        System.out.printf("%.3f",sqrt(n,p));
    }
    
}
