package DSA_Math;


// time complexity : O(n)

public class Factor {
    public static void factor(int n )
    {
        for(int i=1;i<=n;i++)
        {
            if( n % i ==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        
        factor(20);
    }
    
}
