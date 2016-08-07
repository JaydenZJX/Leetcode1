/**
 *DP
 *不仅要考虑 ＋＋ ＋－ 还要考虑 －－；
 */

public class Solution{
    public int maxProduct(int[] nums){
        if(nums == null || nums.length ==0 ) return 0;

        int max=nums[0];
        int min=nums[0];
        int MaxMax=nums[0];

        for(int i= 1; i < nums.length;i++){
            int tmp = max;

            max=Math.max(Math.max(nums[i], max*nums[i]),min*nums[i]);
            min=Math.min(Math.min(nums[i],temp*nums[i]),min*nums[i]);
            if(max>MaxMax)
                MaxMax=max;
        }
        return MaxMax;
    }
}
