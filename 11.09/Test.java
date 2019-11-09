//单链表

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


    //清空(内存泄漏问题)
    public void clear(){
        //1.将每一个next域都置为空，JVM自动回收掉没有引用的节点
        while(this.head!=null) {
            ListNode cur = this.head.next;
            this.head.next=null;
            this.head=cur;
        }
        //2.this.head=null;
    }
}     //链表类




public class Test {

    public static void main(String[] args) {
        MyList my1 = new MyList();
        my1.addLast(1);
        my1.addLast(6);
        my1.addLast(8);
        my1.addLast(26);
        my1.addLast(90);
    }
}