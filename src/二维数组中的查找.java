public class 二维数组中的查找 {
    public static void main(String[] args) {
        int[][] number = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 10;
        boolean bl =arrayL(number , target) ;
        System.out.println(bl);
    }
    /**
     * 二维数组的查找，一般方法：穷举法 时间复杂度为O(n2)
     */
    public static boolean arrayList(int[][] number , int target){
        if(number[0] == null || number[0].length <= 0){
            return false;
        }
        for(int i = 0 ; i < number.length ; i ++){
            for(int j = 0 ; j <number[0].length ; j ++){
                if(number[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * 时间复杂度要求是O(M+N),其中M行数，N是列数，空间要求是O(1)
     *   方案：我们观察，这个二维数组是从左到右是递增，从上到下也是递增
     *          那么，我们可以从较大的数作比较，这样可以缩小搜索的范围。
     *          我们知道左上是较小的数，右下是较大的数，索性我们从右面开始搜索。
     *          定义：r行，c列，r=0,c=N-1;
     *          while(r < M-1 & c >= 0){
     *              if(target == number[r][c]){
     *                  return ture;
     *              }else if(target > number[r][c]){
     *                  r ++ ;//此时目标数大于数组的数，因此我们舍弃小的数，继续搜索大的数
     *              }else{
     *                  c -- ;//同理，舍弃大的数，搜索小的数
     *              }
     *          }
     */
    public static boolean arrayL(int[][] number , int target){
        if(number == null || number.length <= 0 || number[0] == null || number[0].length <= 0){
            return false;
        }
        int row = number.length ;
        int col = number[0].length;
        int r = 0 ,c =col - 1 ;
        while(r < row - 1 && c >= 0){
            if(target == number[r][c]){
                return true;
            }else if(target > number[r][c]){
                r ++;
            }else {
                c --;
            }
        }
        return false;
    }
}
