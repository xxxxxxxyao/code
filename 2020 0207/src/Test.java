class Node{
    public int data;
    public Node next;
    public Node random;

    public Node(int data,Node next,Node random){
        this.data=data;
        this.next=next;
        this.random=random;
    }
}


class Mylist{
    public Node head;

    public Node copyRandomList(Node head){
        if(this.head==null){
            return null;
        }

        //1.将新老结点串起来
        Node cur=head;
        while(cur!=null){
            Node node=new Node(cur.data,cur.next,null);
            Node tmp=cur.next;
            cur.next=node;
            cur=tmp;
        }


        //2.解决random指针指向问题
        cur=head;
        while(cur!=null){
            if(cur.random != null){
                cur.next.random=cur.random.next;
            }else{
                cur.next.random=null;
            }
            cur=cur.next.next;
        }


        //3.拆分链表
        cur=head;
        Node newHead=cur.next;
        while(cur.next != null){
            Node tmp=cur.next;
            cur.next=tmp.next;
            cur=tmp;
        }
        return newHead;
    }
}