import java.util.ArrayList;
import java.util.Stack;

public class 前序遍历 {
    public ArrayList<Integer> pre(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null ){
            return list ;
        }
        TreeNode p = root ;
        Stack<TreeNode> stack = new Stack<>();
        while (p!=null || !stack.isEmpty()){
            //1.边遍历边打印
            while (p != null){
                list.add(p.val);
                stack.push(p) ;
                p = p.left ;
            }
            if (!stack.isEmpty()){
                p =stack.peek();
                stack.pop() ;
                p = p.right ;
            }
        }
        return list ;
    }
}
