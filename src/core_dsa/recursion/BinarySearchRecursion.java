package core_dsa.recursion;

public class BinarySearchRecursion {


    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 20, 23, 45};
        int i = searchNum(arr, 18, 0, arr.length - 1);
        System.out.println(i);
    }


    static int searchNum(int[] arr, int num, int lp, int rp) {
        if (lp > rp) return -1;
        int mp = lp + (rp - lp) / 2;
        if (arr[mp] > num) {
            rp = mp;
        } else if (arr[mp] < num) {
            lp = mp;
        } else if (arr[mp] == num) {
            return mp;
        }
        return searchNum(arr, num, lp, rp);
    }
}
