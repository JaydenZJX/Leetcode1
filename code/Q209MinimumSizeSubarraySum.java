


public class Solution{
    public int minSubArrayLen(int s, int[] nums){
        if(nums == null || nums.length == 0)
            return 0;
        int start = 0;
        int minlen = Integer.MAX_VALUE;
        int sum = 0;

        for(int end = 0; end < nums.length; end++){
            sum +=nums[end];
            while(sum >= s){
                minlen = Math.min(minlen, end - start + 1);
                sum -=nums[start];
                start++;
            }
        }
        return minlen = Integer.MAX_VALUE? 0:minlen;
    }
}
