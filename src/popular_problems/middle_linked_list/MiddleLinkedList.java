package popular_problems.middle_linked_list;

import popular_problems.Linked_list_cycle.LinkedLinkedCycle;

public class MiddleLinkedList {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

        ListNode one = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(0);
        ListNode four = new ListNode(-4);
        ListNode five = new ListNode(7);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(findMiddle(one).val);

    }

    private static ListNode findMiddle(ListNode head) {

        if (head == null) return head;
        ListNode sp = head;
        ListNode fp = head;

        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
        }

        return sp;

    }

}
