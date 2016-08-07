/**
 *binary search
 */
public class Solution{
    public int search(int[] nums, int target){
        if(nums == null || nums.length==0) return -1;

        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int m= (left+right)/2;

            if(nums[m]== target) return m;

            if(nums[m]>=nums[left]){
                if(target >= nums[left] && target < nums[m]){
                    ri=m-1;
                }else{
                    left=m+1;
                }
            }else{
                if(target >nums[m] && target<= nums[right]){
                    left=m+1;
                }else{
                    right= m-1;
                }
            }
        }
        return -1
    }
}
