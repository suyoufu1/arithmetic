import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Stack;

public class 后序遍历 {
    public ArrayList<Integer> post(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return  list ;
        }
        TreeNode p = root ;
        TagNode tagNode = new TagNode();
        Stack<TagNode> stack = new Stack<>();
        while (p != null){
            tagNode.node = p ;
            //表示左子树被访问过
            tagNode.tag = Tag.left ;
            stack.push(tagNode);
            p = p.left ;
        }
        tagNode = stack.peek();
        stack.pop() ;
        //左子树访问过，还需要进入右子树
        if(tagNode.tag == Tag.left){
            //表示右子树被访问过
            tagNode.tag = Tag.right ;
            stack.push(tagNode);
            p = tagNode.node ;
            p = p.right ;
            System.out.println(p.val);
        }else {
            list.add(tagNode.node.val);
            System.out.println(tagNode.node.val);
            p = null ;
        }
        return list ;
    }
    public ArrayList<Integer> postD(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        if(root != null ){
            postD(root.left);
            postD(root.right);
            list.add(root.val);
        }
        return list ;
    }

}
enum  Tag{
    left ,
    right ;
}
class TagNode{
    TreeNode node ;
    Tag tag ;
}