//1.数组子集

import java.util.*;

public class Test {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            int size=list.size();
            for(int j=0;j<size;j++){
                List<Integer> li=new ArrayList<>(list.get(j));
                li.add(nums[i]);
                list.add(li);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] s={1,2,3};
        List<List<Integer>> a=subsets(s);
        System.out.println(a);

        Stack<String> s1=new Stack<>();

    }
}


//2.用队列模拟实现栈

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    /** Initialize your data structure here. */
    public MyStack() {
        q1 =new LinkedList<>();
        q2 =new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        //将size-1个元素移到q2中
        while(q1.size()>1){
            q2.offer(q1.poll());
        }
        int ret=q1.poll();

        Queue<Integer> tmp=q1;
        q1=q2;
        q2=tmp;
        return ret;
    }

    /** Get the top element. */
    public int top() {
        //将size-1个元素移到q2中
        while(q1.size()>1){
            q2.offer(q1.poll());
        }
        int ret=q1.peek();
        q2.offer(q1.poll());
        Queue<Integer> tmp=q1;
        q1=q2;
        q2=tmp;
        return ret;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}


//3.用栈实现队列
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


//4.设计实现循环队列

class MyCircularQueue {
    private int[] array=null;
    private int capacity=0;
    private int size=0;
    private int front=0;
    private int rear=0;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        array=new int[k];
        capacity=k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(size == capacity){
            return false;
        }
        array[rear++]=value;
        if(rear==capacity){
            rear=0;
        }
        size++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front++;
        if(front==capacity){
            front=0;
        }
        size--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return array[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return array[(rear-1+capacity)%capacity];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size==capacity;
    }
}