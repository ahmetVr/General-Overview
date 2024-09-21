package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackImplement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println( stack.peek());
        System.out.println(stack);
        System.out.println(stack.search(30));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("****************");
        Queue<Integer> que = new LinkedList<>();
        // Que davranışını gösterebilmesi için LinkedList altyapısını kullanıyoruz.
        que.add(1);
        que.add(2);
        que.add(3);
        que.offer(4);
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que.remove());
        System.out.println(que.remove());
        //System.out.println(que.remove());
        System.out.println(que);

    }
}
