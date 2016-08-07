/*
 */
public class Solution{
    public int removeElement(int[] nums, int val){
        int initail = 0;

        for(int i =0;i < nums.length; i++){
            if(nums[i]!= val){
                nums[initail]=nums[i];
                initail++;
            }
        }
        return initail;
    }
}
