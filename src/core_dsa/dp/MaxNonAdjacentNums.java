package core_dsa.dp;

public class MaxNonAdjacentNums {

    public static void main(String[] args) {

        int[] array = new int[] { 1,2,3};
//        int max = maxNonAdjacentValue(array);
        int max = improvedMaxNonAdjacentValue(array);

        System.out.println(max);


    }

    private static int improvedMaxNonAdjacentValue(int[] array) {
        if (array.length == 0) return 0;
        if (array.length ==1)  return array[0];
        int currentMax = 0;
        int first = 0;
        int second = 0;

        for(int i=0; i < array.length; i++){
            if(i == 0){
                currentMax = array[0];
            }else if(i ==1){
                currentMax = Math.max(array[0], array[1]);
            }else{
                currentMax = Math.max(currentMax, array[i] + second);

            }



            second = first;
            first = currentMax;


        }


        return currentMax;

    }

    private static int maxNonAdjacentValue(int[] array) {

        if (array.length == 0) return 0;
        if (array.length ==1)  return array[0];

        int[] arrayMaxSum = new int[array.length];

        arrayMaxSum[0] = array[0];
        arrayMaxSum[1] = Math.max(array[0], array[1]);

        for(int i = 2; i < array.length; i++){
            arrayMaxSum[i] = Math.max(arrayMaxSum[i-1], arrayMaxSum[i-2]+array[i]);
        }

        return arrayMaxSum[arrayMaxSum.length - 1];
    }



}
