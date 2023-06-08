package popular_problems.longest_substring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {


    public static void main(String[] args) {
        System.out.println(lsb("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        List<Character> substringL = new ArrayList<>();
        int largestlength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (substringL.contains(s.charAt(right))) {
                // get the index of the char
                int index = substringL.indexOf(s.charAt(right));
                substringL.remove(index);
                if (index > 0) substringL.subList(0, index).clear();
            }
            substringL.add(s.charAt(right));
            largestlength = Math.max(largestlength, substringL.size());
        }
        return largestlength;
    }


    public static int lsb(String s) {
        Set uniqueElements = new HashSet<String>();
        int fP = 0;
        int sP = 0;

        int longestSubString = 0;
        int currentLongestSubstring = 0;

        while (sP < s.length()) {
            if (uniqueElements.contains(s.charAt(sP))) {
                uniqueElements.remove(s.charAt(fP));
                fP++;
                currentLongestSubstring = sP - fP;
            } else {
                uniqueElements.add(s.charAt(sP));
                sP++;
                currentLongestSubstring = sP - fP;

            }

            longestSubString = Math.max(longestSubString,currentLongestSubstring);
        }

        return longestSubString;
    }
}
