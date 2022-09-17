package String;

public class String_Methods {
    
    public static void main(String[] args) {
        
        String name = "Md Ameer Humjah";

        //convert the String to char Array
          char[] arr=  name.toCharArray(); //

          System.out.println(name.toCharArray());//direct printing
        
            System.out.println(arr);

          System.out.println(Arrays.toString(arr));
        
        
        //strip method : remove the whitespace not in middle
        String name1 = "              Md Ameer Humjah   ";
        System.out.println(name1.strip());
        System.out.println(name1); //withour strip
        
        //split method :important
        String name2 = "ameer arslan marzina farroque sahida";
    
        System.out.println(Arrays.toString(name2.split(" ")));
    }
}
