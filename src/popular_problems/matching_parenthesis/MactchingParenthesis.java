package popular_problems.matching_parenthesis;

import java.util.*;

public class MactchingParenthesis {

    public boolean isValid(String s) {

        Map<Character, Character> matchingParenMap = new HashMap<>();
        Set<Character> openingParenthesis = new HashSet<>();

        Stack<Character> chars = new Stack<>();


        matchingParenMap.put(')', '(');
        matchingParenMap.put('[', ']');
        matchingParenMap.put('{', '}');

        openingParenthesis.addAll(matchingParenMap.values());


        for(Character c: s.toCharArray()){

            if(openingParenthesis.contains(c)){
                chars.push(c);
            }

            if(matchingParenMap.containsKey(c)){
//                Character lastParan = chars.pop();
//                if(lastparam != matchingParenMap.get(ch)){
//                    return false;
//                }
            }


            return chars.isEmpty();

        }


        return false;

    }
}
