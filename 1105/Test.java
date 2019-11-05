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

    //查找倒数第k个
    public ListNode  findKthToTail(int k) {
        if(k<0 ||  k>getLength()){
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
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    public ListNode partition(int x) {
        ListNode cur=this.head;
        ListNode beforestart=null;
        ListNode beforeend=null;
        ListNode afterstart=null;
        ListNode afterend=null;
        while(cur!=null){
            if(cur.data<x){
                if(beforestart==null){
                    beforestart=cur;
                    beforeend=beforestart;
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
               while(cur!=null && cur.data==cur.next.data){
                      cur=cur.next;
               }
               cur=cur.next;
           }else{
               tmp.next=cur;
               cur=cur.next;
               tmp=tmp.next;
           }
       }
       tmp.next=null;
       return node.next;

    }

    //有无环
    public boolean hasCycle(){
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }


    //判断环的入口
    public ListNode detectCycle(){
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        slow=this.head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}

