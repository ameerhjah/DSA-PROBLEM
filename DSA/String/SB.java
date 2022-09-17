package String;

public class SB {

    public static void main(String[] args) {

        //printing abcde ...z using String
        String series = "";

        for(int i =0;i<26;i++)
        {
            char ch  = (char)('a' +i);
            series = series + ch;
        }

    System.out.println(series);
    
    //The above method is not performance efficient because it occupy more memory
    //It create new object every times when added since it is Immutable
    
    // A better solution is given below using StringBuilder whihc is Mutable
    
    
    //printing the abcdef....z using StringBuildeer
    
    StringBuilder builder =new StringBuilder();
    
    for(int i =0;i<26;i++)
    {
        char ch = (char)('a'+i);
        
        builder = builder.append(ch); // adding to end of the string(like "+ "in String);
    }
    System.out.println(builder);
    }
    
         

}
