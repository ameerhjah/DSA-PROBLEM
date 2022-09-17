package String;

public class ShortestPath {

    static float getShortestPath(String str)
    {
        int x =0;
        int y =0;

        for(int i =0;i<str.length();i++)
        {
            char dir = str.charAt(i);

            //north
            if(dir == 'N')
            {
                y++;
            }
            //south

            else if(dir == 'S')
            {
                y--;
            }

            //west

            else if(dir == 'W');
            {
                x--;
            }
           //east
          
        }


        return (float)Math.sqrt((x*x) + (y * y));
    }

    public static void main(String[] args) {
        
        String str = "WNEENESENNN";

        System.out.println(getShortestPath(str));
    }
    
}
