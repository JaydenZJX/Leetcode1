
import java.util.ArrayList;
import java.util.List;


/**
 *例举grey code序列，并找规律 :
 *n = 0: 0
 *n = 1: 0, 1
 *n = 2: 00, 01, 11, 10  (0, 1, 3, 2)
 *n = 3: 000, 001, 011, 010, 110, 111, 101, 100 (0, 1, 3, 2, 6, 7, 5, 4)
 *当n＝2 可以发现规律， 第三位的数字由
 * 把 1<<n 加上第二位的数字一直到尽头，第四位也一样。
 *一直到index 0 然后继续在从反面做相同的动作在来一次
 *untill to reached n = target(the value you pass to the fucntion)
 */

public class Solution{
    public List<Integer> grayCode(int n){
        List<Integer> list = new ArrayList<>();
        list.add(0);

        for(int i = 0; i < n; i++){
            for(int j = list.size()-1; j >= 0; j--){
                list.add(list.get(j)+ (1 << i));
            }
        }
        return list;
    }
}

