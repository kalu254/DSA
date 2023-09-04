package popular_problems.search_sorted_matrix;

import java.util.Arrays;

public class SortedMatrix {


    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(search(new int[][]{
                                {3, 4, 5},
                                {6, 7, 8},
                                {12, 23, 60}
                        }, 23
                ))
        );
    }

    private static int[] search(int[][] matrix, int target) {
        int cols = matrix[0].length;
        int rows = matrix.length;

        if (rows == 0) {
            binarySearch(matrix, 0, 0, cols - 1, target);
        }


        //reduce the search space to two rows and perform BS
        int rStart = 0;
        int rEnd = cols - 1;
        int mid = rStart + ((rEnd - rStart) / 2);

        while (rStart < (rEnd - 1)) {
            if (target == matrix[rStart][mid]) {
                return new int[]{rStart, mid};
            } else if (target > matrix[rStart][mid]) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        //now check if target is in the mid-column of the two rows
        if (target == matrix[rStart][mid]) {
            return new int[]{rStart, mid};
        }

        if (target == matrix[rStart + 1][mid]) {
            return new int[]{rStart + 1, mid};
        }

        //now we have the two rows, we need to perfom BS on the four parts of the rows

        if (target <= matrix[rStart][mid - 1]) {
            return binarySearch(matrix, rStart, 0, mid - 1, target);
        }

        if (target >= matrix[rStart][mid + 1] && target < matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, mid + 1, cols - 1, target);
        }

        if (target <= matrix[rStart + 1][mid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, mid - 1, target);
        }


        return binarySearch(matrix, rStart + 1, mid + 1, cols - 1, target);


    }


    private static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (target == matrix[row][mid]) {
                return new int[]{row, mid};
            } else if (target > matrix[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}
