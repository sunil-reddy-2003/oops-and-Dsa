package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderIterative {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(6);
        root.left.right.right=new TreeNode(7);
        System.out.println(inOrder(root));
    }


    static List<Integer> inOrder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null)return list;
        TreeNode node=root;

        while (!stack.isEmpty() || node!=null){
            if (node!=null){
                stack.push(node);
                node=node.left;
            }else {
                node=stack.pop();
                list.add(node.data);
                node=node.right;
            }
        }
        return list;
    }
}
