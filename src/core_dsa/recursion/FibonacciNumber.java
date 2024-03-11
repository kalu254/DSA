package core_dsa.recursion;

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    /**
     * nth f(n-1) + f(n-2)
     */
    private static int fibonacci(int n) {
      if (n < 2){
          return n;
      }
      return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
