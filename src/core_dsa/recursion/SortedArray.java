package core_dsa.recursion;

class SortedArray {

    public static void main(String[] args) {
        System.out.println(isArraySorted());
    }
    static boolean isArraySorted(){
        int[] arr = { 1, 2, 3,4, 5, 6 };
        return helper(arr,0);
    }

    static boolean helper(int[] arr, int index){
        if (index == arr.length -1) return true;
        return arr[index] < arr[index + 1] && helper(arr, ++index);
    }
}