import sun.reflect.generics.tree.Tree;

import java.util.*;



//1.队列最大值
/*class MaxQueue {
    private Queue<Integer> q;
    private Deque<Integer> d;
    public MaxQueue() {
        q=new LinkedList<>();
        d=new LinkedList<>();
    }

    public int max_value() {
        if(q.isEmpty()){
            return -1;
        }
        return d.peek();
    }

    public void push_back(int value) {
        q.offer(value);
        while(!d.isEmpty() && value>d.peekLast()){
            d.pollLast();
        }
        d.offer(value);
    }

    public int pop_front() {
        if(q.isEmpty()){
            return -1;
        }

        int ret=q.poll();
        if(ret==d.peek()){
            d.poll();
        }
        return ret;
    }
}*/




//2.层序遍历

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> l=new ArrayList<>(size);
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                l.add(cur.val);

                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
            }
            list.add(l);
        }
        return list;
    }
}



