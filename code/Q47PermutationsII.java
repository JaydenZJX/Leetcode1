public class Solution{
    public List<List<Integer>> permuteUnique(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<>();
        boolean[] visit = new boolean[nums.length];
        permuting(result, cur, nums, visit);
        return result;
    }


    public void permuting(List<List<Integer>> result, List<Integer>  cur,int[] nums ,boolean[] visit){
        if(cur.size() == nums.length){
            result.add(new ArrayList<Integer>(cur));
            return;
        }

        for(int i = 0; i < visit.length; i++){
            if(!visit[i]){
                if(i > 0 && nums[i]==nums[i - 1] && visit[i - 1]){
                    return;
                }
                visit[i] = true;
                cur.add(nums[i]);
                permuting(result,cur, nums, visit);
                cur.remove(cur.size()-1);
                visit[i] = false;
            }
        }
    }
}
