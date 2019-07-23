import java.util.HashMap;

/**
 * @author syf
 * @date 2019/7/23
 *
 */
public class 复杂链表的复制 {
    /**
     *
     * @param pHead 链表的头结点
     * @return 返回的是复制的链表
     */
    public RandomListNode Clone(RandomListNode pHead)
    {
        /**
         * 步骤：
         *  第一步：将所有的节点通过next复制
         *  第二步：怎么将任意指向的节点复制到链表呢？通过每次从头结点的遍历来实现
         */
        HashMap<RandomListNode,RandomListNode> map = new  HashMap<RandomListNode,RandomListNode>();
        RandomListNode pNode = pHead ;
        //初始化复制链表的头结点
        RandomListNode cloneHead = new RandomListNode(pHead.label);
        RandomListNode cloneNode = cloneHead ;
        map.put(pHead,cloneHead);
        //第一步：将所有的节点复制给复制链表
        while(pNode != null){
            cloneNode.next = new RandomListNode(pNode.next.label);
            pNode = pNode.next ;
            cloneNode = cloneNode.next ;
            map.put(pNode,cloneNode) ;
        }
        //第二步：任意节点的复制
        pNode = pHead ;
        cloneNode = cloneHead ;
        while(cloneNode != null ){
            cloneHead.random = map.get(pNode.random) ;
            pNode = pNode.next;
            cloneNode = cloneNode.next ;
        }
        return cloneHead ;
    }
}
/**
 * 定义的链表
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}