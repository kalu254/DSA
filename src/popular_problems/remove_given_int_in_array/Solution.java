package popular_problems.remove_given_int_in_array;

class Solution {

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 2, 3, 0, 4, 2};
//        int arr[] = {3,2,2,3};
        int val = 2;
        System.out.println("->");
        System.out.println(removeElement(arr, val));
        System.out.println("->");
        System.out.println();

    }



    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int lp = 0;
        int rp = nums.length-1;

        while (lp < rp) {
            if (nums[lp] == val) {
                if (nums[rp] != val){
                    nums[lp] = nums[rp];
                    lp++;
                }else{
                    rp--;
                }
            }else {
                lp++;
            }
        }

        for (int n: nums){
            System.out.print(n);
        }
        System.out.println();

        //[0,1,4,0,3] -> expected

        return lp;
    }


}
