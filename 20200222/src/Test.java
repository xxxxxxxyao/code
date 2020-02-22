/*
import java.util.*;


class MyQueue<E>{
    private Stack<E> s1;
    private Stack<E> s2;

    public MyQueue(){
        s1=new Stack<>();
        s2=new Stack<>();
    }

    //相当于入队列
    public void offer(E e){
        s1.push(e);
    }

    //相当于出队列
    public E poll(){
        if(s2.empty()){
            //s2为空时，将s1中元素都入栈到s2
            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }


    //获取顶元素
    public E peek(){
        if(s2.empty()){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return s1.empty() && s2.empty();
    }

}


public class Test{
    public static void main(String[] args) {
        MyQueue<String> my=new MyQueue<>();
        my.offer("qwer");
        my.offer("asdf");
        my.offer("zxcv");
        System.out.println(my.poll());
        System.out.println(my.peek());
        my.poll();
        my.poll();
        System.out.println(my.isEmpty());
    }
}*/


import java.util.*;

class MyStack<E>{
    private Queue<E> q1;
    private Queue<E> q2;

    public MyStack(){
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }


    //1.入栈操作，就是入q1队列
    public void push(E e){
        q1.offer(e);
    }


    //2.出栈操作（出队列）
    public E pop(){
        while(q1.size()>1){
            q2.offer(q1.poll());
        }
        E ret=q1.poll();
        Queue<E> tmp=q1;
        q1=q2;
        q2=tmp;
        return ret;
    }


    //3.查看栈顶元素
    public E peek(){
        while(q1.size()>1){
            q2.offer(q1.poll());
        }

        E ret=q1.peek();
        q2.offer(q1.poll());
        Queue<E> tmp=q1;
        q1=q2;
        q2=tmp;
        return ret;
    }

    //4.判断栈是否为空
    public boolean empty(){
        return q1.isEmpty();
    }
}


public class Test{
    public static void main(String[] args) {
        MyStack<Integer> my=new MyStack<>();
        my.push(1);
        my.push(2);
        my.push(3);
        System.out.println(my.peek());
        my.pop();
        System.out.println(my.peek());
        my.pop();
        my.pop();
        System.out.println(my.empty());
    }
}

