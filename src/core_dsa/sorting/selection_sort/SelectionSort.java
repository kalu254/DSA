package core_dsa.sorting.selection_sort;

public class SelectionSort {


    public static void main(String[] args) {

        int[] listToSort;

//        printArr(listToSort);
//
//        swapElements()
    }

    private static void printArr(int[] listToSort) {
        for (int i :
                listToSort) {
            System.out.println( i + " ");
        }
    }

    private  static void swapElements(int[] listToSort, int iIndex, int jINdex){
       int temp = listToSort[iIndex];
       listToSort[iIndex] = listToSort[jINdex];
       listToSort[jINdex] = temp;

    }

}
