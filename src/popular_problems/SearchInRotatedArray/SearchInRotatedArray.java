package popular_problems.SearchInRotatedArray;

public class SearchInRotatedArray {

    public static void main(String[] args) {
        search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    }

    private static void search(int[] nums, int target) {

        int pivot = findPivot(nums);

        int left,right;

        if (target < pivot){
        }

    }

    private static int findPivot(int[] nums) {
        if (nums.length == 1) return 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] < nums[mid + 1]) {
                right = mid - 1;
            } else if (nums[mid] > nums[mid + 1]) {
                return mid;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

}


