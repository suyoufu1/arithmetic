/**
	题目描述
	输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
	例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
*/
public class 顺时针打印矩阵{
	public int [][] Shunshi(int[][] matrix){
		int r = matrix.lenght()-1;
		int c = matrix[0].lenght()-1;
		int[][] shuShi = new [r+1][c+1];
		if(r == 0 || c == 0){
			return null;
		}
		//定义了左右上下的初始值
		int left = 0,right = c ,top = 0, bottum = r;
		while(left < right && top < bottum){
			//1.从左之右(列变，行不变)
			for(int i = left ; i <= right ; i ++){
				shuShi[top][i] = matrix[top][i];
			}
			//2.从上到下(列不变，行变)
			for(int i = top+1 ; i <= bottum ; i ++){
				shuShi[i][right] = matrix[i][right];
			}	
			if(top!=bottum){//防止单行的情况
				//3.从右到左(列变，行不变)
				for(int i = right - 1 ; i >= left ; i --){
					shuShi[bottum][i] = matrix[bottum][i];
				}
			}
			if(left!=right){//防止单列的情况
				//4.从下到上(列不变，行变)
				for(int i = bottum -1 ; i > top ; i --){
					shuShi[i][left] = matrix[i][left];
				}
			}
			left ++;
			right --;
			top ++;
			bottum --;
		}
		return shuShi;
	}
	public static void main(String[] args) {
		
	}
}