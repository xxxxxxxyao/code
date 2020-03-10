class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val=val;
    }
}


//根据前序和中序构造二叉树
class Solution {
    int index=0;
    private TreeNode buildTree(int[] preorder,int[] inorder,int left,int right){
        if(index>=preorder.length || left>=right){
            return null;
        }

        //1.在前序遍历结果中找到树的根节点
        // preorder[index];
        //2.在中序中去找根节点的位置
        int rootIdx=left;
        while(rootIdx<right){
            if(preorder[index]==inorder[rootIdx]){
                break;
            }
            rootIdx++;
        }

        TreeNode root=new TreeNode(preorder[index]);

        //递归创建左子树
        ++index;

        root.left=buildTree(preorder,inorder,left,rootIdx);

        //递归创建右子树
        root.right=buildTree(preorder,inorder,rootIdx+1,right);

        return root;

    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,inorder,0,inorder.length);
    }
}



//根据中序和后序还原二叉树

class Solution2 {
    int index=0;
    private TreeNode buildTree(int[] inorder,int left,int right,int[] postorder){
        if(index <0 || left>=right){
            return null;
        }

        //找到根节点
        //postorder[index]
        int rootidx=left;
        while(rootidx<right){
            if(inorder[rootidx]==postorder[index]){
                break;
            }
            ++rootidx;
        }

        //创建树的根节点
        TreeNode root=new TreeNode(postorder[index]);

        //递归创建右子树
        --index;
        root.right=buildTree(inorder,rootidx+1,right,postorder);

        //递归创建左子树
        root.left=buildTree(inorder,left,rootidx,postorder);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=inorder.length-1;
        return buildTree(inorder,0,inorder.length,postorder);
    }
}



