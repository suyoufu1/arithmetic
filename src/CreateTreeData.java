public class CreateTreeData {
    public TreeNode creatTreeeNode(TreeNode root) {
        root = new TreeNode(4);
        root.left = new TreeNode(2) ;
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5) ;
        return root;
    }
}
