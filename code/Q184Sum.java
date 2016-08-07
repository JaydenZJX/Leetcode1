import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Highlight;

/**
 *
 * 3 sum
 */

public class Solution{
    public List<List<Integer>> fourSum(int[] nums, int target){
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(nums.length < 4) return ans;
        
        Arrays.sort(nums);
        for(int i=0; i < nums.length-3; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j < nums.length-2; j++){
                if(j>i+1 && nums[j]== nums[j-1]) continue;
                int low = j + 1, hight = nums.length-1;

                while(low < hight){
                    int sum = nums[i]+nums[j]+nums[low]+nums[hight];

                    if(sum == target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[low],nums[hight]));
                        while(low <hight && nums[low] == nums[low+1])
                            low++;
                        while(low <hight && nums[hight]== nums[hight-1])
                            hight--;

                        low++;
                        hight--;

                    }else if(sum < target) low++;
                    else hight--;
                }
            }
        }
        return ans;
    }
}
