
//二叉树
//孩子表示法
class Node{
    Node left=null;   //指向节点的左孩子
    Node right=null;  //指向结点的右孩子
    int val;

    public Node(int val) {
        this.val = val;
    }
}

 class BTNode{
    private Node root=null;

    //前序遍历  根 左 右
     public void preorder(Node root){
         if(root != null){
             System.out.print(root.val+" ");
             preorder(root.left);
             preorder(root.right);
         }
     }

}

public class Test{

}
