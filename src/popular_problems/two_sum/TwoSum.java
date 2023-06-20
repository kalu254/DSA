package popular_problems.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTwoSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));
    }

    private static int[] getTwoSum(int[] array, int target) {

        /**
         * store the compliment and index
         */
        Map<Integer, Integer> targetCompliments = new HashMap<Integer,Integer>();

        for(int i=0; i < array.length; i++){
            if(targetCompliments.containsKey(array[i])){
                return new int[]{array[targetCompliments.get(array[i])], array[i]};
            }else{
                targetCompliments.put(target-array[i], i);
            }

        }


        return new int[0];
    }


}
