package Recursion;

public class nTo1 {


    //printing from n -> 1 by passing n 
    // static void printing(int n)
    // {
    //     if(n ==1)
    //     {
    //         System.out.print(n);
    //         return ;
    //     }
    //         System.out.print(n+" ");
    //     printing(n-1);
    // }


    // priting from 1 -> n by passing n integer
    static void printReverse(int n)
    {
       if(n == 0)
       {
        return ;
       }

       printReverse(n-1);
       System.out.print(n+" ");
    }
    public static void main(String[] args) {
        
        int n = 10;

       // printing(n);  printing from n to 1;

       printReverse(n);
    }
}
