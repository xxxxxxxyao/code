class Node{
    public int data;
    public Node next;
    public Node random;

    public Node(int data,Node next,Node random){
        this.data=data;
        this.next=next;
        this.random=random;
    }
}//节点类


class MyList{
    public Node head;

    public Node copyRandomList(Node head) {
        if(this.head==null){
            return null;
        }

        //1.将链表串起来
        Node cur=head;
        while(cur!=null){
            Node node=new Node(cur.data,cur.next,null);
            Node tmp=cur.next;
            cur.next=node;
            cur=tmp;
        }

        //2.修改指针
        cur=head;
        while(cur!=null){
            if(cur.random!=null) {
                cur.next.random = cur.random.next;
            }else{
                cur.next.random=null;
            }
            cur=cur.next.next;
        }

        //3.拆分链表
        cur=head;
        Node newhead=cur.next;
        while(cur.next!=null){
            Node tmp=cur.next;
            cur.next=tmp.next;
            cur=tmp;
        }
        return newhead;
    }
}

class Test {
}
