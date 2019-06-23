/*
 方法1：使用递归的方法；
 方法2：非递归的方法。
*/
 public class 合并两个排序的链表{
 	//递归方法
 	public NodeTree merge(NodeTree list1,NodeTree list2){
 		if(list1 == null){
 			return list2;
 		}
 		if(list2 == null){
 			return list1 ;
 		}
 		NodeTree mergeList = null ;
 		if(list1.data < list2.data){
 			mergeList = list1 ;
 			merge(list1.next,list2);
 		}else{
 			mergeList = list2;
 			merge(list1,list2.next);
 		}
 		return mergeList;
 	}
 	//非递归的方法
 	public NodeTree mergeF(NodeTree node1,NodeTree node2){
 		if(list1 == null){
 			return list2;
 		}
 		if(list2 == null){
 			return list1 ;
 		}
 		NodeTree mergeHead = null ;
 		if(node1.data <= node2.data){
 			mergeHead = node1;
 			node1=node1.next;
 		}else{
 			mergeHead = node2 ;
 			node2 = node2.next;
 		}
 		NodeTree cur = mergeHead;
 		while(node1 != null && node2 != null){
 			if(node1.data <= node2.data){
 				cur.next = node1;
 				node1 = node1.next;
 			}else{
 				cur.next = node2;
 				node2 = node2.next;
 			}
 		}
 		if(node1 == null){
 			cur.next = node2;
 		}else if(node2 == null)
 		{
 			cur.next = node1 ;
 		}
 		return mergeHead;
 	}
 }
 //定义链表类
 class NodeTree{
 	Integer data;
 	NodeTree next;
 	public NodeTree(int data){
 		this.data = data ;
 	}
 }
