package popular_problems.randomized_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {


    HashMap<Integer, Integer> numMap = new HashMap<>();
    ArrayList<Integer> numList = new ArrayList<>();

    Random random = new Random();

    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if (numMap.containsKey(val)) return false;
        numMap.put(val, numMap.size());
        numList.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!numMap.containsKey(val)) return false;
        //remove from the list first and update map value of remaining array elements indexes
        //get index of the element to be removed
        int indexToRemove = numMap.get(val);
        //swap the last element with the element to be deleted
        numList.add(indexToRemove, numList.get(numList.size() - 1));
        numList.remove(numList.size() - 1);
        //remove from the map and update the keys
        numMap.put(numList.get(indexToRemove), numMap.get(val));
        numMap.remove(val);
        return true;

    }

    public int getRandom() {
        int randomIndex = random.nextInt(numList.size());
        return numList.get(randomIndex);
    }


    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();

        boolean param_1 = obj.insert(1);
        System.out.println(param_1); // -> size 1

        boolean param_2 = obj.remove(2);
        System.out.println(param_2); // -> size 1

        boolean param_3 = obj.insert(2);
        System.out.println(param_3); // -> size 1

        int param_4 = obj.getRandom();
        System.out.println(param_4); // -> size 0

        boolean param_5 = obj.remove(1);
        System.out.println(param_5); // -> size 1

        boolean param_6 = obj.insert(2);
        System.out.println(param_6); // size 1

        int param_7 = obj.getRandom();
        System.out.println(param_4);

//        System.out.println(obj.numList.size());

//        [[],[1],[2],[2],[],[1],[2],[]]



    }
}
