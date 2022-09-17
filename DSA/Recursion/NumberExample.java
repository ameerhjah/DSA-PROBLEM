package Recursion;

public class NumberExample {
    
    //     public static void main(String[] args) {
            
    //         print1(1);
    //     }
        
        
    //     // calling by using different funciton
    //     static void print1(int n)
    //     {
    //         System.out.println(n);
    //         print2(2);
    //     }
    //     static void print2(int n)
    //     {
    //         System.out.println(n);
    //         print3(3);
    //     }
    //     static void print3(int n)
    //     {
    //         System.out.println(n);
    //         print4(4);
    //     }
    //     static void print4(int n)
    //     {
    //         System.out.println(n);
    //         print5(5);
    //     }
        
    //     // This function is the terminating condition 
    //     // since it does not call any other function
    //     static void print5(int n)
    //     {
    //         System.out.println(n);
    //       //  print2(2);
    //     }
        
        
        //Using Recursion
         public static void main(String[] args) {
            
            print(1);
        }
        
        static void print(int n)
        {
            if( n == 5)
            {
                System.out.println(n);
                return ;
            }
            System.out.println(n);
            print(n+1);
        }
    }
    