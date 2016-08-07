/**
 *最笨的方法；
 spacial case n =0 n =1 n=2;
 int max=0;
 for(int i =0; i<nums.length;i++){
    for(int j=i+1,j<nums.length;j++){
        if(nums[i]+ nums[j]> max)
        max= (nums[i]+ nums[j];

    }
 }

 ****************
 *Dp
 *这是一个多阶段最优化问题，且要走到最底部才能知道答案，
 *因此广搜排除，只剩下贪心和动规。贪心明显要排除，只剩下动规。
 *设状态 f[i] 为到位置i时能抢到的金钱最大和，那么状态转移方程如下：
 *f[i]=max(f[i-1], f[i-2] + nums[i])
 *其含义是，如果不选择i，则抢到的钱是f[i-1]，如果选择i，则能抢到的钱是f[i-2] + nums[i]。
 */

public class Solution{
    public int rob(int[] nums){
        if(nums== null || nums.length==0) return 0;

        if(nums.length ==1 ) return nums[0];

        int [] dp = new int[nums.length];

        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length; i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
