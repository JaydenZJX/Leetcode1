
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


/**
 *
 *DFS backtracking
 *
 */

public class Solution{
    public List<List<Integer>> combinationSum(int[] candidates , int target){
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        List<Integer> path = new ArrayList<>();

        dfs(candidates,path,result,target,0);

        return result;
    }

    public static void dfs(int[] nums, List<Integer> path, List<List<Integer>> result,
                           int gap, int start){

        if(gap == 0 ){
            result.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i = start; i < nums.length; i++){
            if(gap < nums[i])
                return;

            path.add(nums[i]);
            dfs(nums,path,result,gap-nums[i],i);

            path.remove(path.size()-1);
        }
    }
}
