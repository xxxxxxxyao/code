import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//二叉树返回前序遍历
public class test {
    static List<Integer> list=new ArrayList<>();
    public static void  main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(2);
        root.right.left=new TreeNode(4);
        preorderTraversal(root);
        System.out.println(Arrays.toString(list.toArray()));
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
class TreeNode{
    int val;
    TreeNode(){}
    TreeNode (int val){
        this.val=val;
    }
    TreeNode left;
    TreeNode right;
}
