package studies_concepts.selection_sort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {23, -15,7, 20,44,1, 6,87, -22, 43};

        for (int i= array.length-1; i > 0; i--) {
            int largestIndex = 0;
            for (int j = 1; j <= i; j++) {
                if(array[j] > array[largestIndex]){
                    largestIndex = j;
                }

            }
            swap(i, largestIndex, array);
        }

        for (int num :
               array ) {
            System.out.println(num);
        }
    }

    private static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
