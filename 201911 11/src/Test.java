class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}//节点类


class MyLinkList{
    public ListNode head;

    public MyLinkList(){
        this.head=null;
    }


    //尾插法建立
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

    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //清空单链表
    public void clear(){
        //1.将每一个next域都置为空，JVM自动回收掉没有引用的节点
        while(this.head!=null){
            ListNode cur=this.head.next;
            this.head.next=null;
            this.head=cur;
        }
    }
}


public class Test {
    public static void main(String[] args) {
        MyLinkList my = new MyLinkList();
        my.addLast(3);
        my.addLast(4);
        my.addLast(5);
        my.addLast(6);
        my.display();
        System.out.println("------------");
        my.clear();
        my.display();
        System.out.println("------------");
    }
}
