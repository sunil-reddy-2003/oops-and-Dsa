package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Pair{
    TreeNode node;
    int val;

    public Pair(TreeNode node, int val) {
        this.node = node;
        this.val = val;
    }
}
public class DFSTraversalsUsingSingleStack {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        allThreeTraversals(root);

    }
    static void allThreeTraversals(TreeNode root){
        List<Integer> preOrder=new ArrayList<>();
        List<Integer> inOrder=new ArrayList<>();
        List<Integer> postOrder=new ArrayList<>();

        Stack<Pair> stack=new Stack<>();
        stack.push(new Pair(root,1));

        while (!stack.isEmpty()){
            Pair pair =stack.pop();


            if(pair.val==1){
                preOrder.add(pair.node.data);
                pair.val++;
                stack.push(pair);
                if(pair.node.left!=null){
                    stack.push(new Pair(pair.node.left,1));
                }
            } else if (pair.val==2) {
                inOrder.add(pair.node.data);
                pair.val++;
                stack.push(pair);
                if(pair.node.right!=null){
                    stack.push(new Pair(pair.node.right,1));
                }
            } else {
                postOrder.add(pair.node.data);
            }
        }

        System.out.println("preOrder: "+preOrder);
        System.out.println("inOrder: "+inOrder);
        System.out.println("postOrder: "+postOrder);
    }
}
