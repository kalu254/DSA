package core_dsa.recursion;

public class StartRecursion {

    public static void main(String[] args) {
        message1();

        System.out.println("end");
    }

    static void message1() {
        System.out.println("Hello Masha");
        message2();
    }

    static void message2() {
        System.out.println("Hello Masha");
        message3();
    }

    static void message3() {
        System.out.println("Hello Masha");
        message4();
    }

    static void message4() {
        System.out.println("Hello Masha");
        message5();
    }

    static void message5() {
        System.out.println("Hello Masha");
    }

}
