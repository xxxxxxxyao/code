class ListNode{
    public int data;     //数据域
    public ListNode prev;  //前驱
    public ListNode next;   //后继


    public ListNode(int data){
        this.data=data;
    }
}//节点类

class DoubleList{
    public ListNode head;
    public ListNode last;

    //头插
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }else{
            node.next=this.head;
            this.head.prev=node;
            this.head=node;
        }
    }


    //尾插
    public void addLast(int data){
        ListNode node=new ListNode(data);
            if(this.head==null){
                this.head=node;
                this.last=node;
            }else{
                this.last.next=node;
                node.prev=this.last;
                this.last=node;
        }
    }

    //打印双向链表
    public void display(){
        if(this.head==null){
            return;
        }
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }


    //获取长度
    public int getLength(){
        ListNode cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //找到index下标
    public ListNode searchIndex(int index){
        if(index<0 || index>getLength()){
            return null;
        }
        ListNode cur=this.head;
        while(index>0){
            cur=cur.next;
            index--;
        }
        return cur;
    }

    //在任意位置插入，第一个数据节点为0号下标
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
        ListNode node=new ListNode(data);
        node.next=cur;
        node.prev=cur.prev;
        cur.prev.next=node;
        cur.prev=node;
        return true;
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
        doubleList.addIndex(3,99);
        doubleList.display();
        doubleList.addFirst(9);
        doubleList.addFirst(8);
        doubleList.addFirst(7);
        doubleList.display();
    }
}
