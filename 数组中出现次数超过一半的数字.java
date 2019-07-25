import java.util.ArrayList;

public class 数组中出现次数超过一半的数字 {
    public static void main(String[] args) {
        数组中出现次数超过一半的数字 res = new 数组中出现次数超过一半的数字();
        int[] array = {1,2,3,2,2,2,2,2,4};
        int s =res.MoreThanHalfNum_Solution1(array);
        String m = "ok";
        String t = new String("ok");
        System.out.println("equals:"+t.equals(m));
        System.out.println("class:"+t+m);
        //==表示的是是否指向同一个对象，也就是引用同一个对象
        System.out.println("class:"+t.getClass().toString()+" ; "+m.getClass().getName());
        System.out.println("hashcode:"+"t:"+t.hashCode()+"; m:"+m.hashCode());
        //System.out.println(s);
        ArrayList<Object> list = new ArrayList<>();
        list.trimToSize();
        Object[] o =list.toArray();
    }
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0){
            return 0 ;
        }
        int m = array.length / 2 ;

        for(int i = 0 ; i < array.length ; i ++){
            int  num = 0;
            for (int j = i + 1 ; j < array.length ; j ++){
                if(array[i] == array[j]){
                    num ++ ;
                }
            }
            if(num >= m){
                return array[i];
            }
        }
        return 0;
    }
    public int MoreThanHalfNum_Solution1(int [] array){
        int count =  1 ;
        int res = array[0] ;
        for(int i = 1 ; i<array.length ; i ++){
            if(0 == count){
                res = array[i];
                count = 1 ;
                continue;
            }
            if(array[i]==res){
                count ++;
            }else {
                count -- ;
            }
        }
       if(check(array,res)){
           return res;
       }
        return 0;
    }

    private boolean check(int[] array, int res) {
        int num = 0 ;
        for(int i = 0 ; i< array.length ; i ++){
            if(res == array[i]){
                num ++;
            }
        }
        if(array.length/2 < num){
            return true ;
        }
        return false;
    }
}
