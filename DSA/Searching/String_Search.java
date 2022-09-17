package Searching;

public class String_Search {

    static boolean stringSearch(String name,char key)
    {
        
        //converting the string to lower case
        name = name.toLowerCase();
        if(name == null || name.length()<=0)
        {
            return false;
        }

        for(int i =0;i<name.length();i++)
        {
            char element = name.charAt(i);
            if(element == key)
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        
        String name = "Ameer";
        char key = 'a';

        boolean found = stringSearch(name,key);
        System.out.println(found);
    }
}
