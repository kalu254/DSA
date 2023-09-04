package popular_problems.group_anagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {


    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        HashMap<String, List<String>> map = new HashMap();
        for (String s : strs) {
            char[] hash = new char[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(hash);
            map.computeIfAbsent(key, k -> new ArrayList());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}
