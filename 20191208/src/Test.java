//求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。


/*class Solution {
    public int Sum_Solution(int n) {
        return sum(n);
    }

    int sum(int n){
        try{
            int i=1%n;
            return n+sum(n-1);
        }catch(Exception e){
            return 0;
        }
    }
}



public class Test {

    public static void main(String[] args) {
        int a=NumberOf1(10);
        System.out.println(a);
    }

    public static int NumberOf1(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}*/


//一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。

/*
public class Test {
    public  void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = num ^ array[i];
        }
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if ((array[j] ^ array[k]) == num) {
                    num1[0] = array[j];
                    num2[0] = array[k];
                }
            }
        }
    }
}
*/


import java.util.List;

class ListNode{
    public int val;
    public ListNode next;


    public ListNode(int val){
        this.val=val;
        this.next=null;
    }
}//节点类


class MySignalList {
    public ListNode head;


    public MySignalList() {
        this.head = null;
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }

    }

    public void display2(ListNode newHead) {
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public ListNode deleteDuplication() {
        ListNode node = new ListNode(-1);
        ListNode cur = this.head;
        ListNode tmp = node;
        while (cur != null) {
            if(cur.next != null &&
                    cur.val == cur.next.val) {
                //1、循环
                while (cur.next != null &&
                        cur.val == cur.next.val) {
                    cur = cur.next;
                }
                //2、退出循环 cur要多走一步
                cur = cur.next;
            }else {
                //当前节点 不等于下一个节点的时候
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next = null;
        return node.next;
    }
}

public class Test{
    public static void main(String[] args) {
        MySignalList mySignalList1 = new MySignalList();
        mySignalList1.addLast(1);
        mySignalList1.addLast(1);
        mySignalList1.addLast(2);
        mySignalList1.addLast(3);
        mySignalList1.addLast(3);
        mySignalList1.addLast(4);
        mySignalList1.addLast(5);
        mySignalList1.addLast(5);
        ListNode newhead =mySignalList1.deleteDuplication();
        mySignalList1.display2(newhead);
    }
}
