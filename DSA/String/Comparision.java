package String;

public class Comparision {

    public static void main(String[] args) {
        
        String a = "Md";
        String b = "Md";

        System.out.println(a==b); // pointing to same object in string pool

        // creating same value with different object:

        String name1 = new String("Ameer");
        String name2 = new String("Ameer");
        System.out.println(name1==name2);
    }
    
}
