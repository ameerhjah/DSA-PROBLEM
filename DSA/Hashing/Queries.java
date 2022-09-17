package Hashing;
import java.util.*;

public class Queries {

    static boolean[] queriesChecking(String[] arr ,String[] queries)
    {
        int n = queries.length;
        boolean[] ans = new boolean[n];

        //creating empty hash table
        HashSet<String> hs = new HashSet<>();

        //hasing the arr elements into hash table
        // this type of looop is used for adding element into the hash table
        for(String s : arr)
        {
            hs.add(s);
        }

        for(int i =0;i<n;i++)
        {
            if(hs.contains(queries[i])) // O(1) operation 
            {
                ans[i] = true;
            }
            else{
                ans[i] = false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        String[] arr = {"ameer","humja","arslan","marzina"};
        String[] queries = {"ameer","pixel","camera"};

        boolean[]ans = queriesChecking(arr,queries);

        for(boolean  s : ans)
        {
            System.out.print(s+" ");
        }
    }
}
