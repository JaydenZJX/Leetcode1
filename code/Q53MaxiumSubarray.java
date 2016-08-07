/**
 *same as the best time to buy ans sell sotck;
 * greedy algri;
 */
public class Solution{
    public int maxSubArray(int[] nums){
        if(0 == nums.length){
            System.out.println("i could not find max sub max array here");
            return 0;
        }
        int maxSoFar=nums[0], maxEndingHere=nums[0];
        for(int i= 1;i < nums.length;i++){
            maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
}
