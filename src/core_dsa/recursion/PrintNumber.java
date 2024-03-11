package core_dsa.recursion;

public class PrintNumber {


    public static void main(String[] args) {
//        printN(5);
        System.out.println(printNum1(5));
    }

    static void printN(int n){
        if (n == 0) return;
        printN(--n);
        System.out.println(n);
    }


    static int printNum1(int num){
        return printNum2(num);

    }
    static int printNum2(int num){
        return printNum3(num);

    }
    static int printNum3(int num){
        return printNum4(num);

    }
    static int printNum4(int num){
        return printNum5(num);

    }
    static int printNum5(int num){
        return num;
    }
}
