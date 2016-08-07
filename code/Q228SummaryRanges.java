/**
 * union
 */

public class Solution{
    public List<String> SummaryRanges(int[] nums){
        List<String> result = new ArrayList<>();
        int len = nums.length;


        for(int i =0; i<nums.length;i++){
            int num = nums[i];

            while(i < len-1 && nums[i]+1= nums[i+1]){
                i++;
            }

            if(num != nums[i]){
                result.add(num + "->" + nums[i]);
            }else{
                result.add(num+"");
            }
        }
        return result;
    }
}
