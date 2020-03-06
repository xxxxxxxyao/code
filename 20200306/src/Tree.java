import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class BTNode{
    int val;
    BTNode left;
    BTNode right;

    public BTNode(int val) {
        this.val = val;
    }
}


public class Tree {
    private BTNode root;

    //快速给出一颗二叉树
    public  Tree(){
        BTNode n1=new BTNode(1);
        BTNode n2=new BTNode(2);
        BTNode n3=new BTNode(3);
        BTNode n4=new BTNode(4);
        BTNode n5=new BTNode(5);
        BTNode n6=new BTNode(6);
        root=n1;
        n1.left=n2;
        n1.right=n4;
        n2.left=n3;
        n2.right=n5;


    }

    //前序非递归遍历1
    public void preOrder(){
        if(root==null){
            return;
        }

        Stack<BTNode> s=new Stack<>();
        s.push(root);

        while(!s.empty()){
            BTNode cur=s.peek();
            System.out.print(cur.val+" ");
            s.pop();

            if(cur.right!=null){
                s.push(cur.right);
            }

            if(cur.left!=null){
                s.push(cur.left);
            }
        }
        System.out.println();
    }


    //前序非递归遍历2
    public void preOrder2() {
        Stack<BTNode> s = new Stack<>();
        s.push(root);

        while (!s.empty()) {
            BTNode cur = s.peek();
            s.pop();

            while (null != cur) {
                System.out.print(cur.val + " ");

                if (cur.right != null) {
                    s.push(cur.right);
                }

                cur = cur.left;
            }

        }
        System.out.println();
    }



    //判断二叉树是否为完全二叉树
    public boolean iscomtree(){
        if(root==null){
            return true;
        }

        //1.非空树
        //找第一个不饱和的节点，只有一个孩子的节点，或者叶子节点
        //按照层序遍历的方式找
        Queue<BTNode> q=new LinkedList<>();
        q.offer(root);
        boolean isleaf=false;
        while(!q.isEmpty()){
              BTNode cur=q.poll();

              if(isleaf) {
                  if (null != cur.left || null != cur.right) {
                      return false;
                  }
              }
                  else{
                    //cur左右孩子均存在
                    if(cur.left!=null && cur.right!=null){
                        q.offer(cur.left);
                        q.offer(cur.right);
                    }else if(cur.left!=null){
                        q.offer(cur.left);
                        isleaf=true;   //找到了不饱和节点
                    }else if(cur.right!=null){
                        return false;  //只有右孩子
                    }else{
                        //cur为叶子节点
                        isleaf=true;
                    }
              }
        }
        return true;
    }


    public static void main(String[] args) {
        Tree t=new Tree();
        t.preOrder2();
        boolean s=t.iscomtree();
        System.out.println(s);
    }
}
