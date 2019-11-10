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
}






public class Test {

       //找链表的相交
    public static ListNode  getIntersectionNode (ListNode headA,ListNode headB){
        if(headA==null || headB==null){
            return null;
        }
            //定义一个指针永远指向那个长的的单链表
            ListNode pl=headA;
            //定义一个指针永远指向短的那个单链表
            ListNode ps=headB;
            int lenA=0;
            int lenB=0;
            //分别求两个单链表的长度
            while(pl!=null){
                lenA++;
                pl=pl.next;
            }
            while(ps!=null){
                lenB++;
                ps=ps.next;
            }
            pl=headA;
            ps=headB;
            //求两个链表的差值
            int len=lenA-lenB;
            if(len<0){
                pl=headB;
                ps=headA;
                len=lenB-lenA;
            }
            //让pl先走len步
            while(len>0){
                pl=pl.next;
                len--;
            }

            //走完len步之后  两个同时开始走
            //一直走 走到next值相同时 就是交点
            while(pl!=ps && pl!=null){
                pl=pl.next;
                ps=ps.next;
            }
            if(pl==ps && ps!=null){
                return pl;
            }
            return null;
        }
    //构造相交节点
    public static void createCut(ListNode headA,ListNode headB) {
        headA.next.next = headB.next.next;
    }

        public static void main(String[] args) {
        MySignalList mySignalList1= new MySignalList();
        mySignalList1.addLast(1);
        mySignalList1.addLast(4);
        mySignalList1.addLast(6);
        mySignalList1.addLast(7);
        mySignalList1.addLast(99);
        MySignalList mySignalList2= new MySignalList();
        mySignalList2.addLast(2);
        mySignalList2.addLast(31);
        mySignalList2.addLast(9);
        mySignalList2.addLast(155);
        createCut(mySignalList1.head,mySignalList2.head);
        ListNode node=getIntersectionNode(mySignalList1.head,mySignalList2.head);
        System.out.println(node.data);
    }
}
