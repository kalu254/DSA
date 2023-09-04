package popular_problems.longest_repeating_char;

public class LongestRepeatingChar {

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;

        System.out.println(characterReplacement(s, k));
    }

    private static int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        int i = 0;
        int max = 0;
        int res = 0;

        for (int j = 0; j < s.length(); j++) {
            hash[s.charAt(j) - 'A']++;
            max = Math.max(max, hash[s.charAt(j) - 'A']);
            if ((j - i + 1) - max > k) {
                hash[s.charAt(i) - 'A']--;
                i++;
            }

            res = Math.max(res, j - i + 1);
        }

        return res;


    }
}
