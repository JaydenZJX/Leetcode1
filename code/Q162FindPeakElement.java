/**
 *
 *binary search;
 *
 */

public class Solution{
    public int findPeakElement(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = (start + end)/2;

            if(nums[mid] < nums[mid+1]){
                start=mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}

//***********************************************

public int findPeakElement(int[] nums){
    return helper(nums, 0, nums.length-1);
}

public int helper(int[] nums, int low, int hight){
    if(low=higth){
        return low;
    }
    else{
        int mid = (hight + low) /2;
        if(nums[mid]<nums[mid+1]){
            return helper(nums, low  ,mid );
        }else{
            return helper(nums, mid+1, higth);
        }
    }
}
