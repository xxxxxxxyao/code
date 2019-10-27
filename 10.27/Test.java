class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
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
        if(this.head==null){
            this.head=node;
        }else{
            node.next=this.head;
            this.head=node;
        }
    }



    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head==null){
           this.head=node;
        }else{
            ListNode cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }

    //查找
    public boolean contains(int key){
        ListNode cur=head;
        while(cur != null){
           if(cur.data==key){
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
        if(cur != null){
            count++;
            cur=cur.next;
        }
        return count;
    }


    private ListNode searchIndex(int index) {
        ListNode cur = this.head;
        //cur -> index-1
        int count=0;
        while(count < index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if(index <  0 | index > getLength()) {
            System.out.println("index不合法！");
            return false;
        }
        if(index == 0) {
            addFirst(data);
            return true;
        }
        //找到index-1的位置
        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);
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
}//单链表

public class Test{
    public static void main(String[] args) {
        MySignalList mySignalList = new MySignalList();
        mySignalList.addLast(1);
        mySignalList.addLast(2);
        mySignalList.addLast(3);
        mySignalList.addLast(4);
        mySignalList.display();
        mySignalList.addIndex(0,19);
        mySignalList.display();
        mySignalList.addIndex(5,29);
        mySignalList.display();
        mySignalList.addIndex(1,99);
        mySignalList.display();
        /*System.out.println(mySignalList.contains(3));
        System.out.println(mySignalList.contains(13));

        System.out.println(mySignalList.getLength());*/


    }
}






















