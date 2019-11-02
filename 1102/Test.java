class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
} //节点类

class MyList{
    public ListNode head;

    public MyList(){
        this.head=null;
    }


    //尾插建立链表
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
        }else{
            ListNode cur=this.head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }

     //打印链表
    public void display(ListNode newhead){
        ListNode cur=newhead;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
}     //链表类




public class Test {

    public static ListNode mergeTwoLists(ListNode headA,ListNode headB) {
        ListNode node=new ListNode(-1);
        ListNode tmp=node;                                   //定义一个虚拟节点，之后依此连接由小到大尾插进来的节点
        while(headA!=null && headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                headA=headA.next;
                tmp=tmp.next;
            }else{
                tmp.next=headB;
                headB=headB.next;
                tmp=tmp.next;
            }
        }

        if(headA!=null){
            tmp.next=headA;
        }
        if(headB!=null){
            tmp.next=headB;
        }
        return node.next;
    }


    public static void main(String[] args) {
        MyList my1 = new MyList();
        my1.addLast(1);
        my1.addLast(6);
        my1.addLast(8);
        my1.addLast(26);
        my1.addLast(90);
        MyList my2 = new MyList();
        my2.addLast(2);
        my2.addLast(10);
        my2.addLast(35);
        my2.addLast(100);
        ListNode node=mergeTwoLists(my1.head,my2.head);
        my1.display(node);
    }
}
