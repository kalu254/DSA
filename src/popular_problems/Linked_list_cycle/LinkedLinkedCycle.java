package popular_problems.Linked_list_cycle;

public class LinkedLinkedCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private static boolean hasCycle(ListNode head) {

        int sp = 0;
        int fp = 0;

        while (head.next != null) {
            head = head.next;
            sp += 1;
            fp += 2;

            if (sp == fp) {
                return true;
            }

        }

        return false;
    }


    public static void main(String[] args) {
        ListNode one = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(0);
        ListNode four = new ListNode(-4);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = two;

        System.out.println(hasCycle(one));
    }
}