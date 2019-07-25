public class 连续子数组的最大和 {
    public static void main(String[] args) {
        连续子数组的最大和 max = new 连续子数组的最大和();
        int[] array = {-2,-8,-1,-5,-9};
        int mMax = max.FindGreatestSumOfSubArray(array) ;
        System.out.println(mMax);
    }
    public int FindGreatestSumOfSubArray(int[] array) {

        if(array.length == 0 ){
            if(array[0] > 0){
                return array[0];
            }else {
                return -1 ;
            }
        }
        int left  = 0 ;
        int right = array.length  ;
        int mid =(left + right) / 2 ;
        int leftSum = 0 , leftMax = -100 ;
        for (int i = mid-1 ; i >= left ; i --){
            leftSum += array[i] ;
            if(leftSum > leftMax){
                leftMax = leftSum ;
            }
        }
        int rightSum = 0 , rightMax = -100 ;
        for(int i = mid ;  i < right ; i ++){
            rightSum += array[i];
            if(rightMax < rightSum){
                rightMax = rightSum ;
            }
        }
        int Max1 = leftMax > rightMax ? leftMax : rightMax ;
        int sum = leftMax + rightMax ;
        return   sum  > Max1 ? sum : Max1;
    }
    public int FindGreatestSumOfSubArray1(int[] array) {
        //暴力法
        int thisSum = 0 ;
        int maxSum = -100 ;
        for(int i  = 0 ; i < array.length ; i ++){
            thisSum = 0 ;
            for(int j = i ; j < array.length; j ++){
                thisSum += array[j];
                if(thisSum > maxSum){
                    maxSum = thisSum ;
                }
            }
        }
        if(maxSum <= 0 ){
            return -1 ;
        }
        return maxSum ;
    }
}
