package Hashing;
import java.util.*;

public class Hashing1 {
    
    public static void main(String[] args) {
        
        //creating HashSet

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size of the elements
        System.out.println(set.size());

        //size of the set
        System.out.println("Size of the set is "+ set.size());
        // similar with ArrayList-- list.size();
        
        //in ArrayList -- list.add(el);
        
        //printing all elements of the set
        
        System.out.println(set);
        
        //serach-- contains
        
        if(set.contains(1))
        {
            System.out.println("set contains 1");
        }
        if(!set.contains(6));
        System.out.println("Set does not contains 6");
        
        
        //Delete 
        set.remove(1);
        if(!set.contains(1));
        System.out.println("Set does not contains 1");
        
        //size after deletion
        System.out.println("Size of the set is "+ set.size());
    }

}
