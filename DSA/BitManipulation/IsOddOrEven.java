package BitManipulation;
//import java.util.*;
public class IsOddOrEven {

    static boolean isOddEven(int n )
    {
        if((n & 1) == 1)
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        int n = 45;

        System.out.println(isOddEven(n));
    }
    
}
