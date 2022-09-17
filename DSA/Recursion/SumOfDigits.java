package Recursion;

public class SumOfDigits {


    static int digitSum(int n)
    {
        if(n ==0)
        {
            return 0;
        }

        return (n % 10) + digitSum(n/10);
    }
    public static void main(String[] args) {
        int n = 12234;

        int sum = digitSum(n);
        System.out.println(sum);
    }
}
