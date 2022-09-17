package String;

public class String_Operator {
    
    public static void main(String[] args) {
        
        //when the characters are performed using addtion using  +,it resulted the 
        // the addition of Ascii values
        System.out.println('a'+'b'); //this resulted into the addition of Ascii values
        
        // String concatenation
        System.out.println("a"+"b"); 
        
        System.out.println('a'+ 3); 
          System.out.println((char)('a'+ 3)); // casting the 100 value into character
        
        
        //String with intege
        System.out.println("a"+ 1);
        // this is same as after few steps : "a" + "1";
        //integer 1 will be converted into Integer(wrapper class) that will call toString
        
        //concatenation string with complex data types
        // if there is any ojbect into println --> it convert the same to string using 
        //toString method
        System.out.println("Ameer" + new ArrayList<>());
        System.out.println("ameer"+ new Integer(45)); // with Integer Object
        
    
        //Important complex expressison using +
        // + can be used only with primitives or atleast one them would be string
        String ans = new Integer(45)+""+ new ArrayList<>();
        //In the above example,if we remove empty string "", it would work !!
        System.out.println(ans);
        
        
    }
}
