package popular_problems.longest_substring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {


    public static void main(String[] args) {
        System.out.println(lsb("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {

        Set uniqueElements = new HashSet<Character>();

        int longestSubString = 0;
        int currentLongestSubstring = 0;

        int fp=0;
        int sp=0;

        while(sp < s.length()){
            if(uniqueElements.contains(s.charAt(sp))){
                uniqueElements.remove(s.charAt(sp));
                fp++;
            }else {
                uniqueElements.add(s.charAt(sp));
                sp++;
            }

            longestSubString = Math.max(longestSubString, (sp-fp)) ;
        }

        return longestSubString;
    }


    public static int lsb(String s) {

        if (s.isEmpty()) return 0;

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
