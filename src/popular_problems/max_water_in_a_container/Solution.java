package popular_problems.max_water_in_a_container;

public class Solution {
    public static void main(String[] args) {
        int [] bars = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxWater(bars));
    }

    public static int maxWater(int[] height)  {
        int lp = 0;
        int rp = height.length -1;
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
           ans = Math.max(ans, (rp - lp) * Math.min(height[rp],height[lp]));
           if(rp > lp){
               if (height[lp] > height[rp]){
                   rp--;
               }else {
                   lp++;
               }
           }else{
               return ans;
           }
        }

        return ans;
    }
}
