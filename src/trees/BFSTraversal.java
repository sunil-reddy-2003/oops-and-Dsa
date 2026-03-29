package trees;


import java.util.*;


public class BFSTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        System.out.println(levelOrder(root));
    }

    static List<List<Integer>> levelOrder(TreeNode root)  {
        Queue<TreeNode> queue=new ArrayDeque<>();
        List<List<Integer>> outer=new ArrayList<>();
        if(root==null) return outer;

        queue.offer(root);
        while (!queue.isEmpty()){
            int queueSize= queue.size();
            List<Integer> inner=new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                inner.add(queue.poll().data);
            }
            outer.add(inner);
        }
        return outer;
    }
}
