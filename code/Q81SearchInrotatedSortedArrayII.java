


/**
 *
 */

public class Solution{
    public boolean search(int[] nums, int target){
        int start = 0, end = nums.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target) return true;

            //left unsotred. right sorted;
            if(nums[mid] < nums[start] || nums[mid] < nums[end]){
                if(nums[mid] < target && nums[end] >= target){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }else if(nums[mid] > nums[start] || nums[mid] > nums[end]){
                if(target < nums[mid] && target >= nums[start]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                end--;
            }
        }
        return false;
    }
}
