package core_dsa.linked_list.problems;

import popular_problems.middle_linked_list.MiddleLinkedList;

public class ReverseLinkedListInBetween {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

       ListNode head = reverseInBetween(one, 1, 3);

       while (head.next != null){
           System.out.println(head.val);
           head = head.next;
       }


    }

    private static ListNode reverseInBetween(ListNode head, int start, int end) {
        ListNode prev = null;
        ListNode current = head;

        for (int i=0; current != null && i < start; i ++){
            prev = current;
            current = current.next;
        }

        ListNode nodeBeforeRev = prev;
        ListNode inBetweenLast = current;
        ListNode next = current.next;
        //Reverse
        for (int i=0; current != null && i < (end-start) + 1; i++){
            current.next = prev;
            prev = current;
            current = next;
            if (next != null){
                next = next.next;
            }
        }

        if (nodeBeforeRev != null){
            nodeBeforeRev.next = prev ;
        }else {
            head = prev;
        }

        inBetweenLast.next = current;

        return head;
    }


}
