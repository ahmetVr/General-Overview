package Stack;

public class Test {
    public static void main(String[] args) {
        QueUsingStack que = new QueUsingStack();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(8);
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        que.enqueue(999);
        System.out.println(que.dequeue());
        que.enqueue(33);
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println("********");
        StackUsingQue st = new StackUsingQue();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(5);
        System.out.println(st.pop());


    }
}
