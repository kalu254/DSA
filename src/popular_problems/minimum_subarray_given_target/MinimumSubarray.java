package popular_problems.minimum_subarray_given_target;

public class MinimumSubarray {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3,  1, 2, 4, 3}));
        ;
    }


    public static int minSubArrayLen(int target, int[] nums) {
        int lp = 0;
        int rp = 0;

        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        while(rp < nums.length){
            sum += nums[rp];
            if(sum >= target){
                while(sum >= target){
                    minLen = Math.min(minLen, rp - lp + 1);
                    sum -= nums[lp];
                    lp++;
                }
                rp++;
            }else{
                rp++;
            }
        }

        return minLen != Integer.MAX_VALUE ? minLen : 0;


    }


}
