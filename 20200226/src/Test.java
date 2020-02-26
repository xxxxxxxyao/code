//1.整数的反转
class Solution {
    public int reverse(int x) {
        long n=0;
        while(x != 0){
            n=n*10+x%10;
            x=x/10;
        }

        return (int)n==n? (int)n:0;
    }
}


//2.二进制的反转
 class Solution2 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int a=0;
        for(int i=0;i<=31;i++){
            a=a+((1&(n>>i))<<(31-i));
        }
        return a;
    }
}

//3.实现加法
class Solution3 {
    public int getSum(int a, int b) {
        int c=a^b;
        int d=c+((a&b)<<1);
        return d;
    }
}


//4.按奇偶排序数组
class Solution4 {
    public int[] sortArrayByParityII(int[] A) {
        int[] B=new int[A.length];
        int j=0;
        int k=1;
        for(int i=0;i<B.length;i++){
            if(A[i]%2==0){
                B[j]=A[i];
                j=j+2;
            }else{
                B[k]=A[i];
                k=k+2;
            }
        }
        return B;
    }
}



//5.斐波那契
class Solution5 {
    public int fib(int n) {
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }
        int a=0;
        int b=1;
        int c=0;
        while(n-2>=0){
            c=(a+b)%1000000007;
            a=b;
            b=c;
            n--;
        }
        return c;
    }
}

//6.链表反转
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }


class Solution6 {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode pre=null;
        ListNode newhead=null;
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
}