package arrayList;
import java.util.*;
public class TwoDArrayList {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();

        // inserting the arrayList list 1
        list1.add(1);list1.add(2);
        mainList.add(list1);

        
        // inserting the arrayList list 2
        list2.add(10);list2.add(23);
        mainList.add(list2);

          
        // inserting the arrayList list 3
        list3.add(100);list3.add(121);
        mainList.add(list3);
        
        for(int i =0;i<mainList.size();i++)
        {
           ArrayList<Integer> current =  mainList.get(i);
               
               for(int j =0;j<current.size();j++)
               {
                   System.out.print(current.get(j)+" ");
               }
        }
    
    }
}
