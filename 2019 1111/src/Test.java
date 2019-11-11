class ListNode{
    public int data;
    public ListNode prev;
    public ListNode next;


    public ListNode(int data){
        this.data=data;
    }
}//节点类

class DoubleList {
    public ListNode head;
    public ListNode last;

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    public void display() {
        if (this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //清空
    public void clear() {
        while (this.head != null) {
            ListNode cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.last = null;
    }
}




public class Test {
    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(1);
        doubleList.addFirst(2);
        doubleList.addFirst(3);
        doubleList.addFirst(4);
        doubleList.addFirst(5);
        doubleList.display();
        System.out.println("-------------");
        doubleList.clear();
        doubleList.display();
    }
}
