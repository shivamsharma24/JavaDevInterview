package leetcode;

import java.util.Stack;
//
//Time Complexity:
//  push(int x): O(1)
//  pop(): Amortized O(1), Worst-case O(n)
//  peek(): Amortized O(1), Worst-case O(n)
//  empty(): O(1)
//Space Complexity: O(n)
public class QueueUsingTwoStackImpl {

    private final Stack<Integer> input = new Stack<>();
    private final Stack<Integer> output = new Stack<>();

    void push(int x) {
        input.push(x);
    }

    int pop() {
        peek();
        return output.pop();
    }

    int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }

    boolean empty() {
        return input.empty()&& output.empty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStackImpl queueUsingTwoStack= new QueueUsingTwoStackImpl();
        queueUsingTwoStack.push(2);
        queueUsingTwoStack.push(3);
    }
}
