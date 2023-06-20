package popular_problems.valid_subsequence;

import java.util.List;

public class ValidSubSequence {

    public static void main(String[] args) {
        System.out.println(isValidSubsequence(List.of(5,1,22,25,6,-1,8,10), List.of(1,6,-1,10)));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.

        int lookingAtIndex = 0;
        int lookingFor = sequence.get(lookingAtIndex);

        for(int i=0;i<array.size(); i++){
            if(array.get(i) == lookingFor){
                if(lookingAtIndex == sequence.size()-1){
                    return true;
                }else {
                    lookingFor = sequence.get(++lookingAtIndex);
                }
            }


        }

        return false;
    }
}
