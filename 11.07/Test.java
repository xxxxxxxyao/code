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

    //尾插
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

    public void display(ListNode newhead){
        ListNode cur=newhead;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }


    //删除重复的节点
    public ListNode deleteDuplication() {
        ListNode node=new ListNode(-1);
        ListNode cur=this.head;
        ListNode tmp=node;
        while(cur!=null){
            if(cur.next!=null && cur.data==cur.next.data){
                //1、循环
                //2、退出循环 cur要多走一步
                while(cur.next!=null && cur.data==cur.next.data){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                //当前节点 不等于下一个节点的时候
                tmp.next=cur;
                tmp=tmp.next;
                cur=cur.next;
            }
        }
        return node.next;
    }
}

public class Test {
    public static void main(String[] args) {
        MyList my = new MyList();
        my.addLast(4);
        my.addLast(4);
        my.addLast(4);
        my.addLast(4);
        my.addLast(8);
        my.addLast(67);
        ListNode head=my.deleteDuplication();
        my.display(head);
    }
}
