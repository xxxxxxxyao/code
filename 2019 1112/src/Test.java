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
        ListNode node=new ListNode(data);
       if(this.head==null){
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
        ListNode cur=this.head;
        while(cur.next!=null){
            if(cur.next.data==key){
                return cur;
            }
            cur=cur.next;
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
     if(this.head.data==key){
         this.head=this.head.next;
     }
    }


    //反转单链表 ①头插法  ② 定义pre（cur的前驱）  curnext（反转节点下一个节点）   cur(反转节点)  newhead（新节点）
    public  ListNode reverseList(){
       ListNode cur=this.head;
       ListNode pre=null;
       ListNode newhead=null;

       while(cur!=null){
           ListNode curnext=cur.next;
           if(curnext==null){
               newhead=cur;
           }
               cur.next = pre;
               pre = cur;
               cur = curnext;
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
        if(k<0 || k>getLength()){
            return null;
        }

        ListNode fast=this.head;
        ListNode slow=this.head;
        while(k-1>0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }else{
                return null;
            }
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    //对单链表进行排序（比x大的放在右边，比x小的放在左边，顺序不变）
    public ListNode partition(int x) {
       ListNode beforestart=null;
       ListNode beforeend=null;
       ListNode afterstart=null;
       ListNode afterend=null;
       ListNode cur=this.head;
       while(cur!=null){
           if(cur.data<x){
               if(beforestart==null){
                   beforestart=cur;
                   beforeend=beforeend;
               }else{
                   beforeend.next=cur;
                   beforeend=beforeend.next;
               }
           }else{
               if(afterstart==null){
                   afterstart=cur;
                   afterend=afterstart;
               }else{
                   afterend.next=cur;
                   afterend=afterend.next;
               }
           }
           cur=cur.next;
       }

       if(beforestart==null){
           return afterstart;
       }
       beforeend.next=afterstart;
       if(afterstart!=null){
           afterend.next=null;
       }
       return beforestart;
    }

    //删除重复的节点，前提是有序
    public ListNode deleteDuplication() {
        ListNode node=new ListNode(-1);
        ListNode cur=this.head;
        ListNode tmp=node;

        while(cur!=null){
            if(cur.next!=null && cur.data==cur.next.data){
                while(cur.next!=null  && cur.data==cur.next.data){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                tmp.next=cur;
                cur=cur.next;
                tmp=tmp.next;
            }
        }
        return node.next;
    }

    //创造一个环
    public void cycle(){
        ListNode cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=this.head.next;
    }



    //有无环
    public boolean hasCycle(){
        ListNode slow=this.head;
        ListNode fast=this.head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }


    //判断环的入口
    public ListNode detectCycle(){
        ListNode slow=this.head;
        ListNode fast=this.head;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        slow=this.head;
        while(fast!=slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}//链表类


public  class Test{
    public static ListNode  getIntersectionNode (ListNode headA,ListNode headB){
        if(headA == null || headB == null) {
            return null;
        }
        //永远指向最长的单链表
        ListNode pL = headA;
        //永远指向最短的单链表
        ListNode pS = headB;
        int lenA = 0;
        int lenB = 0;
        //分别求长度
        while(pL!=null){
            lenA++;
            pL=pL.next;
        }
        while(pS!=null){
            lenB++;
            pS=pS.next;
        }
        pL=headA;
        pS=headB;
        //求长度的差值
        int len = lenA-lenB;
        //如果是负数-》pL = headB;  pS = headA
        if(len<0){
            pL=headB;
            pS=headA;
            len=lenB-lenA;
        }
        //只需要让pL走len步就好了
                /*int count=0;
                while(count<len){
                        pL=pL.next;
                        count++;
                }*/

        while(len>0){
            pL=pL.next;
            len--;
        }
        //走完len步之后  两个同时开始走
        //一直走 走到next值相同时 就是交点
        while(pL!=pS && pL!=null) {
            pL = pL.next;
            pS = pS.next;
        }

        //万一没有相交，且两个单链表长度一样
        if(pL == pS && pS != null) {
            return pL;
        }

        return null;
    }

    public static void createCut(ListNode headA,ListNode headB) {
        headA.next.next = headB.next.next;
    }

    //合并两个有序链表
    public static ListNode mergeTwoLists(ListNode headA,ListNode headB) {
        ListNode node=new ListNode(-1);
        ListNode tmp=node;
        while(headA != null && headB !=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                headA=headA.next;
                tmp=tmp.next;
            }else{
                tmp.next=headB;
                headB=headB.next;
                tmp=tmp.next;
            }
        }

        if(headA != null){
            tmp.next=headA;
        }
        if(headB!=null){
            tmp.next=headB;
        }
        return node.next;
    }


    public static void main(String[] args) {
        MySignalList mySignalList1= new MySignalList();
        mySignalList1.addLast(1);
        mySignalList1.addLast(4);
        mySignalList1.addLast(6);
        mySignalList1.addLast(7);
        mySignalList1.addLast(99);
        ListNode node=mySignalList1.reverseList();
        mySignalList1.display2(node);
    }
}//测试类
