
/*
	定义一个栈（放数据），一个集合（取数据）
	思路：模仿堆栈的过场，有一个原栈，和一个栈的队列，我们先将原栈的元素入栈，在入栈的过程判断是否和队列中的元素相等，
	如果相等的话，在出栈，直到原栈为口。如果不为空，则没有匹配成功。
*/
public class 栈的压入弹出序列{
	public boolean matcher(int[] pushA,int[] popA){
		if(pushA.length != popA.length || pushA.length == 0 || popA.length == 0){
			return false ;
		}
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;
		for (int i = 0 ; i < pushA.length ; i ++) {
			stack.push(pushA[i]);
			while(!stack.empty() && pushA[i] == popA[index]){
				stack.pop();
				index ++;
			}
		}
		return stack.empty();
}