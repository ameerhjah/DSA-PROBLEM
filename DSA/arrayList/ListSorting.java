package arrayList;
import java.util.*;
public class ListSorting {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
    
        
        //sorting in ascending order
        Collections.sort(list);
        System.out.println(list);
        
        //soritng in desceding order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
