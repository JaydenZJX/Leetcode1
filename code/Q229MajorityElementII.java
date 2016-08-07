

/**
 *选举法
 */

public class Solution{
    public List<Integer> majorityElement(int[] nums){
        List<Integer> ans = new ArrayList<>();

        if(nums.length == 0)
            return ans;

        int element1 = nums[0],element2 = nums[0], count1 = 0, count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == element1){
                count1++;
            }else if(nums[i] == element2){
                count2++;
            }else if(count1 == 0){
                element1 = nums[i];
                count1 = 1;
            }else if(count2 == 0){
                element2 = nums[i];
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i: nums){
            if(i == element1 )
                count1++;
            if(i == element2)
                count2++;
        }

        if(count1 > nums.length/3){
            ans.add(element1);
        }
         if(count2 > nums.length / 3 && !ans.contains(element2)){
            ans.add(element2);
        }

        return  ans;
    }
}
