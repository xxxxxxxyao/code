//链表
class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

class MysList{
    public ListNode head;

    public MysList(){
        this.head=null;
    }

    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            head=node;
        }else{
        node.next=head;
        head=node;
		}
    }

    //尾插
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            head=node;
        }else{
        head.next=node;
		}
    }

    public boolean contains(int key){
        ListNode cur=head;
       while(cur!=null){
           if(cur.data==key){
               return true;
           }
           cur=cur.next;
       }
       return false;
    }

    //获取长度
    public int getLength(){
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //找到index的前一个结点并返回
    private ListNode searchIndex(int index) {
        int count=0;
        ListNode cur=head;
        while(count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }

    public boolean addIndex(int index,int data){
        if(index<0 || index>getLength()){
            System.out.println("插入位置不合理");
            return false;
        }
        if(index==0){
            addFirst(data);
            return true;
        }
        ListNode node=new ListNode(data);
        ListNode cur=searchIndex(index);
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
}


public class Test2 {
    public static void main(String[] args) {
        MysList mySignalList = new MysList();
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
    }
}
