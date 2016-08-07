/**
 * bucket sort, when  A[i] != i+1 , swap A[i] with A[A[i]-1]
 * untill to A[i]== A[A[i]-1];
 */

public class Solution{
    public int firstMissingPositive(int[] nums){
        int i =0;
        while(i<nums.length){
            if(nums[i]==i+1 || nums[i]<= 0||nums[i]>nums.length) i++;
            else if(nums[nums[i]-1] != nums[i]) swap(nums, i, nums[i]-1);
            else i++;

        }
        i=0;

        while(i<nums.length && nums[i] == i+1){
            i++;
        }
        return i+1;
    }

    public void swap(int[] nums,int i, int j){
        int tmp = nums[i];
        nums[i]= nums[j];
        nums[j]= tmp;
    }
}
