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


    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
        }else{
            ListNode cur=head;
            while(cur.next!=null) {
                cur = cur.next;
            }
            cur.next=node;
        }

    }

    //查找
    public boolean contains(int key){
        ListNode cur=head;
        while(cur!=null) {
            if (cur.data == key) {
                return true;
            }
            cur=cur.next;
        }
        return false;
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

    //找到index的前一个结点并返回
    private ListNode searchIndex(int index) {
        ListNode cur=this.head;
        int count=0;
        while(count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if(index<0 || index>getLength()){
            System.out.println("插入位置不合理");
            return false;
        }
        if(index==0){
            addFirst(data);
            return true;
        }
        ListNode cur=searchIndex(index);
        ListNode node=new ListNode(data);
        node.next=cur.next;
        cur.next=node;
        return true;
    }

    public void display(){
        ListNode cur=head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //找前驱
    private ListNode searchPrev(int key){
        ListNode pre=this.head;
        while(pre.next!=null){
            if(pre.next.data==key){
                return pre;
            }
            pre=pre.next;
        }
        return null;
    }


    //删除节点
    public void remove(int  key){
        if(this.head==null){
            System.out.println("链表为空");
            return;
        }
        if(this.head.data==key){
            this.head=this.head.next;
            return;
        }
        ListNode pre=searchPrev(key);     //找到要删除节点的前驱
        if(pre==null){
            return;
        }
        pre.next=pre.next.next;
    }
    //删除所有key值
    public void removeAllkey(int key){
        ListNode pre=this.head;
        ListNode cur=this.head.next;
        while(cur!=null){
            if(pre.next.data==key){
                pre.next=cur.next;
                cur=cur.next;
            }else{
                pre=cur;
                cur=cur.next;
            }
        }
        //单独判断头结点是否需要删除
        if(this.head.data==key){
            this.head=this.head.next;
        }
    }


    //反转单链表 ①头插法  ② 定义pre（cur的前驱）  curnext（反转节点下一个节点）   cur(反转节点)  newhead（新节点）
    public  ListNode reverseList(){
        ListNode cur=this.head;
        ListNode newHead=null;
        ListNode pre=null;
        while(cur!=null) {
            ListNode curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
              cur.next=pre;
              pre=cur;
              cur=curNext;
        }
        return newHead;
    }

    public void display2(ListNode newHead){
        ListNode cur=newHead;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //单链表的中间节点
    public ListNode middleNode() {
       ListNode slow=this.head;
       ListNode fast=this.head;
       while(fast != null && fast.next!=null){
           fast=fast.next.next;
           slow=slow.next;
       }
       return slow;
    }

   //查找倒数第k个
   public ListNode  findKthToTail(int k) {
       if (head==null || k <= 0 || k > getLength()) {
           return null;
       }
       ListNode slow = this.head;
       ListNode fast = this.head;
       while (k - 1 > 0) {
           if (fast.next != null) {
               fast = fast.next;
               k--;
           } else {
               System.out.println("没有这个节点");
               return null;
           }
       }
       while (fast.next != null) {
           fast = fast.next;
           slow=slow.next;
       }
       return slow;
   }


}//链表类


public class Test{
    public static void main(String[] args) {
        MySignalList mySignalList = new MySignalList();
        mySignalList.addLast(1);
        mySignalList.addLast(2);
        mySignalList.addLast(3);
        mySignalList.addLast(4);
        mySignalList.addLast(5);
		 ListNode node = mySignalList.findKthToTail(2);
        System.out.println(node.data);

    }
}     //测试类
