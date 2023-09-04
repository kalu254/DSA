package popular_problems.ceiling_array;

public class CeilingOfTargetInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(ceilingOfTarget(arr, target));
    }

    private static int ceilingOfTarget(int[] arr, int target) {
        int sp = 0;
        int ep = arr.length - 1;
        while (sp <= ep) {
            int mp = (sp + ep) / 2;
            if (target > arr[mp]) {
                sp = mp + 1;
            } else {
                ep = mp - 1;
            }
            if (arr[mp] == target) {
                return arr[mp];
            }
        }

        return arr[sp];
    }
}
