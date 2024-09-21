package Stack;

import java.util.Stack;

public class QueUsingStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int num) { // 1,2,3,4,5
        while(stack2.size() > 0) {
            stack1.push(stack2.pop());
        }

        stack2.push(num);

        while(stack1.size() > 0) {
            stack2.push(stack1.pop());
        }
    }

    public int dequeue() {
        return stack2.pop();
    }

    public boolean emptyQue() {
        if(stack2.isEmpty()) {
            return true;
        }
        return false;
    }
}
