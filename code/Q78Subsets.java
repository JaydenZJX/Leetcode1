import java.util.ArrayList;
import java.util.List;
/**
 *
 *
 */

public class Solution{
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());

        Arrays.sort(nums);

        for(int i: nums){
            List<List<Integer>> tmp = new ArrayList<>();

            for(List<Integer> sub : res){
                List<Integer> list = new ArrayList<>(sub);

                list.add(i);
                tmp.add(list);
            }

            res.addAll(tmp);
        }

        return res;
    }
}
