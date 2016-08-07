/**
 *loop
 *hash set;
 */


public class Solution{
    public int removeDuplicates(int[] nums){
        if(nums == null || nums.length == 0) return 0;

        int cnt=1;
        for(int i =0;i < nums.length;i++){
            if(nums[cnt-1]<nums[i]){
                nums[cnt]=nums[i];
                cnt++;
            }
        }
        System.out.println(cnt);
        return cnt;
    }
}
