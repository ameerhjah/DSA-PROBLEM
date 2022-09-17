package arrays;

public class TrapRainWater {

    //function for Traped rain water
    static int trapedRainWater(int[] height)
    {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        //calculate leftmost boundary array
        leftMax[0] = height[0];
        for(int i =1;i<n;i++)
        {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }


        //calculate rightmax boundary --array
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--)
        {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

            int trapedWater = 0;

            for(int i =0;i<n;i++)
            {
                // water level = min(leftMax bound ,rightmax bound)
                int water_level = Math.min(leftMax[i],rightMax[i]);


                // traped_water = water_level - height[i];
                trapedWater += water_level - height[i];
            }

            return trapedWater;
    }
    public static void main(String[] args) {
        
        int[] height = {4,2,0,6,3,2,5};

        System.out.println(trapedRainWater(height));
    }
}
