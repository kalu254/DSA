package core_dsa.array_array_list;

import java.util.Scanner;

public class MyArr {

    static Scanner scanner = new Scanner(System.in);

    static int[] arr = new int[6];

    public static void main(String[] args) {
        input2D();
        outPut2D();

    }

    private static void popuplateArray() {
        for (int i = 0; i < arr.length; i++ ){
            arr[i] = scanner.nextInt();
        }
    }

    /**
     * 2D arr
     */


  static  int[][] twoDArr = new int[4][3];

    private static void input2D(){
        for (int r=0; r < twoDArr.length; r++){
            //for each row
            for (int c=0; c<twoDArr[r].length; c++){
                twoDArr[r][c] = scanner.nextInt();
            }
        }
    }

    private static void outPut2D(){
        for (int r=0; r < twoDArr.length; r++){
            //for each row
            for (int c=0; c<twoDArr[r].length; c++){
                System.out.print(twoDArr[r][c]);
            }
            System.out.println();
        }
    }

}
