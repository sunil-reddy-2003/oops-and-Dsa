package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.right=new TreeNode(7);
        root.left.right=new TreeNode(4);
        root.left.right.left=new TreeNode(5);
        root.left.right.right=new TreeNode(6);
        System.out.println(preOrder(root));
    }

    static List<Integer> preOrder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null) return list;
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode node=stack.pop();
            list.add(node.data);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
    return list;
    }
}
