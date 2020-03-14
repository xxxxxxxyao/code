import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left=null;
    TreeNode right=null;

    public TreeNode(int val){
        this.val=val;
    }
}

class BiTree{
    private TreeNode root;

    //快速给出一颗二叉树
    public BiTree(){
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        TreeNode t6=new TreeNode(6);

        root=t1;
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        t3.right=t6;

    }

   /* //1.递归前序遍历
    public void preOrder(){
        preOrder(root);
        System.out.println();
    }



    private void preOrder(TreeNode root){
        if(root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    //2.递归中序遍历
    public void midOrder(){
        midOrder(root);
        System.out.println();
    }


    private void midOrder(TreeNode root){
        if(root != null) {
            midOrder(root.left);
            System.out.print(root.val + " ");
            midOrder(root.right);
        }
    }

    //3.递归后序遍历
    public void postOrder(){
        postOrder(root);
        System.out.println();
    }


    private void postOrder(TreeNode root){
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }
*/


   //1.非递归前序遍历
   public void preOrder(){
       preOrder(root);
       System.out.println();
   }

   private void preOrder(TreeNode root){
       if(root==null){
           return;
       }

       Stack<TreeNode> s=new Stack<>();
       s.push(root);
       while(!s.empty()){
           TreeNode cur=s.peek();
           System.out.print(cur.val+" ");
           s.pop();

           //先将cur的右子树入栈
           if(cur.right!=null){
               s.push(cur.right);
           }

           //再将cur的左子树入栈
           if(cur.left!=null){
               s.push(cur.left);
           }

       }
   }


   //2.非递归中序遍历
    public void midOrder(){
       midOrder(root);
        System.out.println();
    }

    private void midOrder(TreeNode root){
       if(root==null){
           return;
       }

       Stack<TreeNode> s=new Stack<>();
       TreeNode cur=root;

       while(cur!=null || !s.empty()){

           while(cur!=null){
               s.push(cur);
               cur=cur.left;
           }

           cur=s.peek();
           System.out.print(cur.val+" ");
           s.pop();

           cur=cur.right;
       }
   }


   //3.非递归后序遍历
   public void postOrder(){
       postOrder(root);
       System.out.println();
   }

   private void postOrder(TreeNode root){
       TreeNode pre=null;

       if(root==null){
           return;
       }

       TreeNode cur=root;
       Stack<TreeNode> s=new Stack<>();

       while(cur!=null || !s.empty()){
           //保存根的左子树
           while(cur!=null){
               s.push(cur);
               cur=cur.left;
           }

           //获取cur的子树
           TreeNode top=s.peek();

           //遍历top的右子树
           //top的右子树为空，直接遍历
           if(top.right==null || top.right==pre){
               System.out.print(top.val+" ");
               pre=s.pop();
           }
           //top的右子树不为空
           else{
               cur=top.right;
           }
       }
   }

}

public class Test{
    public static void main(String[] args) {
        BiTree b=new BiTree();
        System.out.print("前序遍历结果：");
        b.preOrder();
        System.out.print("中序遍历结果：");
        b.midOrder();
        System.out.print("后序遍历结果：");
        b.postOrder();
    }
}