package codewars;

public class PowArrItems {


    public static void main(String[] args) {

        int[] ints = {2,3,4, 5,6};

        System.out.println(squareSum(ints));
        int s = 4 + 9 + 16 + 25 + 36;
        System.out.println(s);
    }

    private static int squareSum(int[] n) {
        int sum = 0;

        for(int i=0;i<n.length;i++){
            sum += Math.pow(n[i],2);

        }
        return sum;
    }
}
