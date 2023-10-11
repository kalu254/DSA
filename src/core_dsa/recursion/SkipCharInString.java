package core_dsa.recursion;

public class SkipCharInString {
    public static void main(String[] args) {
        String original = "baccad";
        StringBuilder ans = new StringBuilder();
        int startIndex  = 0;
        removeCharsFromString(original, ans);

        System.out.println(ans.toString());

    }
    private static void removeCharsFromString(String originalStr, StringBuilder finalStr){

        if (originalStr.isEmpty()){
            return;
        }

        char first = originalStr.charAt(0);

        if (first == 'a'){
            removeCharsFromString(originalStr.substring(1), finalStr);
        }else {
            removeCharsFromString(originalStr.substring(1), finalStr.append(first));
        }
    }
}
