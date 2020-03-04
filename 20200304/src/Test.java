class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

public class Test {
}


//1.相同的树
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}



//2.子树相同
class Solution2{

    public boolean issame(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null){
            return false;
        }

        if(p.val!=q.val){
            return false;
        }

        return issame(p.left,q.left) && issame(p.right,q.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){
            return false;
        }

        if(t==null){
            return true;
        }

        if(issame(s,t)){
            return true;
        }

        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
}