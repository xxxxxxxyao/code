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


    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            this.head=node;
        }else{
            node.next=this.head;
            this.head=node;
        }
    }

    //尾插法
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

    //查找
   public boolean contains(int key){
        ListNode cur=this.head;
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
        ListNode cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //找到index的前一个结点并返回
    public ListNode search(int index){
        ListNode cur=this.head;
        int count=0;
        while(count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }

    //任意位置插入，第一个下标为0
    public boolean addIndex(int index,int data){
       if(index<0 || index>getLength()){
           System.out.println("位置不合理");
           return false;
       }
       if(index==0){
           addFirst(data);
           return true;
       }
       ListNode cur=search(data);
       ListNode node=new ListNode(data);
       node.next=cur.next;
       cur.next=node;
       return true;
    }


    //找值为key的前驱
    public ListNode searchPre(int key){
        ListNode cur=this.head;
        while(cur.next!=null){
            if(cur.next.data==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }

    //删除结点
    public void remove(int key){
        if(this.head==null){
            System.out.println("链表为空");
            return;
        }
        if(this.head.data==key){
            head=head.next;
            return;
        }
        ListNode pre=searchPre(key);
        if(pre==null){
            System.out.println("值不存在");
            return;
        }
        pre.next=pre.next.next;
    }

    //删除所有key值
    public void removeAll(int key){
        ListNode cur=this.head.next;
        ListNode pre=this.head;
        while(cur!=null){
            if(pre.next.data==key){
                pre.next=cur.next;
                cur=cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        if(this.head.data==key){
            this.head=head.next;
        }
    }


    public ListNode reverList(){
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

    //单链表的中间节点
    public ListNode middleNode() {
        ListNode slow=this.head;
        ListNode fast=this.head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    public void display(){
        ListNode cur=this.head;
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
        my.addLast(3);
        my.addLast(4);
        int a=my.getLength();
        System.out.println(a);
        my.display();
    }
}
