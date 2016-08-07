/**
 *bit shift;
 *0^n=n  n^n=0  nums［i］＝n
 *
 */
public class Solution{
    public int singleNumber(int[] nums){
        int ans=0;
        int len=nums.length;
        for (int i: nums){
            ans^=nums[i];
        }
        return ans;
    }
}
