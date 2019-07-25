import java.util.ArrayList;
import java.util.TreeSet;

public class 最小的k个数 {
    public static void main(String[] args) {
        最小的k个数 function = new 最小的k个数();
        ArrayList<Integer> list = new ArrayList<>();
        int[] input = {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 4;
        list = function.GetLeastNumbers_Solution2(input, k);
        System.out.println(list);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input.length == 0 || k == 0 || k > input.length) {
            return list;
        }
        int flag = 0;
        //最简单的思路：先排序，然后在把前k个保存下来
        for (int i = 0; i < input.length; i++) {
            flag = 0;
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] >= input[j + 1]) {
                    flag = 1;
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(" " + input[i]);
        }
        System.out.println();
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    /**
     * 快排的思想
     *
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution1(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input.length == 0 || k == 0 || k > input.length) {
            return list;
        }
        int low = 0;
        int heigt = input.length - 1;
        int index = parpation(input, low, heigt);
        while (index != k - 1) {
            if (index > k - 1) {
                heigt = index - 1;
            } else {
                low = index + 1;
            }
            index = parpation(input, low, heigt);
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    private int parpation(int[] input, int low, int heigt) {
        int p = input[low];
        while (low < heigt) {
            while (low < heigt && input[heigt] >= p) {
                heigt--;
            }
            input[low] = input[heigt];
            while (low < heigt && input[low] <= p) {
                low++;
            }
            input[heigt] = input[low];
        }
        input[low] = p;
        return low;
    }

    public ArrayList<Integer> GetLeastNumbers_Solution2(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input.length == 0 || k == 0 || k > input.length) {
            return list;
        }
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < input.length; i++) {
            //TreeSet会自动排序
            tree.add(input[i]);
        }
        int i = 0;
        for (Integer element : tree) {
            if (i >= k) {
                break;
            }
            list.add(element);
            i++;
        }
        return list;
    }
}
