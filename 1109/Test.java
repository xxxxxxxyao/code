//双向链表

class ListNode{
    public int data;
    public ListNode prev;
    public ListNode next;


    public ListNode(int data){
        this.data=data;
    }
}//节点类


class DoubleList{
    public ListNode head;
    public ListNode last;

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }


    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    public void display() {
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //获取长度
    public int getLength(){
        int count=0;
        ListNode cur=head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    private ListNode searchIndex(int index) {
        if(index<0 || index>getLength() || this.head==null){
            return null;
        }
         ListNode cur=this.head;
         while(index>0){
             cur=cur.next;
             index--;
         }
         return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
         if(index==0){
             addFirst(data);
             return true;
         }
         if(index==getLength()){
             addLast(data);
             return true;
         }
        ListNode cur=searchIndex(index);
         if(cur==null){
             return false;
         }
         ListNode node=new ListNode (data);
         node.next=cur;
         cur.prev.next=node;
         node.prev=cur.prev;
         cur.prev=node;
         return true;
    }

    //清空
    public void clear(){
        while(this.head != null){
            ListNode cur=this.head.next;
            this.head.prev=null;
            this.head.next=null;
            this.head=cur;
        }
        this.last=null;
    }

}


public class Test {
    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addLast(1);
        doubleList.addLast(2);
        doubleList.addLast(3);
        doubleList.addLast(4);
        doubleList.addLast(5);
        doubleList.addIndex(0,99);
        doubleList.display();
    }
}
