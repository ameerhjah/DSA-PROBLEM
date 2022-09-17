package Hashing;
import java.util.*;
public class ExampleOfHashMap {
    public static void main(String[] args) {
        
        //(key,value)
        HashMap<String,Integer> hm = new HashMap<>();

        //add <"ameer",100>
        hm.put("ameer",100);
        hm.put("arslan",40);

        // get the value using key
        // I want the value of ameer
        System.out.println(hm.get("ameer"));



        //override value;
         hm.put("ameer",90);
        System.out.println(hm.get("ameer"));
        
        // checking the particular key is present  or not 
        System.out.println(hm.containsKey("marzina"));
    }
}
