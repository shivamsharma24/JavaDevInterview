package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//This approach of having secondary queue is best when we have more push operation
public class ImpStackUsingTwoQueue {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public ImpStackUsingTwoQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

//    void push(int x) {
//    }
//
//    int pop() {
//    }
//
//    public int top() {
//    }
//
//    public boolean empty() {
//    }

}
