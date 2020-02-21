//模拟实现队列,带头结点的单链表模拟

class Node<E>{
    public Node<E> next;
    public E data;

    public Node(E e){
        next=null;
        data=e;
    }

    public Node(){
        next=null;
    }
}


class MyQueue<E>{
    private Node<E> front;
    private Node<E> rear;
    private int size;


    public MyQueue(){
        front=rear=new Node<E>();
        size=0;
    }

    public boolean offer(E e){
        Node<E> node=new Node<>(e);

        rear.next=node;
        rear=rear.next;
        size++;
        return true;
    }


    E poll(){
        if(isEmpty()){
            return null;
        }
        E ret=front.next.data;
        front.next=front.next.next;
        size--;
        return ret;
    }


    E peek(){
        if(isEmpty()){
            return null;
        }
        return front.next.data;
    }


    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }
}

public class Test{
    public static void main(String[] args) {
        MyQueue<Integer> my=new MyQueue<>();
        my.offer(2);
        my.offer(3);
        my.offer(4);
        System.out.println(my.peek());
        System.out.println(my.size());
        System.out.println(my.poll());
        System.out.println(my.peek());
    }
}