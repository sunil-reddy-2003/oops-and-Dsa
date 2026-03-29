package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderIterativeUsing2Stacks {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.left.right=new TreeNode(7);
        root.right.left.right.right=new TreeNode(8);

    }

    static List<Integer> postOrder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();

        if (root==null)return list;
        stack1.push(root);

        while (!stack1.isEmpty()){
            TreeNode node=stack1.pop();
            stack2.push(node);

            if(node.left!=null){
                stack1.push(node.left);
            }
            if(node.right!=null){
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()){
            list.add(stack2.pop().data);
        }
        return list;
    }
}
