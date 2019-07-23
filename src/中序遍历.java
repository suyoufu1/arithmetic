import java.util.ArrayList;
import java.util.Stack;

public class 中序遍历 {
    public ArrayList<Integer> mid(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode p = root ;
        Stack<TreeNode> stack = new Stack<>();
        while (p != null || !stack.isEmpty() ){
            //所有的左子树压栈
            while(p != null){
                stack.push(p);
                p = p.left;
            }
            //左子树遍历完了，是不是要出栈，出栈是不是也要遍历右子树
            if( !stack.isEmpty()){
                p = stack.peek();
                list.add(p.val);
                stack.pop() ;
                p = p.right ;
            }
        }
        return list ;
    }
    public ArrayList<Integer> midD(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root != null){
            midD(root.left);
            list.add(root.val);
            midD(root.right);
        }
        return list ;
    }

}
