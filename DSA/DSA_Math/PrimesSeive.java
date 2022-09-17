package DSA_Math;



// time  complexity : n( 1/2 + 1/3 + 1/5+ ..............) : Harmonic progression
// By applying the tylor seris 
// time complexity : O(n * log(logN)) which is optimised way of finding the primes

public class PrimesSeive {

    static int countPrimes(boolean[] primes,int n)
    {


        int count =0;
        primes[0] = false;
        primes[1] = false;
        for(int i =2;i<=n;i++)
        {
            if(primes[i] == true)
            {
                for(int j =2;i* j<=n;j++)
                {
                    primes[i *j] = false;
                }
            }
        }

        for(int i =2;i<=n;i++)
        {
            if(primes[i] == true)
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        
        int n = 40;
        boolean[] primes = new boolean[n+1];
    
        for(int i =0;i<n+1;i++)
        {
            primes[i] = true;
        }


        System.out.println(countPrimes(primes,n));

    }
}
