package core_dsa.recursion;

public class PrintStars {

    public static void main(String[] args) {
        PrintTriangle(4, 0);
    }

    private static void PrintTriangle(int row, int col) {
        if (row == 0) {
            return;
        }
        ++col;
        if (col <= row) {
            PrintTriangle(row, col);
            System.out.print("*");
        }else {
            --row;
            PrintTriangle(row, 0);
            System.out.println();
        }
    }
}
