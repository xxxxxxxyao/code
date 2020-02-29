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


    public int getklevel(int k){
        return getklevel(root,k);
    }

    private int getklevel(Node root,int k){
        if(k<1 || root == null){
            return 0;
        }

        if(k==1){
            return 1;
        }

        return getklevel(root.left,k-1)+getklevel(root.right,k-1);
    }


    public int leafnode(){
        return leafnode(root);
    }

    private int leafnode(Node root){
        if(root == null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;

        }

        return leafnode(root.left)+leafnode(root.right);
    }

    public void midorder(){
        midorder(root);
        System.out.println();
    }

    public int getNodecount(){
        return getNodecount(root);
    }

    private int getNodecount(Node root){
        if(root==null){
            return 0;
        }

        return 1+getNodecount(root.left)+getNodecount(root.right);
    }

    //中序遍历
    private void midorder(Node root){
        if(root != null){
            midorder(root.left);
            System.out.print(root.val+" ");
            midorder(root.right);
        }
    }

    //后序遍历
    public void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val+" ");
        }
    }


    public static void main(String[] args) {
        BTtree bt=new BTtree();
        bt.midorder();
        int a=bt.getNodecount();
        System.out.println(a);
        System.out.println(bt.leafnode());
        System.out.println(bt.getklevel(3));
    }
}