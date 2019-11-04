import java.util.List;

//节点定义
class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

//链表定义
class MyList {
    public ListNode head;

    public MyList() {
        this.head = null;
    }

    //尾插
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            ListNode cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //对单链表进行排序（比x大的放在右边，比x小的放在左边，顺序不变）
    public ListNode partition(int x) {
        ListNode cur=this.head;
        ListNode beforeStart=null;
        ListNode beforeEnd=null;
        ListNode afterStart=null;
        ListNode afterEnd=null;
        while(cur!=null){
            if(cur.data<x){
                //判断是否第一次插入
                if(beforeStart==null){
                    beforeStart=cur;
                    beforeEnd=beforeStart;
                }else{
                    beforeEnd.next=cur;
                    beforeEnd=beforeEnd.next;
                }

            }else{
                //判断是否第一次插入
                if(afterStart==null){
                    afterStart=cur;
                    afterEnd=afterStart;
                }else{
                    afterEnd.next=cur;
                    afterEnd=afterEnd.next;
                }
            }
            cur=cur.next;
        }
        if(beforeStart==null){
            return afterStart;
        }
        beforeEnd.next=afterStart;
        if(afterStart!=null){
            afterEnd.next=null;
        }
        return beforeStart;
    }

    public void display(ListNode newHead) {
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}



public class Test {
    public static void main(String[] args) {
        MyList my = new MyList();
        my.addLast(4);
        my.addLast(81);
        my.addLast(30);
        my.addLast(3);
        my.addLast(11);
        my.addLast(23);
        ListNode cur=my.partition(15);
        my.display(cur);
    }
}
