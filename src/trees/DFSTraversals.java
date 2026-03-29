package trees;


 public  class DFSTraversals {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(8);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.right.left=new TreeNode(9);
        root.right.right.right=new TreeNode(10);

        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.print("End");
        System.out.println(" ");

        System.out.print("InOrder: ");
        inOrder(root);
        System.out.print("End");
        System.out.println(" ");

        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.print("End");

    }
    static void preOrder(TreeNode node){
        if(node==null) return;
        System.out.print(node.data+"->");
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(TreeNode node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.data+"->");
        inOrder(node.right);
    }

    static  void postOrder(TreeNode node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+"->");
    }
}
