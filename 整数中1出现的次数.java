public class 整数中1出现的次数 {
    public static void main(String[] args) {
        整数中1出现的次数 numB = new 整数中1出现的次数();
        int num = numB.NumberOf1Between1AndN_Solution(534);
        System.out.println(num);
    }
    public int NumberOf1Between1AndN_Solution1(int n) {
        int num = 0 ;
         for(int i = 1 ; i <= n ; i ++){
             if(i % 10 == 1){
                 num ++;
             }
             if(i/10%10 == 1){
                 num ++;
             }
             if(i/10/10 ==1){
                 num ++;
             }
             if(i/10/10%10 == 1){
                 num ++ ;
             }
             if(i/10/10/10/10 == 1){
                 num ++ ;
             }
         }
         System.out.println(30001/10/10/10/10);
         return num ;
    }
    public int NumberOf1Between1AndN_Solution(int n) {
        int num = 0;
        for(int i = 1 ; i <= n ; i ++){
            num += getNum(i);
        }
        return num ;
    }

    private int getNum(int i) {
        String str = String.valueOf(i);
        int sum = 0;
        for(int k = 0 ; k < str.length() ; k ++){
            char m = str.charAt(k);
            if(m == '1'){
                sum += 1 ;
            }
        }
        return sum ;
    }
}
