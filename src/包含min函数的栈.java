/**
解题思路：我们有一个栈，需要将最小的元素放入栈中，那么我们可以定义两个栈空间；
第一个栈用于放原元素，第二个放最小的元素：
5 3 10 2 12 1 
5 3 3  2  2 1
*/
public class 包含min函数的栈{
	Stack<Integer> stack = new Stack<Integer>();//放原元素的栈
	Stack<Integer> temp = new Stack<Integer>();//放最小元素的栈
	public int min = Integer.MAX_VALUE;
	public void push(int node){
		stack.push(node);
		if(min>node){
			temp.push(node);
			min=node;
		}else{
			temp.push(min);
		}
	}
	public void pop(){
		stack.pop();
		temp.pop();
	}
	public int top(){
		int t = stack.pop();
		stack.push(t);
		return t;
	}
	public int min(){
		int m = temp.pop();
		temp.push(m);
		return m;
	}
	public static void print(){
		包含min函数的栈 sMin = new 包含min函数的栈();
		sMin.push(5);
		sMin.push(2);
		sMin.push(10);
		sMin.push(12);
		sMin.push(2);
		sMin.push(1);
		sMin.push(8);
		System.out.println(temp);
	}
	public static void main(String[] args) {
		print();
	}
}
