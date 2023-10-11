package core_dsa.linked_list.problems;

import popular_problems.remove_nth_from_end.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode four = new ListNode(1,null);
        ListNode three = new ListNode(1,four);
        ListNode two = new ListNode(1,three);
        ListNode one = new ListNode(1,two);

        reverseList(one);
    }


    public static ListNode reverseList(ListNode head) {

        if(head == null) return null;
        ListNode current = head;
        ListNode prev = null;
        ListNode next = current.next;

        while(current.next != null){
            current.next = prev;
            prev = current;
            current = next;
            next = current.next;
        }

        return current;
    }
}
