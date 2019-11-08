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

    //反转
    public  ListNode reverseList(){
        ListNode cur=this.head;
        ListNode newhead=null;
        ListNode pre=null;
        while(cur!=null){
            ListNode curnext=cur.next;
            if(curnext==null){
                newhead=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=curnext;
        }
        return newhead;
    }

    public void display2(ListNode newHead){
        ListNode cur=newHead;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}




public class Test {
    public static void main(String[] args) {
        MySignalList mySignalList1 = new MySignalList();
        mySignalList1.addLast(1);
        mySignalList1.addLast(4);
        mySignalList1.addLast(6);
        mySignalList1.addLast(7);
        mySignalList1.addLast(56);
        ListNode cur= mySignalList1.reverseList();
        mySignalList1.display2(cur);
    }
}
