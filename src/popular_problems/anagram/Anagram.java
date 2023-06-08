package popular_problems.anagram;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
       boolean isAnagram = checkIfAnagram("luka","kalu");
        System.out.println(isAnagram);

        System.out.println('a'+0);
    }

    private static boolean checkIfAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
}
