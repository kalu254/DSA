package codewars;

public class Mask {

    public static void main(String[] args) {
        System.out.println(maskify("onethreefour"));
    }

    public static String maskify(String str) {
        if (str.length() <= 4) return str;
        String masked = "";
        for (int i = 0; i < str.length() - 4; i++) {
            masked += "#";
        }
        return masked + str.substring(str.length() - 4);
    }

}
