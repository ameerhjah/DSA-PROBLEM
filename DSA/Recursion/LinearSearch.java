package Recursion;

public class LinearSearch {

    static boolean isFound(int[] arr,int target,int index)
    {
        if(arr[index] == target && index<= arr.length-1)
        {
            return true;
        }

        return isFound(arr, target, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,8,9};
        int target = 1;

        isFound(arr,target,0);
    }
}
