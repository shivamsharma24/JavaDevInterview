package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//This approach is best when we have more pop operation
public class ImpStackUsingSingleQueue {
    private final Queue<Integer> q1;

    public ImpStackUsingSingleQueue() {
        q1 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
        for (int i = 1; i < q1.size(); i++) {
            q1.add(q1.remove());
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

}
