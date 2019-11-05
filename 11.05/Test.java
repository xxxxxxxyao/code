import java.util.List;

class ListNode{
    public int data;
    public ListNode next;


    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}//节点类

class MySignalList {
    public ListNode head;


    public MySignalList() {
        this.head = null;
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }

    }


    //创造一个环
    public void cycle(){
        ListNode cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=this.head.next.next;
    }

    //有无环
    public boolean hasCycle(){
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

     //判断环的入口
    public ListNode detectCycle(){
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
        }
        slow=this.head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}

public class Test {
        public static void main(String[] args) {
            MySignalList my = new MySignalList();
            my.addLast(1);
            my.addLast(5);
            my.addLast(76);
            my.addLast(12);
            my.addLast(16);
            my.cycle();
            boolean i=my.hasCycle();
            if(i==true){
                System.out.println("有环");
            }else{
                System.out.println("没有环");
            }
            ListNode node=my.detectCycle();
            System.out.println(node.data);
        }
}
