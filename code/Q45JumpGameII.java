


/**
 *DP
 */

public class Solution{
    public int jump(int[] nums){
        int reachable = 0;
        int edg = 0;
        int minStep = 0;

        for(int  i = 0 ; i < nums.length-1; i++){
            reachable = Math.max(reachable, i+nums[i]);
            if(i == edg){
                minStep++;
                edg = reachable;
            }
        }
        return minStep;
    }
}
