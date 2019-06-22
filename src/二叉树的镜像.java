/*
题目描述

操作给定的二叉树，将其变换为源二叉树的镜像。

*/
public class 二叉树的镜像{
	public void mirror(NodeTree root){
		if(root == null){
			return ;
		}
		if(nodeList.left == null && nodeList.right == null){
			return ;
		}
		NodeTree temp = new NodeTree();
		temp = root.left ;
		root.left = root.right;
		root.right = temp ;
		if(root.left!=null){
			mirror(root.left);
		}
		if(root.right!=null){
			mirror(root.right);
		}
	}
}
//定义二叉树类
class NodeTree{
	Integer Date ;
	NodeTree left = null;
	NodeTree right = null;
	public NodeTree(Integer data){
		this.data = data ;
	}
}