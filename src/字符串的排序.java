import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 字符串的排序 {
    private static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        字符串的排序 res = new 字符串的排序();
        String str = "aa";
        list = res.Permutation(str);
        System.out.println(list);
    }
    public ArrayList<String> Permutation(String str) {

        if(str.length() == 0 || str ==""){
            return list ;
        }
        char[] ch = str.toCharArray();

        perA(ch,0,str.length()-1);
        Collections.sort(list);
        return list ;
    }

        private void perA(char[] chStr, int k, int m) {
        if(k == m ){
            list.add(new String(chStr));
        }else {
            for(int j = k ; j <= m ; j ++){
                if( j != k && chStr[j] == chStr[k]) {
                    continue;
                }
                swap(chStr,j,k);
                perA(chStr,k+1,m);
                swap(chStr,k,j);
            }
        }
    }

    private void swap(char[] chStr, int k, int j) {
        char temp = chStr[k];
        chStr[k] = chStr[j];
        chStr[j] = temp ;
    }

}
