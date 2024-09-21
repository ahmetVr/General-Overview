package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQue {
    private Queue<Integer> que1 = new LinkedList<>();
    private Queue<Integer> que2 = new LinkedList<>();

    public void push(int num) { // 1-2-3-4-5
        que2.add(num);

        while (!que1.isEmpty()) {
            que2.add(que1.poll());
        }

        Queue<Integer> tmp = que1;
        que1 = que2;
        que2 = tmp;

    }

    public int pop() {
        return que1.poll();
    }
 }
