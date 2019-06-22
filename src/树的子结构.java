public class 树的子结构{
	public boolean IsSubtra(NodeTree root1,NodeTree root2){
		//root1表示是A树的根，root2表示是B树的根
		if(root2==null||roo1==null){
			return false;
		}
		/*
		if(root1 == root2){
			IsSubtra(root1.left,root2.left);
			IsSubtra(root1.right,root2.right);
			return true;
		}else{
			IsSubtra(root1,root2.left);
			IsSubtra(root1,root2.right);
			return true;
		}*/

		return IsSubtra(root1,root2)||hasSubtra(root1,root2.left)||hasSubtra(root1,root2.right); 
	}
	public boolean hasSubtra(NodeTree root1,NodeTree root2){
		if(root2==null){
			return true;
		}
		if(root1==null){
			return false;
		}
		if(root1.data==root2.data){
			return IsSubtra(root1.left,root2.left)&&IsSubtra(root1.right,root2.right);
		}else{
			return false;
		}
	}
}
class NodeTree{
	Integer data ;
	NodeTree left = null;
	NodeTree right = null;
	public NodeTree(Integer data){
		this.data = data ;
	}
}