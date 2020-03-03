class Node{
    int val;
    Node left=null;
    Node right=null;

    public Node(int val) {
        this.val = val;
    }
}


class BTtree{
    Node root=null;

    //快速给出一颗二叉树
    public  BTtree(){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);
        root=n1;
        n1.left=n2;
        n1.right=n4;
        n2.left=n3;
        n4.left=n5;
        n4.right=n6;

    }


    //找值返回结点
    private Node find(Node root,int val){
        if(root==null){
            return null;
        }

        if(root.val==val){
            return root;
        }

        Node ret=null;

        if(null != (ret=find(root.left,val)) || null != (ret=find(root.right,val))){
            return ret;
        }
        return null;
    }

    public Node find(int val){
        return find(root,val);
    }



    //求二叉树深度
    public int getheight(Node root){
        if(root==null){
            return 0;
        }

        int leftheight=getheight(root.left);
        int rightheight=getheight(root.right);
        return leftheight>rightheight? leftheight+1:rightheight+1;
    }

}



//平衡二叉树代码
class Solution {

    public int leftheight(Node root){
        if(root==null){
            return 0;
        }

        int leftheight=leftheight(root.left);
        int rightheight=leftheight(root.right);
        return leftheight>rightheight? leftheight+1:rightheight+1;
    }


    public boolean isBalanced(Node root) {
        if(root==null){
            return true;
        }

        int h1=leftheight(root.left);
        int h2=leftheight(root.right);

        if(Math.abs(h1-h2)>1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
}