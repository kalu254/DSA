package popular_problems.stack_with_two_queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueues {


    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public StackWithTwoQueues() {

    }

    public void push(int x) {
        if (q1.isEmpty()) {
            q1.offer(x);
        } else {
            while (!q1.isEmpty()) {
                q2.offer(q1.remove());
            }

            q1.offer(x);

            while (!q2.isEmpty()) {
                q1.offer(q2.remove());
            }
        }
    }

    public int pop() {
        return !q1.isEmpty() ? q1.remove() : -1;
    }

    public int top() {
        return !q1.isEmpty() ? q1.peek() : -1;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
