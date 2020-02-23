import java.util.*;

//1
class CQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public CQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if(s1.empty() && s2.empty()){
            return -1;
        }

        if(s2.empty()){
            while(! s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();

    }
}


//2
class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    /** Initialize your data structure here. */
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s2.empty()){
            while(! s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(s2.empty()){
            while(! s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}

