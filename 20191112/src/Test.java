class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

class MyList{
    public ListNode head;

    public MyList(){
        this.head=null;
    }

    //尾插法建立单链表
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
        }else {
            ListNode cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next=node;
        }

    }


    //链表的回文结构
    public boolean isPalindrome() {
        if(this.head==null){
            return true;
        }

        ListNode fast=this.head;
        ListNode slow=this.head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       //将后半部分进行反转
        ListNode p=slow.next;
        while(p!=null){
            ListNode pnext=p.next;
            p.next=slow;
            slow=p;
            p=pnext;
        }
      //slow往前  head往后    data域不一样返回false   直到相遇
        while(this.head!=slow){
            if(this.head.data!=slow.data){
                return false;
            }
            //偶数情况
            if(this.head.next==slow){
                return true;
            }
            head=head.next;
            slow=slow.next;
        }
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
}



public class Test {
    public static void main(String[] args) {
        MyList my = new MyList();
        my.addLast(1);
        my.addLast(2);
        my.addLast(0);
        my.addLast(2);
        my.addLast(1);
        my.display();
        boolean a=my.isPalindrome();
        if(a==true){
            System.out.println("是回文结构");
        }else{
            System.out.println("不是回文结构");
        }
    }
}
