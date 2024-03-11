package core_dsa.recursion;

public class PowerOfNumber {

   private static int noOfCalls = 1;

    public static void main(String[] args) {
        System.out.println(ifIsPower(27));
    }

    private static boolean ifIsPower(int n) {
        if (n <= 0) {
            System.out.println("not a power instant");
            return false;
        }
        if (n == 1) {
            System.out.println("Walaah");
            return true;
        }
        noOfCalls++;
        System.out.println(noOfCalls);
        return ifIsPower(n / 3);
    }


}
