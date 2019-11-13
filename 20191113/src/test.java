class ListNode{
    public int data;
    public ListNode pre;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
    }
}//节点类

class DoubleList{
    public ListNode head;
    public ListNode Last;

    //头插
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.Last=node;
        }else{
            node.next=head;
            head.pre=node;
            head=node;
        }
    }

    //尾插
    public void  addLast(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.Last=node;
        }else{
            this.Last.next=node;
            node.pre=Last;
            this.Last=node;
        }
    }

    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}




public class test {
    public static void main(String[] args) {
        DoubleList dou=new DoubleList();
        dou.addFirst(1);
        dou.addFirst(2);
        dou.addFirst(3);
        dou.addFirst(4);
        dou.addFirst(5);
        dou.display();
    }
}
