package DSA_Math;
import java.util.*;
public class IsPrime {

    static boolean isPrime(int n )
    {
        
        if(n<=1)
            return false;
        for(int i =2; i *i <=n;i++)
        {
            if( n % i ==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i =1;i<=n;i++){
            
            System.out.println(i+" is "+isPrime(i));
        }
    }
}
