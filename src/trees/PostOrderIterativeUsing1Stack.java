package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderIterativeUsing1Stack {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.left.right=new TreeNode(4);
        root.left.left.right.right=new TreeNode(5);
        root.left.left.right.right.right=new TreeNode(6);
        root.right=new TreeNode(7);
        root.right.left=new TreeNode(8);
        System.out.println(postOrder(root));
    }
    static List<Integer> postOrder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();

        return list;
    }
}
