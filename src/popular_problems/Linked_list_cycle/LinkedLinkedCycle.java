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


    public static int lengthOfCycle(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;

        while (head.next != null) {
            sp = sp.next;
            fp = fp.next.next;

            if (sp == fp) {
                int length = 0;
                ListNode temp = sp;
                do {
                    sp = sp.next;
                    length++;
                }while (sp != fp);

                return length;
            }

        }

        return 0;
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

//        System.out.println(hasCycle(one));
        System.out.println(lengthOfCycle(one));
    }
}