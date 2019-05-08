

public class 数组中重复数字 {
    public static void main(String[] args) {
        int[] number = {2,1,3,0,2,5};
        int[] extra = new int[1];
        numberEqual(number,extra);
        System.out.println(extra[0]);
    }
    /**
     * 数组中的重复的数字：
     * 我们用什么方法解决呢，在这里要求时间复杂度是O(n)
     * 解决方案：
     *        我们给定一个数组，那么这个数组中的每个元素对应着唯一的下标，
     *        我们可以将这个判断下标与这个元素是否相等，
     *         if(下标值!=元素值）{
     *             交换位置；//将元素看做下标，此下标对应着某一个元素值，与当前下标的元素交换位置。
     *         }else{//下标值==元素值
     *             开辟一个数组空间，将这个元素值放到这个数组中
     *         }
     */
    public static boolean numberEqual( int[] number , int[] extra){
        if(number.length <= 0 ||number ==null){
            return false;
        }
        for(int i = 0 ; i < number.length ; i ++){
            while(number[i] != i) {
               // System.out.println(number[i]);
                if (number[i] == number[number[i]]) {
                    extra[0] = number[i];
                    return true;
                }
                swap(number , i , number[i]);
            }

        }
        return false;
    }

    private static void swap(int[] number, int i, int j) {
        int temp = number[i] ;
        number[i] = number[j] ;
        number[j] = temp ;
    }
}
