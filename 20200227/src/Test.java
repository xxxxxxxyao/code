//反转链表2

 class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null || m==n){
            return head;
        }

        ListNode left=head;
        ListNode right=head;
        int a=m;
        int b=n;
        ListNode preleft=head;
        while(m-2>0 && preleft!=null){
            preleft=preleft.next;
            m--;
        }
        m=a;
        while(m-1>0 && left!=null){
            left=left.next;
            m--;
        }

        while(n-1>0 && right!=null){
            right=right.next;
            n--;
        }
        ListNode tmp=right.next;
        ListNode tmp1=left;
        ListNode cur=left.next;
        while(left!=right){
            ListNode curnext=cur.next;
            cur.next=left;
            left=cur;
            cur=curnext;
        }
        if(a==1){
            ListNode node=new ListNode(-1);
            node.next=right;
            tmp1.next=tmp;
            return node.next;
        }
        ListNode node=new ListNode(-1);
        node.next=head;
        preleft.next=right;
        tmp1.next=tmp;
        return node.next;

    }
}

public class Test{

}