import java.util.Stack;

public class 二叉搜索树与双向链表 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        TreeNode list = null ;
        Stack<TreeNode> stack = new Stack<>();
        /**
         * 用非递归的方法来实现，则用到栈
         *  思路：二叉搜索树要转化为双向有序链表，首先明确是用什么来遍历
         *   可以知道中序遍历是有序的，那么可以将中序遍历作为转化链表的一种方法
         *    中序遍历的左子树是它的前一个节点，右子树是它的下一个节点；
         *    原先指向左子结点的指针调整为链表中指向前一个结点的指针，
         *    原先指向右子结点的指针调整为链表中指向后一个结点的指针。
         */
        while (pRootOfTree != null || !stack.isEmpty()){
            if(pRootOfTree != null){
                stack.push(pRootOfTree) ;
                //栈的特点是先进后出，所以先让右子树入栈
                pRootOfTree = pRootOfTree.right ;
            }else {
                pRootOfTree = stack.pop() ;
                if(list == null){
                    list = pRootOfTree;
                }else{
                    list.left = pRootOfTree ;
                    pRootOfTree.right = list ;
                    list = pRootOfTree ;
                }
                pRootOfTree = pRootOfTree.left ;
            }
        }
    return list ;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;

    }

}